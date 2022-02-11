import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int N = Integer.parseInt(br.readLine());
	int[] index= new int[501]; //값을 저장하는 배열, 충분한 크기로 만들어준다
	int[] dp = new int[501]; //LIS값 저장
	
	for(int i=1; i<N+1;i++) {
		st = new StringTokenizer(br.readLine()," ");
		index[Integer.parseInt(st.nextToken())]=Integer.parseInt(st.nextToken()); //B
	}//배열 안에 값을 저장
	 //값이 0인 곳은 전봇대가 없는 곳이다
	
	int max =1; // 0으로 설정하지 않는다. 항이 1개인 경우 아래 반복문을 통과하지 못하기 때문
	for(int i=1; i<501; i++) {
		if(index[i]!=0) {
			dp[i]=1; //기본값으로 1을 부여한다(최소길이는 1)
		for(int j=1; j<i; j++) {
			if(index[j]!=0 && index[i]>index[j]) {
				dp[i]=Math.max(dp[j]+1, dp[i]);
				max=Math.max(dp[i],max); // 탐색하는 i보다 작은 항들 중 최대값을 적용한다
			}
		}}
	}
	System.out.print(N-max); //구해준 최대값을 N에서 빼면 최소로 없애야하는 전선 수가 된다
	}
}
