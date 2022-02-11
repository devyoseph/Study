import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum=0;
		while(N!=0) {
			N=N/5;
			sum+=N;
		}
		System.out.print(sum);
}}
