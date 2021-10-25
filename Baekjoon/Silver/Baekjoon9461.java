import java.util.*;
public class Main {
	static Double[] dp = new Double[101]; //double로 배열 선언
	static Double P(int N) {
	    if(N>=8 && dp[N]==null) {
	    	dp[N]=(P(N-1)+P(N-5));}
		return dp[N];}
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 dp[1]= 1.0;
	 dp[2]=1.0;
	 dp[3]=1.0;
	 dp[4]=2.0;
	 dp[5]=2.0;
	 dp[6]=3.0;
	 dp[7]=4.0;
	 int T = sc.nextInt();
	 while(T-->0){
	  System.out.println(String.format("%.0f",P(sc.nextInt())));
      //double을 바꿀 때 String에서 지원하는 format 메소드 사용
	 }
}}
