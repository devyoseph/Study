import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder A = new StringBuilder();
	 StringBuilder B = new StringBuilder();
	 StringBuilder Sum = new StringBuilder();
//Sum은 값을 계산할 곳
	 int a=0;
	 int b=0;
	 int c =0;
//a, b, c는 반복문 안에서 각 자리수의 숫자를 가져오는 변수
	 boolean upper = false;
// 각 자리수의 합이 10이 넘으면 upper값이 켜지고 다음 자리수가 1 올라간다
	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	 A.append(st.nextToken()).reverse();
	 B.append(st.nextToken()).reverse();
	 int lengthA = A.length();
	 int lengthB = B.length();
	 int gap = lengthA-lengthB;
	 int length; //더 큰 길이를 가져온다
	 if(gap>=0) {
		for(int i=0; i<gap;i++) {
			B.append("0");
		}
		 length = lengthA;
	 }else {
		 for(int i=0; i<-1*gap;i++) {
			 A.append("0");
		 }
		 length = lengthB;
	 }
//길이가 더 짧은 곳에 0을 붙여주어 길이를 맞춘다
	 for(int i=0; i<length; i++) {
		 a= Character.getNumericValue(A.toString().charAt(i));
		 b= Character.getNumericValue(B.toString().charAt(i));
		 c= a+b;
		 if(upper==true) {
			 c ++;
			 upper = false;
		 }
//이전 계산에서 10이 넘었으면 이번 자리수에서 1을 더한다
		 if(c>=10) {
			 c -=10;
			 upper = true;
		 }
		 Sum.append(c);
	 }
	 if(upper==true) {
		 Sum.append(1);
	 }
//끝자리에서 값이 10을 넘었다면 1을 추가해준다
	 System.out.println(Sum.reverse().toString());
//계산한 값을 뒤집어서 출력한다
}	 
}


//개선: 배열 사용
// import java.io.*;
// import java.util.StringTokenizer;
// public class Main {
// public static void main(String[] args) throws IOException{
// 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	 int[] A = new int[10001];
// 	 int[] B = new int[10001];
// 	 StringBuilder Sum = new StringBuilder();
// 	 int lengthA, lengthB, length;
// 	 boolean upper = false;
// 	 String a,b;
// 	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
// 	 a = st.nextToken();
// 	 b = st.nextToken();
// 	 lengthA = a.length();
// 	 lengthB = b.length();
// 	 for(int i=0; i<lengthA; i++) {
// 		 A[lengthA-i-1] = Character.getNumericValue(a.charAt(i));
// 	 }
// 	 for(int i=0; i<lengthB; i++) {
// 		 B[lengthB-i-1] = Character.getNumericValue(b.charAt(i));
// 	 }
// 	 if(lengthA>=lengthB) {
// 		 length = lengthA;
// 	 } else { length = lengthB;}
// 	 for(int i=0; i<length; i++) {
// 		 A[i] = A[i]+B[i];
// 	 }
// 	 for(int i=0; i<length; i++) {
// 		 if(upper == true) {
// 			 A[i] ++;
// 			 upper = false;
// 		 }
// 		 if(A[i]>=10) {
// 			 upper = true;
// 			 A[i] -=10;
// 		 }
// 	 }
// 	for(int i=0; i<length;i++) {
// 		Sum.append(A[i]);
// 	}
// 	if(upper == true) {
// 		Sum.append(1);
// 	}
// 	System.out.print(Sum.reverse().toString());
// }
// }
