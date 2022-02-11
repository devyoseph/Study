import java.io.*;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 double d, rmax, rmin;
	 int output;
// d: 좌표사이거리, rmax: 반지름 합, rmin: 반지름 차이, output 출력할 값
	 double[] arr = new double[6];
//순서가 필요없으므로 변수 6개를 저장할 배열을 만들고 값을 넣어준다
	 StringTokenizer st;
	 int T = Integer.parseInt(br.readLine());
	 for(int i =0; i<T; i++) {
		 st = new StringTokenizer(br.readLine(), " ");
		 for(int j=0; j<6; j++) {
			 arr[j] = Double.parseDouble(st.nextToken());
//절대값(abs)나 루트(sqrt)를 사용할 것이므로 double로 저장
		 }
	     d = Math.sqrt(Math.pow(arr[0]-arr[3], 2)+Math.pow(arr[1]-arr[4], 2));
	     rmax = Math.abs(arr[2]+arr[5]);
	     rmin = Math.abs(arr[2]-arr[5]);
//각각의 값을 배열 안에 저장한 값들로 계산
	     
	     output = location(d, rmax, rmin);
// 교점의 개수를 구해주는 메소드를 만들고 실행한다
	     
	     System.out.println(output);
	 }
}
public static int location(double d, double rmax, double rmin) {
//좌표의 거리, 반지름의 합, 반지름의 차이를 대입하고 비교한다
	int output = 0;
	if(d > rmax) {
		output = 0;
	}else if( d  != 0 && (d == rmax || d == rmin)){
//두 조건이 비슷하므로 묶을 수 있다
//d가 0이 아니라는 조건을 넣어줘야 한다
		output = 1;
	}else if(d > rmin && d < rmax) {
		output = 2;
	}else if(d < rmin) {
		output = 0;
	}else if(d == 0 && rmin == 0) {
		output = -1;
//둘의 좌표가 일치하는 경우
	}
	return output;
}
}
