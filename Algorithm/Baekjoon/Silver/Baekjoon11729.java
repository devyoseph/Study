import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder st = new StringBuilder();
	 int[] min = new int[21];
	 min[1] = 1;
	 //최소 경로를 미리 알 수 있다. 그 값을 저장한 배열을 만든다. 계산을 위해 +1
	 for(int i = 1; i<20; i++) {
		 min[i+1] = min[i]*2+1;
	 }
	 int N = Integer.parseInt(br.readLine());
	 int sum = min[N];
	 int[][] hanoi = new int[2][sum];

	 hanoi[0][0] = 1;
	 hanoi[1][0] = 3;
	 moveTower(N, hanoi, sum);
	 
	 for(int i =0; i<min[N]; i++) {
		 st.append(hanoi[0][i]).append(" ").append(hanoi[1][i]).append("\n");
	 }
	 System.out.println(sum);
	 System.out.println(st.toString());
}
public static void moveTower(int N, int[][] hanoi, int sum) {
	int n = 1;
//1부터 시작해서 loop가 반복될 때 마다 n은 증가한다
//N보다 커지면 멈춘다
	while(n != sum) {
		  for(int i = 0; i<n; i++) {
					hanoi[0][n+1+i] = hanoi[0][i];
					hanoi[1][n+1+i] = hanoi[1][i];
//뒤쪽부터 값을 복사한 후 처리한다
//0~n까지 값 -> n+1~2n으로 복사 
				
		  for(int j =0; j<2; j++) {
				switch(hanoi[j][i]) {
				case 1: hanoi[j][n+i+1] = 2; break;
				case 2: hanoi[j][n+i+1] = 1; break;
//복사한 값의 1 -> 2, 2->1 로 변환
				}
			}
		  }
		for(int i = 0; i<n; i++) {
			for(int j =0; j<2; j++) {
				switch(hanoi[j][i]) {
				case 2: hanoi[j][i] = 3; break;
				case 3: hanoi[j][i] = 2; break;
				}
			}
		}
		hanoi[0][n] = 1;
		hanoi[1][n] = 3;
//n번째 탑이 1 3 으로 이동하는 것은 고정이다
		n = 2*n +1;
//n ++가 아님을 유의한다, n은 N 수열의 증감과 같이 증가한다
	}
}
}
