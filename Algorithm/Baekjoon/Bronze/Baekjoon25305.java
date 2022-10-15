import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10001];
		int N = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		int answer = 0;
		for(int i=0; i<N; i++) {
			arr[sc.nextInt()] ++;
		}
		for(int i=10000; i>=0; i--) {
			cnt += arr[i];
			if(cnt >= k ) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}

}
