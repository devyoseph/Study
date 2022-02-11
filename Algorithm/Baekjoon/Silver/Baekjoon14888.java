import java.io.*;
import java.util.*;
public class Main {
	static int[] arr;
	static int[] cal;
	static int min=1000000000; //범위 -10억~+10억
	static int max=-1000000000;
	
    static void backtracking(int number,int Depth, int print){
		if(Depth==print) { //깊이에 도달하면 최대최소를 기록
			min=Math.min(min,number);
			max=Math.max(max,number);
		}
		for(int j=0;j<4;j++) { //현재 깊이에서는 4종류의 시도가 가능하다
				if(cal[j]>0) { //남은 연산자의 수가 0보다 커야 연산할 수 있다
					cal[j]=cal[j]-1; //사용한 연산자를 빼주고
					
                    switch(j) { //j값에 따라 연산 방법이 달라진다
					case 0: backtracking(number+arr[Depth+1],Depth+1,print); break;
					case 1: backtracking(number-arr[Depth+1],Depth+1,print); break;
					case 2: backtracking(number*arr[Depth+1],Depth+1,print); break;
					case 3: backtracking(number/arr[Depth+1],Depth+1,print); break;
					}
					cal[j]=cal[j]+1; //다시 더해준다
				}
		}
	}
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N]; //숫자배열
		cal = new int[4]; //연산자배열
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			cal[i]=sc.nextInt();
		}
		backtracking(arr[0], 0,N-1);
		System.out.println(max);
		System.out.println(min);
}}
