import java.io.*;
import java.util.*;
public class Main {
	static int[] arr;
	static void match(int num) {
			int min=0; //탐색 시작점 =0
			int max=arr.length-1; //탐색 끝점 = N-1
			while(min<=max){
				int center = (min+max)/2;
				if(num>arr[center]) {
					min=center+1;
				}else if(num<arr[center]) {
					max=center-1;
				}else { // num==arr[center]일 경우
					System.out.println(1);
					return;
				}
			} //끝날때까지 답을 찾지 못한 경우 0을 출력
			System.out.println(0);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		arr = new int[N];
		for(int i=0; i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //N개의 값을 입력 받고 배열에 넣고 정렬
        
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<M;i++) { //M을 받고 M개의 수들을 판별
			int find = Integer.parseInt(st.nextToken());
			if(find>arr[N-1] || find<arr[0]) {
				System.out.println(0); // 경계값 밖의 값이면 0출력
			}else {
				match(find); //경계값 안의 값이면 메소드 실행
			}
		}
}}
