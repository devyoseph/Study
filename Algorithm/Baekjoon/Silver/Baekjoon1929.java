import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 boolean[] prime = new boolean[1000001];
	 int devide =0;

	 for(int i=2; i<1000001; i++) {
		 devide = 1000000/i;
		 for(int j=2; j<=devide; j++) {
			 prime[i*j] = true;

		 }
	 }
	 prime[0] = true;
	 prime[1] = true;
//0과 1은 특별히 구분
	 int M = Integer.parseInt(br.readLine());
	 int N = Integer.parseInt(br.readLine());

	 for(int i=M; i<=N; i++) {
		 if(prime[i]==false) {
			 bw.write(i+"\n");
//false인 값을 만날 때마다 해당 index를 출력한다
		 }
	 }
	 bw.flush();
	 bw.close();
}
}


import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 boolean[] prime = new boolean[1000001];
	 int M, N;
	 int devide =0;
//소수 배열 만들기, 반복문에서 사용되는 변수 미리 만들기
	 for(int i=2; i<1000001; i++) {
		 devide = 1000000/i;
		 for(int j=2; j<=devide; j++) {
			 prime[i*j] = true;
//false로 남은 애들만 소수가 된다
		 }
	 }
	 prime[0] = true;
	 prime[1] = true;
//0과 1은 특별히 구분
	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	 M = Integer.parseInt(st.nextToken());
	 N = Integer.parseInt(st.nextToken());
	 for(int i=M; i<=N; i++) {
		 if(prime[i]==false) {
			 bw.write(i+"\n");
		 }
//false인 값을 만날 때마다 해당 index를 출력한다
	 }
	 bw.flush();
	 bw.close();
}
}
