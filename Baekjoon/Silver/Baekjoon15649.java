import java.io.*;
import java.util.*;
public class Main {
	static boolean[] arr;
	static int[] record;
	static void sequence(int N, int M, int Depth) {
    
		if(Depth==M) {
			for(int i=0; i<M; i++) {
					System.out.print(record[i]+" "); //그 동안의 배열의 값을 출력
			}
			System.out.print("\n");
			return; //출력 후 뒤 반복문이 실행되지 않도록 종료한다
		}
		
		for(int i=1; i<N+1; i++) {
			if(arr[i]==false) { //재귀 호출을 생각해 이미 기록된 값은 사용하지 않는다
				arr[i]=true; //사용하는 즉시 기록해주고
				record[Depth]=i; //그 값을 배열에 입력한 뒤
				sequence(N,M,Depth+1); //재귀호출을 한다
				arr[i]=false; //재귀가 모두 반복된 이후 사용값을 꺼준다
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new boolean[N+1]; //수가 중복되는 것을 방지하기 위한 논리배열
		record = new int[M];
		
		sequence(N,M,0); //메소드만 실행하면 알아서 출력된다
		
 }}
