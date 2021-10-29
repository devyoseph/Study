import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		int[][] triangle = new int[500][500]; //[500][500] 배열 생성
		Integer[][] dp = new Integer[n][500]; //제한조건에서 n의 최대는 500이다
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<i+1;j++) {
				triangle[i][j]=Integer.parseInt(st.nextToken());
			}
		} //triangle 배열에 입력값들을 모두 넣어준다
        
		dp[0][0]=triangle[0][0]; //dp[0][0]은 삼각형 맨 꼭대기므로 값이 정해져있다
        
		int max=dp[0][0]; //주의)1줄일 때 반복문이 실행 안되므로 max의 처음값은 0이 아닌 dp[0][0]
        
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(dp[i][j]==null) {
                
					if(j==0) { //줄에서 맨 처음
						dp[i][j]=dp[i-1][j]+triangle[i][j];
                       
					}else if(j==i) { //줄에서 맨 끝
						dp[i][j]=dp[i-1][j-1]+triangle[i][j];
                        
					}else { //그 외
						dp[i][j]=Math.max(dp[i-1][j-1]+triangle[i][j],dp[i-1][j]+triangle[i][j]);
					}
					max=Math.max(max, dp[i][j]);
				}
			}
		}
		System.out.print(max);
	}
}
