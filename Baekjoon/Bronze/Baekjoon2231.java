import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String s = br.readLine();
	 int n = s.length(); //N의 자리수를 가져온다
	 int N = Integer.parseInt(s);
	 int start = N-9*n; //시작은 N-N의 자리수x9
	 int sum = 0; //while조건에 넣어야 하므로 내부에서 sum을 만들 수 없다
	 int i = 0;  // 분해합을 얻어낼 임시 저장소
	 int fix = 0; //값을 출력하기 위해 이번 loop의 숫자를 저장
	 int plus = 0;  //while loop마다 증가
	 boolean out = true; //while을 빠져나오도록 해준다
	 while(sum != N && out) {
		 sum =start + plus;
		 i = start + plus;
		 fix = start + plus;
		 while(i!=0) {
			 sum += i%10;
			 i /= 10;
		 }
		 if(sum == N) {
			 System.out.print(fix);
		 }
		 if(fix==N) {
			 System.out.print(0);
			 out = false;
		 }
			 plus++;
	 }
}
}
