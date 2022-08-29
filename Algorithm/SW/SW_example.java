import java.io.*;
import java.util.*;

public class Solution {
	static int N, MIN;
	static int complete;
	static int[][] map;
	
	
	static void check(int[][] map, int[][] record, int n, int x, int y, int S) {
		for(int i=0; i<31; i++) {
			for(int j=0;j<31; j++) {
				if(map[i][j] == -1)continue;
				if(Math.abs(x-i)+Math.abs(y-j)<=S) {
					int now = map[i][j];
					now = now | 1 << n;
					map[i][j] = now;
					record[i][j] += Math.abs(x-i)+Math.abs(y-j);
				}
			}
		}
	}
	
	static int isOnePossible(int[][] map, int[][] record) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<31; i++) {
			for(int j=0; j<31; j++) {
				if(map[i][j] == complete) {
					min = Math.min(min, record[i][j]);
				}
			}
		}
		return min;
	}
	
	static void dfs(int depth, int x, int y, int[] visit, int check) {
		//System.out.println(depth+" "+x+" "+y+" "+Arrays.toString(visit)+" "+check);
		if(depth == 2) {
			//선택한 두 정류소에서 나머지집까지의 거리를 모두 계산
			int sum = 0;
			for(int i=0; i<31; i++) {
				for(int j=0;j<31; j++) {
					if(map[i][j]==-1) {
						int a = Math.abs(visit[0]-i)+Math.abs(visit[1]-j);
						int b = Math.abs(visit[2]-i)+Math.abs(visit[3]-j);
						sum += Math.min(a,b);
					}
				}
			}
			MIN = Math.min(MIN, sum);
			return;
		}else if(depth == 0) {
			if(y>=31) {
				y=0;
				x++;
			}
			if(x>=31) {
				return;
			}
			
			dfs(0, x, y+1, visit, check);
			
			if(map[x][y] > 0) {
				visit[0] = x;
				visit[1] = y;
				check = check | map[x][y];
				dfs(1, x, y+1, visit, check);
			}
		}else { //1일 때
			if(y>=31) {
				y=0;
				x++;
			}
			if(x>=31) {
				return;
			}
			
			dfs(1, x, y+1, visit, check);
			if(map[x][y]>0 && ((check | map[x][y]) == complete)) {
				visit[2] = x;
				visit[3] = y;
				dfs(2, x, y+1, visit, check);
			}
		}
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			MIN = Integer.MAX_VALUE;
			complete = (int) Math.pow(2, N+1) -2;
			//System.out.println(complete);
			map = new int[31][31];
			int[][] record = new int[31][31]; //1인 경우에만 사
			int[] visit = new int[4];
			
			for(int n=1; n<=N; n++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken())+15;
				int y = Integer.parseInt(st.nextToken())+15;
				int s = Integer.parseInt(st.nextToken());
				map[x][y] = -1; //집 위치
				check(map, record, n, x, y, s); //n번 집 주위를 비트연산으로 범벅
			}
			
			MIN = isOnePossible(map, record); // 한개의 정유소가 가능한지 확인
			
			if(MIN == Integer.MAX_VALUE) {
				//두개인 경우 로직
				//System.out.println("탐지");
				//두 가능성있는 정유소를 선택한다.
				dfs(0, 0, 0, visit, 0); //depth, x, y, visit, 기록
				
			}
			if(MIN == Integer.MAX_VALUE) {
				MIN = -1;
			}
//			for(int[] a: map) {
//				System.out.println(Arrays.toString(a));
//			}
			System.out.println("#"+t+" "+MIN);
		}
	}

}