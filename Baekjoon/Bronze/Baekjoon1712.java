import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   if(B>=C) {
		   System.out.print(-1);
	   }
	   if(B<C) {
		   int N = (A/(C-B))+1;
		   System.out.print(N);
	   }
}
}

//scanner 사용
// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {

// 	Scanner sc = new Scanner(System.in);
// 	 int A = sc.nextInt();
// 	 int B = sc.nextInt();
// 	 int C = sc.nextInt();
// //Scanner의 경우 띄어쓰기를 자동으로 인식한다
// 	 if(B<C) {
// 		 System.out.println(A/(C-B)+1);
// 	 } else { System.out.println(-1);}
// }
// }
