import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int N,MAX,arr[][]; //시작, 끝, 인원
	
	static void dfs(int idx,int end, int sum) {
		
		if(idx == N) {
			MAX = Math.max(MAX, sum);
			return;
		}
		
		if(arr[idx][0]>=end) {
			dfs(idx+1,arr[idx][1],sum+arr[idx][2]); //현재 회의 선택
		}
		dfs(idx+1,end,sum); //현재 회의 선택X
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][3];
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				return o1[1]-o2[1];
			}
		});
		
		dfs(0,0,0);
		System.out.println(MAX);
}
}