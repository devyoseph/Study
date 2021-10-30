import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] dp = new Integer[N+1];
		dp[1]=0;
		for(int i=2;i<N+1;i++) {
				if(i%2==0&&i%3==0) {
					dp[i]=Math.min(Math.min(dp[i/2], dp[i/3]),dp[i-1])+1;
				}else if(i%2==0) {
					dp[i]=Math.min(dp[i/2],dp[i-1])+1;
				}else if(i%3==0) {
					dp[i]=Math.min(dp[i/3],dp[i-1])+1;
				}else {
					dp[i]=dp[i-1]+1;}}
		System.out.print(dp[N]);}}

// import java.util.Scanner;
// public class Main {
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
// 		Integer[] dp = new Integer[N+1];
// 		dp[0]=0; dp[1]=0;
// 		for(int i=2;i<N+1;i++) {
// 			dp[i]=Math.min(dp[i/2]+i%2,dp[i/3]+i%3)+1;
// 		}
// 		System.out.print(dp[N]);
// }}
