import java.util.*;
public class Main {
	static int[][] dp= new int[1001][1001];
	static int P(int N, int K) {
		if(dp[N][K]==0) {
			if(K==0 || N==K) {
				dp[N][K]=1;
			}else {
				dp[N][K]=(P(N-1,K)+P(N-1,K-1))%10007;
			}
		}
		return dp[N][K];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		System.out.print(P(N,K));
}}
