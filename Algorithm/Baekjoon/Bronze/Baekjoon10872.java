import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int N = Integer.parseInt(br.readLine());
	 int one = 1;
	 // one은 초기값이다
	 
	 for(int i = 1; i<=N; i++) {
		 one *= i;
	 }
	 System.out.print(one);
}
}
