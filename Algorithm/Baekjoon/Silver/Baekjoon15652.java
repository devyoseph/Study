import java.io.*;
import java.util.*;
public class Main {
	static boolean[] arr;
	static int[] record;
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static void sequence(int N, int M, int Depth, int Select) throws IOException {
		if(Depth==M) {
			for(int i=0; i<M; i++) {
					bw.write(record[i]+" ");
			}
			bw.write("\n");
			return;
		}
		
		for(int i=Select; i<N+1; i++) {
				record[Depth]=i;
				sequence(N,M,Depth+1,i); //다음 반복문을 현재 선택된 i부터 시작하도록 한다
		}
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new boolean[N+1];
		record = new int[M];
		sequence(N,M,0,1);
		bw.flush();
		bw.close();
 }}
