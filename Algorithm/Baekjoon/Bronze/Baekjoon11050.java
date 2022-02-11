import java.util.*;
public class Main {
    static int Fac(int N) {
		if(N<=1)return 1;
		return Fac(N-1)*N;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.print(Fac(N)/Fac(K)/Fac(N-K));
}}
