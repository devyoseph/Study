import java.io.*;
import java.util.*;
public class Main {
	static int[] arr;
	static int lowerBound(int K) {
		int min=0, max=arr.length;
		while(min<max) {
			int mid = (min+max)/2;
			if(K<=arr[mid]) {
            //하한을 구하기 때문에 같은 값에서도 왼쪽값을 찾아야하므로 부등호 포함
				max=mid;
			}else {
				min=mid+1;
			}
		}
		return min;
	}
	static int upperBound(int K) {
		int min=0, max=arr.length;
		while(min<max) {
			int mid = (min+max)/2;
			if(K<arr[mid]) {
            //상한을 구하기 때문에 값이 같다면 그 보다 큰 값을 탐색해야한다 = 부등호X
				max=mid;
			}else {
				min=mid+1;
			}
		}
		return min;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<M;i++) {
			int K = Integer.parseInt(st.nextToken());
			int cal = upperBound(K)-lowerBound(K);
			sb.append(cal+" ");
		}
		System.out.print(sb.toString());
}}
