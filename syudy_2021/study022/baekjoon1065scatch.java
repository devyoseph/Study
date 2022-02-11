import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
/*어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
//등차수열의 공식을 이용할 수는 없을까?
/*예시로 210을 입력하면 105가 뜬다 어떤 것이 등차수열로 정의되는지
 * 분석이 필요했다. 예를들어 110까지 한수의 개수는 99개 고정이며
 * 이는 88, 99도 등차수열에 해당된다고 볼 수 있다 
 * (N<=100라면 ans =99)
 * 111부터 210개까지 한수는 6개가 존재한다고 한다
 * 123, 135, 147, 159, 210, 111
 * 각 수의 차이가 0이거나 음수일 경우도 포함된다는 것을 알 수 있다
 * 그리고 그 차이는 5를 넘을 수 없을 것이다
 * 즉 절대값 -4~4범위
 * 그리고 자리수가 커지면 커질수록 제약을 받는다 = 굳이 무한대의 N이 아니어도 된다
 */
public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
          //hash set에 10000개를 집어넣고 모두 빼기?
          int N = Integer.parseInt(br.readLine());          
          int answer=0;
          Minus m = new Minus();
          if(N<= 110) {
        	  answer = 99;
        	  if(N<=99) {	
        	  answer=N;}
        	  
          }
          if(N>=111 && N<1000){
        	  answer =99;
        	  for(int i=111; i<=N; i++) {
        		 if(m.cal(i)) {
        			 answer ++;
        		 }
        	  }
          }
          if(N==1000) {answer=144;}
               System.out.println(answer);
	}
}

class Minus{
	public boolean cal(int a) {
		int one=a%10;
		int ten=one%10;
		int hund = ten%10;
		boolean f =false;
		if(one-ten == ten-hund) {
		    f= true;}
		return f;
		
	}
	
	
}
