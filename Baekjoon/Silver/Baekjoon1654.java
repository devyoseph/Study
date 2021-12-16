import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[K];
		long min=0,max=0; //int를 벗어날 수 있으므로 long을 사용
		for(int i=0;i<K;i++) {
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]);
		}
		max++;
		while(min<max) {
			long sum=0;
			long mid=(min+max)/2;
			for(int i=0;i<K;i++) {
				sum+=arr[i]/mid;
			}
			if(sum<N) { //랜선 개수가 N보다 작으면 길이를 줄여야 한다
				max=mid;
			}else{ //랜선 개수가 N 같거나 크면 길이를 길게 해주어야 한다
                   //이렇게 N보다 큰 값 중 가장 작은 값을 구할 수 있다 (upper Bound)
				min=mid+1;
			}
		}
		System.out.print(min-1);
}}
