import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int first = sc.nextInt(); //기준이 되는 링을 변수 저장
		int[] ring = new int[N-1]; //나머지는 배열 저장
		int LCM; //최소공배수 변수
		for(int i=0;i<N-1;i++) {
			ring[i]=sc.nextInt();
			int multiply = 1;
			while(true) { //최소공배수 찾기
				if(first*multiply%ring[i]==0) {
					LCM=first*multiply;
					break;
				}
				multiply++;
			}
			System.out.println(LCM/ring[i]+"/"+LCM/first);
		}
}}


//다른 
// import java.util.*;
// public class Main {
//     static int GCD(int x, int y) {
// 		if(x==0)return y;
// 		return GCD(y%x,x);
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
// 		int first = sc.nextInt();
// 		int[] ring = new int[N-1];
// 		for(int i=0;i<N-1;i++) {
// 			ring[i]=sc.nextInt();
// 			int gcd = GCD(first,ring[i]);
// 			System.out.println(first/gcd+"/"+ring[i]/gcd);
// }}}
