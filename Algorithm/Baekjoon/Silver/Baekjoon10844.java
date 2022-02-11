import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double mod = 1000000000;
		Double[][] dp=new Double[N][10];
		for(int i=1; i<10;i++)dp[0][i]=1.0;
		dp[0][0]=0.0;
		for(int i=0; i<N;i++) {
			for(int j=0; j<10; j++) {
				if(dp[i][j]==null) {
				if(j==0)dp[i][j]=dp[i-1][1]%mod;
				else if(j==9)dp[i][j]=dp[i-1][8]%mod;
				else dp[i][j]=(dp[i-1][j+1]+dp[i-1][j-1])%mod;}}}
		double sum=0;
		for(int i=0; i<10;i++)sum+=dp[N-1][i]%mod;
		System.out.println(String.format("%.0f",sum%mod));}}


// import java.util.Scanner;
// public class Main {
// 	static Long[][] dp;
// 	static int N;
// 	final static long MOD = 1000000000;
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);	
// 		N = in.nextInt();
// 		dp = new Long[N + 1][10];
// 		for(int i = 0; i < 10; i++) {
// 			dp[1][i] = 1L;
// 		}
// 		long result = 0;
// 		for(int i = 1; i <= 9; i++) {
// 			result += recur(N, i);
// 		}
// 		System.out.println(result % MOD);
// 	}
// 	static long recur(int digit, int val) {		
// 		if(digit == 1) {
// 			return dp[digit][val];
// 		}
// 		if(dp[digit][val] == null) {
// 			if(val == 0) {
// 				dp[digit][val] = recur(digit - 1 ,1);
// 			}
// 			else if(val== 9) {
// 				dp[digit][val] = recur(digit - 1, 8);
// 			}
// 			else {
// 				dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
// 			}
// 		}
// 		return dp[digit][val] % MOD;
// 	}
// }
