import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 StringTokenizer st;
	 int min =0;
	 int T = Integer.parseInt(br.readLine());
	 for(int i =0; i<T; i++) {
		 st = new StringTokenizer(br.readLine()," ");
		 min=0;
		 double x = Double.parseDouble(st.nextToken());
		 double y = Double.parseDouble(st.nextToken());
		 double root = Math.sqrt(y-x);
		 //루트값 구하기 
		 double decimal = root-(int)root;
		 //루트값의 소수부분 추출
		 int S = (int)root;
		//루트값의 정수부분 추출
		if(decimal ==0) {
			min = S*2-1;
		} else if(decimal<0.5) {
			min = S*2;
		} else if(decimal >0.5) {
			min = S*2+1;
		}
		bw.write(min+"\n");
	 }
	 bw.flush();
	 bw.close();
}
}
//첫번째 
// import java.io.*;
// import java.util.StringTokenizer;
// public class Main {
// public static void main(String[] args) throws IOException{
// 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 	 StringTokenizer st;
// 	 int T = Integer.parseInt(br.readLine());
	 
// 	 for(int i =0; i<T; i++) {
// 		 st = new StringTokenizer(br.readLine()," ");
// 		 int min=0;
// 		 int num=0;
// 		 int n =0;
// //min: 최소작동횟수
// //num: 0부터 증가하는 수
// //n: 항의 번호를 가져오기 위한 변수
// 		 int x = Integer.parseInt(st.nextToken());
// 		 int y = Integer.parseInt(st.nextToken());
// 		 int S = y-x;
// 		 for(int j=0;num<=S; j++) {
// 				num = j*(j+1);
// //증가하는 항 i에 따라 num도 커진다
// //num이 S보다 커지는 순간 반복문은 꺼진다
// 				if(num>=S) {
// 					n = j-1;
// //num의 이전 항을 n에 저장한다 
// 				}
// 			}
// 		 int diff = S-n*(n+1);
// //입력해준값 S에서 n항의 값을 빼준다
// 		 if(diff<=n+1) {
// 				min ++;
// 			} else if(diff>n+1) {
// 				min += 2;
// 			}
// 			min += 2*n;
// 		System.out.println(min);
// 	 }
// }
// }
