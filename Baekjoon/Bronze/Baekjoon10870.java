import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int[] Fibonacci = new int[21];
	 Fibonacci[1] = 1;
//크기가 21인 배열을 만들고 index 1번에 1을 넣어준다 ( 피보나치 1항의 값 )
	 for(int i = 2; i<21; i++) {
		Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
	 }
//반복문을 통해 피보나치 수열을 20항까지 계산한다
	 int n = Integer.parseInt(br.readLine());
	 System.out.print(Fibonacci[n]);
}
}
