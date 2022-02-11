import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 boolean[] prime = new boolean[10001];
	 int T, n;
	 int small = 0,large=0;
	 int devide =0;
	 for(int i=2; i<10001; i++) {
		 devide = 10000/i;
		 for(int j=2; j<=devide; j++) {
			 prime[i*j] = true;
		 }
	 }
	 prime[0] = true;
	 prime[1] = true;
	 T = Integer.parseInt(br.readLine());
	 for(int i =0; i<T; i++) {
	  n = Integer.parseInt(br.readLine());
	  int left = n/2;
	  int right = n/2;
	  for(int j = 0; j <= n/2; j++) {
		  if(prime[left] == false && prime[right]==false) {
			 small = left;
			 large = right;
			 break;
		  }
		 left--;
		 right++;
		  }
	  System.out.println(small+" "+large);
	  }
}
}


// import java.io.*;
// public class Main {
// public static void main(String[] args) throws IOException{
// 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 	 boolean[] prime = new boolean[10001];
// 	 int T, n;
// 	 int small = 0, large=0, smallR=0, largeR=0;
// //아래에서 사용할 변수들을 미리 정의해준다
// 	 int devide =0;
// 	 for(int i=2; i<10001; i++) {
// 		 devide = 10000/i;
// 		 for(int j=2; j<=devide; j++) {
// 			 prime[i*j] = true;
// 		 }
// 	 }
// 	 prime[0] = true;
// 	 prime[1] = true;
// // 소수는 false의 값을 가지고 있다
// 	 T = Integer.parseInt(br.readLine());

// 	 for(int i =0; i<T; i++) {
// 		 int diff = 10000;
// 		 int diffR = 10000;
// 	  n = Integer.parseInt(br.readLine());
// 	  for(int j =2; j<=n/2; j++) {
// 		  if(prime[j] == false && prime[n-j]==false) {
// //값이 동시에 소수라면 저장된다
// 			  small = j;
// 			  large = n-j;
// 			  diff = large - small;
// 		  }
// 		  if(diff < diffR) {
// 			  smallR = small;
// 			  largeR = large;
// 	          diffR = diff;
// 		  }
// //현재 계산해준 차이가 최소값보다 작으면 출력할 변수들에 기록한다 
// 	  }
// 	 System.out.println(smallR+" "+largeR);
// //출력 		 
// 		 }
// }
// }
