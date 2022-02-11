import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int min=1;
		int max=arr[N-1]-arr[0]+1;
		while(min<max) {
			int count = 1;
			int mid = (min+max)/2;
			int start = arr[0];
			for(int i=0;i<N;i++) {
				if(arr[i]>=start+mid) {
					count++;
					start=arr[i];
				}
			}
			if(count>=C) {
				min=mid+1;
			}else {
				max=mid;
			}
		}
		System.out.print(min-1);
}}
