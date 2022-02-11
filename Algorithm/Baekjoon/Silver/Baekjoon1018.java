import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder sb = new StringBuilder();
	 String s;
	 int min = 64;
	 boolean[][] odd = new boolean[8][8];
	 boolean[][] even = new boolean[8][8]; //기준이 되는 체스판 배열
	 for(int i=0; i<8; i++) {
		 for(int j=0; j<8; j++) {
			 if((i+j)%2==1) {
				 odd[i][j] = true;
			 }
			 if((i+j)%2==0) {
				 even[i][j] = true;
			 }
		 }
	 }//각각 칠해준다
	 StringTokenizer st = new StringTokenizer(br.readLine()," ");
	 int N = Integer.parseInt(st.nextToken());
	 int M = Integer.parseInt(st.nextToken());
	 int movingN = N-8;
	 int movingM = M-8;
	 boolean[][] input = new boolean[N][M];
	 char[] check = new char[M]; //한줄한줄의 문자를 체크할 배열
     
	 for(int i=0; i<N; i++) {
		 check = br.readLine().toCharArray(); //매 줄마다 쪼개서 배열에 넣고
		 for(int j=0; j<M; j++) {
			 if(check[j]=='B'){   //B인 char만 true로 바꾼다
				 input[i][j] = true;
			 }
		 }
	 }
	 for(int i =0; i<=N-8; i++) {
		for(int j=0; j<=M-8; j++) {
			 int count1 = 0;
			 int count2 = 0;
//이 부분을 주의한다. 이중배열 탐색에서 값의 초기화는 i가 아닌 j에서 해주어야 한다
			for(int k=0; k<8;k++) {
				for(int m=0; m<8; m++) {
					if(input[i+k][j+m]!=odd[k][m]) {
						count1++;
					}else if(input[i+k][j+m]!=even[k][m]) {
						count2++;
					}
				}
			}
			if(count1<min) {
				min = count1;
			} 
			if(count2<min) {
				min = count2;
			}
		}
	 }
	 System.out.print(min);
}
}
