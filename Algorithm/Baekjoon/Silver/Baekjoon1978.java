import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 boolean[] prime = new boolean[1001];
	 int devide =0;
	 int num = 0;
	 int sum=0;
//소수 배열 만들기, 반복문에서 사용되는 변수 미리 만들기
	 for(int i=2; i<1001; i++) {
		 devide = 1000/i;
		 for(int j=2; j<=devide; j++) {
			 prime[i*j] = true;
//false로 남은 애들만 소수다
		 }
	 }
	 prime[0] = true;
	 prime[1] = true;
//0과 1은 특별히 구분
	 int N = Integer.parseInt(br.readLine());
	 StringTokenizer st = new StringTokenizer(br.readLine()," ");
	 for(int i=0; i<N; i++) {
		 num = Integer.parseInt(st.nextToken());
		 if(prime[num]==false) {
			 sum++;
		 }
	 }
	 System.out.println(sum);
}
}
