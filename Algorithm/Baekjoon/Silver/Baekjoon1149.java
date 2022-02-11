import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static Integer[][] dp;
	static int[][] cost;
	public static int House(int N, int color) {
	if(N==0) {
		return dp[0][color]; // N=0일 때는 dp배열의 값을 리턴
	}
	if(dp[N][color]==null) {
		switch(color) { //Math.min을 통해 재귀로 비교해 값을 가져온다
		case 0: dp[N][color]=Math.min(House(N-1,1)+cost[N][color], House(N-1,2)+cost[N][color]);break;
		case 1: dp[N][color]=Math.min(House(N-1,0)+cost[N][color], House(N-1,2)+cost[N][color]);break;
		case 2: dp[N][color]=Math.min(House(N-1,0)+cost[N][color], House(N-1,1)+cost[N][color]);break;
		}
	}
		return dp[N][color];
	}
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int N = Integer.parseInt(br.readLine());
	cost = new int[N][3]; //0:R, 1:G, 2:B
	dp = new Integer[N][3];
	for(int i=0; i<N;i++) {
		st = new StringTokenizer(br.readLine()," ");
		for(int j=0; j<3; j++) {
			cost[i][j]=Integer.parseInt(st.nextToken());
		}
	} //cost 배열 안에 입력값들 넣어주기
	
	dp[0][0]=cost[0][0];
	dp[0][1]=cost[0][1];
	dp[0][2]=cost[0][2];
	//초기값 넣어주기

	System.out.print(Math.min(House(N-1,0), Math.min(House(N-1,1), House(N-1,2))));
	}
 
}
