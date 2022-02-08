import java.io.*;
import java.util.*;

public class Main {
	static int[] arr;
	static int now=1;
	static StringBuilder sb = new StringBuilder();
	static void pop() {
		sb.append(arr[1]+"\n");
		if(arr[1]!=0) {
			arr[1] = arr[--now];
			arr[now] = 0;
			
			int parent = 1;
			while(true) {
				int c1 = parent*2;
				int c2 = parent*2+1;
                
                if(c1>=now) break;
                
				if(arr[c1]<=arr[c2] && arr[parent]<arr[c2]) {
					int tmp = arr[parent];
					arr[parent] = arr[c2];
					arr[c2] = tmp;
                    parent = c2;
				}else if(arr[c1]>arr[c2] && arr[parent]<arr[c1]) {
					int tmp = arr[parent];
					arr[parent] = arr[c1];
					arr[c1] = tmp;
                    parent = c1;
				}else {
					break;
				}
			}
		}
	}
	static void push(int input) {
		arr[now] = input;
		int child = now;
		int parent = child/2;
		now++;
		while(parent>0) {
			if(arr[child] <= arr[parent]) break;
			int tmp = arr[child];
			arr[child] = arr[parent];
			arr[parent] = tmp;
			child = parent;
			parent = child/2;
		}
		
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	//N개의 원소가 있을 때 배열의 개수? 당연히 N개지
	arr = new int[100001];
	// 1의 자식
	// 2  3
	// 4  5  6  7
	// 임의의 number 의 자식은 number *2 , number * 2 + 1
	while(N-->0) {
		int input = sc.nextInt();
		if( input == 0) {
			pop();
		}else {
			push(input);
		}
	}
	System.out.println(sb.toString());
}
}
