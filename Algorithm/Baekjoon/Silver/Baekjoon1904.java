import java.util.*;
public class Main {
	static Integer[] dp = new Integer[10000000]; //배열 생성
    
	static Integer tile(int N) {
	    if(dp[N]==null) { //값이 없을 때만 연산한다
	    	dp[N]=(tile(N-1)+tile(N-2))%15746; %로 나눈 나머지를 대입한다
            }
		return dp[N];}
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 dp[0]=1; dp[1]=2;
	  System.out.print(tile(sc.nextInt()-1)); //scanner를 통해 값을 바로 넣는다
}}
