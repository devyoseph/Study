import java.util.*;
public class Main {
	static double Factorial(double N) {
		if(N==1)return 1;
		return Factorial(N-1)*N;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			Double N = sc.nextDouble();
			Double M = sc.nextDouble();
			Double diff = M-N+1;
			Double sum=1.0;
			for(double i=diff;i<=M;i++) {
				sum*=i;
			}
			for(double i=N;i>1;i--) {
				sum/=i;
			}
			System.out.println(String.format("%.0f", sum));
		}
}}
