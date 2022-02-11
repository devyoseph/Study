import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static Integer[][] dp;
	static int[] score;
	public static int stair(int N, int jump) { //1: 현재항에서 점프를 해야만 한다면
		if(N==0) {
			return dp[0][jump];
		} else if(N==-1) {
			return 0;
		}
		if(dp[N][jump]==null) {
			switch(jump) { 
			case 0: dp[N][jump]=Math.max(stair(N-1,1)+score[N], stair(N-2,0)+score[N]);break;
			case 1: dp[N][jump]=stair(N-2,0)+score[N];break;
			}
		}
		return dp[N][jump];
	}
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int N = Integer.parseInt(br.readLine());
	score = new int[N]; 
	dp = new Integer[N][2]; //0: N항에서 점프하지 않고 시작
	for(int i=0; i<N;i++) {
		st = new StringTokenizer(br.readLine()," ");
			score[i]=Integer.parseInt(st.nextToken());
	}
	dp[0][0]=score[0];
	dp[0][1]=score[0];
	System.out.print(Math.max(stair(N-1,0), stair(N-1,1)));
	}
}
