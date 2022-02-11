import java.io.*;
public class Main {
	static Integer[][] dp = new Integer[41][2]; //[41][2]크기의 이중배열 선언
    //int가 아닌 데이터타입을 Integer로 설정하여 초기값을 null로 설정한다
    
	static Integer[] fibonacci(int N) {
		if(dp[N][0]==null || dp[N][1]==null) { //값이 없는 경우만 계산을 실시한다
			dp[N][0]= fibonacci(N-1)[0] + fibonacci(N-2)[0];
			dp[N][1]= fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		return dp[N];
        // 이중배열에서 값을 나눠 계산해주기 위해 [N]을 먼저 적어준다
        // fibonacci(N-1)은 dp[N-1]을 결과값으로 반환하는데
        // fibonacci(N-1)[0] 라는 표현을 통해 dp[N-1][0]을 표현할 수 있다.
	}
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     //초항들을 적어준다
      dp[0][0] = 1; dp[0][1] = 0; //0항에서 호출된 0항의 수=1, 0항에서 사용된 1항의 수=0
      dp[1][0] = 0; dp[1][1] = 1; //1항에서 호출된 0항의 수=0, 0항에서 사용된 1항의 수=1
	 int T = Integer.parseInt(br.readLine());
	 while(T-->0) {
		 int N = Integer.parseInt(br.readLine());
		 fibonacci(N);
		 System.out.println(dp[N][0]+" "+dp[N][1]);
}}}
