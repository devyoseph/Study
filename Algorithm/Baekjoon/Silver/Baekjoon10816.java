import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[20000001]; //숫자의 최대 개수
		for(int i=0; i<N;i++) {
			arr[Integer.parseInt(st.nextToken())+10000000]++; //양수저장
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<M;i++) { //값 불러오기
			sb.append(arr[Integer.parseInt(st.nextToken())+10000000]+" ");
		}
		System.out.print(sb.toString());
}}

// import java.util.*;
// public class Main {
// 	public static void main(String[] args){
// 		Scanner s=new Scanner(System.in);
// 		StringBuilder sb=new StringBuilder();
// 		int[] arr=new int[20000001];
// 		for(int i=s.nextInt();i>0;i--) arr[s.nextInt()+10000000]++;
// 		for(int i=s.nextInt();i>0;i--) sb.append(arr[s.nextInt()+10000000]+" ");
// 		System.out.print(sb);
// 	}
// }
