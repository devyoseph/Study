import java.util.*;
public class Main {
	static Integer[][] dp;
	static Integer[] increase(int N) {
		
		if(dp[N][1]==null || dp[N][2]==null ) {
			int max = 0;
			int out =0;
			boolean min = true;
			for(int i=0; i<N ; i++) {
				if(dp[i][0]<dp[N][0]) {
					min = false; //한번이라도 작은값이 있으면 최소값이 아니다
					max = Math.max(increase(i)[1], max);
					//자신보다 작고 왼쪽에 있는 값들에 대해서 최대값을 가져옴
				}
				out=Math.max(increase(i)[2], out);
			}
			if(min) { 
				dp[N][1]=1; //최소값인 경우 본인은 1을 가짐
			} else {
				dp[N][1]=max+1; //최소값이 아닌 경우 왼쪽 값의 최대값을 더함
			}
			if(out<=dp[N][1]) {
				dp[N][2]=dp[N][1];
			} else dp[N][2]=out;
	   }
		
		return dp[N];
	}
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 dp = new Integer[N][3]; //0은 숫자, 1은 그 항이 가지는 값, 2는 그 때까지의 최대값
	 dp[0][1]=1;
	 dp[0][2]=1;
	 for(int i=0; i<N;i++) {
		 dp[i][0]=sc.nextInt();
	 }
	 System.out.print(increase(N-1)[2]);
}}
