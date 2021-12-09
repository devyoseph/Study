import java.util.*;
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] arr2 = new int[N-1]; //서로 뺀 값들이 들어갈 배열
		int min = 1000000000;
		for(int i=0; i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr); //크기순 정렬
        
		for(int i=0;i<N-1;i++) {
			arr2[i]=arr[i+1]-arr[i];
		}
		Arrays.sort(arr2); //뺀 값들을 크기순 정렬
        
		for(int i=2; i<=arr2[0];i++) { //가장 작은 수 기준
			int num=0;
			boolean match=true;
			while(num<N-1) {
				if(arr2[num]%i!=0) {
					match=false;
					break;
				}
				num++;
			}
			if(match) { //모든 수와 나누어 떨어지는 값만 추림
				sb.append(i+" ");
			}
		}
		System.out.print(sb.toString());
}}
