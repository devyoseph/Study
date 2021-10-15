import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder st = new StringBuilder();
	 int N = Integer.parseInt(br.readLine());
	 boolean[][] star = new boolean[N][N];
//입력받은 N을 통해 NXN 배열을 만든다
	 star[0][0] = true; // 0항 = "*"을 넣어준다
     
	 makeStar(N, star); //메소드를 만들어준다. 아래 메소드 정의 부분으로 간다
     
     //메소드를 통해 false, true표시한 내용을 출력하는 구간
	 for(int i=0; i<N; i++) {
		 for(int j=0; j<N; j++) {
			 if(star[i][j]==true) {
				 st.append("*");
			 } else {st.append(" ");}
		 }
		 st.append("\n");
	 }
	 System.out.println(st.toString());
}
public static void makeStar(int N, boolean[][] star) {
  int x = 3;
//초기값 x를 지정해준다
  while( N*3 != x) {
//while문의 loop 한 바퀴마다 x에 3이 곱해진다. x가 N보다 커지면 반복문이 멈춘다
	  int length = x/3;
//N = 27이라면 3X3의 배열을 9번 복사하기 때문에 27을 3으로 나눠서 기준 길이를 만든다

	for(int i = 0; i<length*3; i+=length) {
		  for(int j=0; j<length*3; j+=length) {
//위 두 개의 for문으로 각 구역의 시작 좌표를 설정할 수 있다. star[i][j]

			for(int k=0; k<length; k++) {
				  for(int m =0; m<length; m++) {
					  star[i+k][j+m] = star[k][m];
//각 구역의 시작점에서 1구역의 내용을 복사해줄 for문들이다
				  }
			  }
		  }
	  }
//9개의 구역에 모두 복사한 후 5구역을 비워준다
	  for(int k=length; k<length*2; k++) {
		 for(int m =length; m<length*2; m++) {
			star[k][m] = false;
				 }
			 }
	  x *= 3;
  }
 
}
}
