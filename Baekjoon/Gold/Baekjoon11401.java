import java.util.*;
public class Main {
	static long MOD = 1000000007;
	static long Factorial(int n) {
		long sum=1;
		for(int i=1; i<=n; i++) {
			sum=(sum*i)%MOD;
		}
		return sum;
	}
	static long power(long a, long b) {
		if(b==1) {
			return a;
		}
		long before = power(a,b/2)%MOD;
		long now = before*before%MOD;
		if(b%2==0) {
			return now;
		}else {
			return now*a%MOD;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A = Factorial(N),B = Factorial(K),C = Factorial(N-K);
		long D = B*C%MOD;
		System.out.println(A*power(D,MOD-2)%MOD);
}}
