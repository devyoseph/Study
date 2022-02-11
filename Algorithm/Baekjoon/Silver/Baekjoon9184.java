import java.util.*;
public class Main {
	static Integer[][][] dp = new Integer[51][51][51]; //양수만 다룬다: 0~50
	static Integer w(int a, int b, int c) {
		if(dp[a][b][c]==null) {  //문제 내용을 그대로 복사해서 수정한다
			if(a<=0 || b<= 0 || c<=0) { // <=가 아닌 ==로 적어도 상관없다
				dp[a][b][c]=1;   //배열의 값 안에 저장하고 배열의 값을 호출하는 것이 핵심이다
			}
			else if(a>20 || b>20 || c>20) {
				dp[a][b][c]= w(20,20,20); //dp[20,20,20]이 아님을 주의하자
			}
			else if(a<b && b<c) {
				dp[a][b][c]= w(a,b,c-1)+ w(a,b-1,c-1)-w(a,b-1,c); }
			else {
				dp[a][b][c]= w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
			}
		}
		return dp[a][b][c];
	}
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 StringBuilder sb = new StringBuilder();
	 boolean out =true;
	 while(out) {
		 int a =  sc.nextInt();
		 int b =  sc.nextInt();
		 int c =  sc.nextInt();
		 if(a==-1 && b==-1 && c==-1)out=false; //-1, -1, -1을 입력받으면 출력하지 않고 종료한다
		 else sb.append("w("+a+", "+b+", "+c+") = ").append(w(a<0?0:a,b<0?0:b,c<0?0:c)).append("\n");
         //삼항 연산자를 통해 a, b, c가 각각 0보다 작을 때 0으로 표기된다
         }
	 System.out.print(sb.toString());
}}
