import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int N = Integer.parseInt(br.readLine());
	 int quotient = N/5;
	 int remainder = N%5;
//quotient는 몫, remainder는 나머지이다
	 int sum = quotient;
	 switch(remainder) {
	 case 0: break;
	 case 1: quotient --; sum ++; break;
	 case 2: quotient -= 2; sum +=2; break;
	 case 3: sum++; break;
	 case 4: quotient --; sum +=2; break;
//몫이 -가 될 수 있으므로 switch 내부에서 연산을 해준다
	 }
	 if(quotient<0) {
		 System.out.print(-1);
	 }else if(quotient>=0) {
		 System.out.print(sum);
	 }
}	 
}
