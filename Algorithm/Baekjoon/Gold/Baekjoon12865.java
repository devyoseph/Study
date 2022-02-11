import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static Double dp[][];
	static int[][] thing;
	static Double knapsack(int N, int K) {
		if(N<=0 || K<0)return dp[0][0]; //K<=0이 아님을 주의한다 K=0일 때 0이상의 값을 가질 수 있다
		else if(dp[N][K]==null) {
			if(K>=thing[N][0]) { //K보다 현재 물건의 무게가 클 경우 연산할 수 없도록 한다
			dp[N][K] = Math.max(knapsack(N-1,K), knapsack(N-1,K-thing[N][0])+thing[N][1]);
			}else{
				dp[N][K] = knapsack(N-1,K);
			}
			}
		return dp[N][K];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		thing = new int[N+1][2]; //0에는 무게, 1에는 가치
		dp = new Double[N+1][K+1];
		dp[0][0]=0.0;
		
        for(int i=1;i<N+1;i++){
			st = new StringTokenizer(br.readLine()," ");
			thing[i][0]=Integer.parseInt(st.nextToken());
			thing[i][1]=Integer.parseInt(st.nextToken());
		} //배열에 입력값을 집어넣는다
	
		System.out.println(String.format("%.0f", knapsack(N,K)));
	}
}
