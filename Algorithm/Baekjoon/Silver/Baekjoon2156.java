import java.util.Scanner;
public class Main {
	static Integer dp[][];
	static int[] wine;
	static Integer drink(int N, int C) {
		if(N<=0)return dp[0][C];
		else if(dp[N][0]==null || dp[N][1]==null || dp[N][2]==null) {
			dp[N][0] = Math.max(drink(N-1, 2),Math.max(drink(N-1,1)+wine[N-1],drink(N-2,0)+wine[N-1]));
			dp[N][1] = Math.max(drink(N-2,0)+wine[N-1], drink(N-2,2)+wine[N-1]);
			dp[N][2] = Math.max(drink(N-1,0), drink(N-2,0));
			
			// 0은 점프 선택가능한 경우: 점프를 한 결과와 하지 않은 결과 중 최대값을 가져온다
			// 1은 점프 필수: 점프를 한 값을 가져온다
			// 2는 선택하지 않음: 반례를 고려해 전전항으로 보낼 수 있도록 한다
		}
		return dp[N][C];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		wine = new int[n];
		dp = new Integer[n+1][3];
		//0은 붙어있지 않아 점프 선택 가능, 1은 붙어있어 점프필수, 2는 선택되지 않았을 때
		
		for(int i=0;i<n;i++){
			wine[i]=sc.nextInt();
		} //배열에 입력값을 집어넣는다
		int max=0;
		dp[0][0]=0; dp[0][1]=0; dp[0][2]=0;
		for(int i=0; i<3; i++)
		max=Math.max(max, drink(n,i));
		System.out.print(max);
		//셋 중 최대값 출력
	}
}
