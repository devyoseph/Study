import java.io.*;
import java.util.*;
public class Main {
	static boolean[] arr;
	static int[] record;
	static void sequence(int N, int M, int Depth, int Select) { //통제하기위해 새로운 변수를 추가
		if(Depth==M) {
			for(int i=0; i<M; i++) {
					System.out.print(record[i]+" ");
			}
			System.out.print("\n");
			return;
		}
		
		for(int i=Select; i<N+1; i++) {
			if(arr[i]==false) {
				arr[i]=true;
				record[Depth]=i;
				sequence(N,M,Depth+1,i+1); //현재 i보다 큰 값을 선택하도록 강요한다
				arr[i]=false;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new boolean[N+1]; //수가 중복되는 것을 방지하기 위한 논리배열
		record = new int[M];
		
		sequence(N,M,0, 1);
		
 }}
