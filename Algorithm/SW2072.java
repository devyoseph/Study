import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int tc=1;
		while(T-->0) {
			int sum=0;
			for(int i=0;i<10;i++) {
				int x = sc.nextInt();
				sum+=(x%2==0?0:x);
			}
			System.out.println("#"+tc+" "+sum);
			tc++;
		}
}}
