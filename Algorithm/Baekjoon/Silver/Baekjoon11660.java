import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //크기
		int M = Integer.parseInt(st.nextToken()); //개수
		int[][] map = new int[N][N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(j!=0) {
					map[i][j] += map[i][j-1];
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=1; j<N; j++) {
				map[j][i] += map[j-1][i];
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken())-1;
			int y1 = Integer.parseInt(st.nextToken())-1;
			int x2 = Integer.parseInt(st.nextToken())-1;
			int y2 = Integer.parseInt(st.nextToken())-1;
			
			int minus1 = 0;
			int minus2 = 0;
			int plus = 0;
			
			if(x1!=0) {
				minus1 = map[x1-1][y2];
			}
			if(y1!=0) {
				minus2 = map[x2][y1-1];
			}
			if(x1!=0 && y1!=0) {
				plus = map[x1-1][y1-1];
			}
			
			int sum = map[x2][y2] - minus1 - minus2 + plus;
			System.out.println(sum);
		}
	}

}
