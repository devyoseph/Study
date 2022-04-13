import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	static int map[][], visit[][], N, M;
	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0,0,0});
		visit[0][0] = 0;
		int[] dx = {-1,1, 0, 0};
		int[] dy = {0,0,-1,1};
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int r = now[0];
			int c = now[1];
			if(r==N-1 && c==M-1) {
				continue;
			}
			int wall = now[2];
			//System.out.println(r+" "+c+" "+S+" "+wall);
			for(int k=0; k<4; k++) {
				int row = r + dx[k];
				int col = c + dy[k];
				
				
				if(row<0 || row>=N || col<0 || col>=M) continue;
				int nowWall = map[row][col]==1?wall+1:wall;
				if(visit[row][col] <= nowWall) continue;
				//System.out.println(visit[row][col][0]);
					visit[row][col] = nowWall;
					q.add(new int[] {row,col, nowWall});
				}
			}
		}
		
	public static void main(String[] args) throws IOException {
	   Scanner sc = new Scanner(System.in);
	   M = sc.nextInt();
	   N = sc.nextInt();
	   map = new int[N][M];
	   visit = new int[N][M]; //0에다는 최소경로를 넣고 1에다는 벽을 부순 개수를 넣음
	   for(int i=0; i<N; i++) {
		   String s = sc.next();
		   for(int j=0; j<M; j++) {
			   if(s.charAt(j)=='1') {
				   map[i][j] = 1;
			   }
			   visit[i][j] = Integer.MAX_VALUE;
		   }
	   }
	   bfs();
//	   for(int i=0;i<N; i++) {
//		   for(int j=0; j<M; j++) {
//			   System.out.print(visit[i][j][1] +" ");
//		   }
//		   System.out.println();
//	   }
	   System.out.println(visit[N-1][M-1]);
}}