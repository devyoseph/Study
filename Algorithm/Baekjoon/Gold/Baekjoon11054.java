import java.util.*;
public class Main {
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 int[][]dp=new int[N][3];
	 int max=0;
     for(int i=0;i<N;i++) {
    	 dp[i][0]=sc.nextInt(); //값을 새로 넣어주고
    	 for(int j=0;j<i;j++) { //넣어줌과 동시에 이전항과 비교
    		 if(dp[j][0]<dp[i][0])dp[i][1]=Math.max(dp[j][1]+1,dp[i][1]);
     }}
     for(int i=N-1;i>=0;i--) { //위 과정을 거꾸로 진행한다
    	 for(int j=i;j>=0;j--) {
    		 if(dp[j][0]>dp[i][0]){
    			 dp[j][2]=Math.max(dp[i][2]+1,dp[j][2]);}}
                 
    	 if(dp[i][1]!=0)max=Math.max(max,dp[i][1]+dp[i][2]+1);
    	 else max=Math.max(max,dp[i][1]+dp[i][2]+1);}
         //증가 감소 둘 중 하나만 있는 경우 중앙에 숫자가 없기 때문에 값을 더해줄 필요가 없지만
         //둘 다 있는 경우는 가운데 숫자 하나를 더해주어야 한다
	 System.out.print(max);
}}
