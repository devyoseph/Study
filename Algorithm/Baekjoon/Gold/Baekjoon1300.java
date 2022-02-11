import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k =sc.nextInt();
		int min=1;
		int max=k;
		int answer=0;
		while(min<=max) {
			int count=0;
			int mid=(min+max)/2;
			for(int i=1;i<=N;i++) {
				count+=Math.min(mid/i, N);
				if(mid/i==0) {
					i=N+1;
				}
			}
			if(count>=k) {
				max=mid-1;
				answer=mid;
			}else {
				min=mid+1;
			}
		}
		System.out.print(answer);
}}
