import java.io.*;
import java.util.*;

public class Main {
	static char[][] map;
	
	static int bfs(int[] RB0) {
		Queue<int[]> q = new LinkedList<>();
		int cnt = -1;
		//처음 좌표들
		int RX = RB0[0];
		int RY = RB0[1];
		int BX = RB0[2];
		int BY = RB0[3];
		int X0 = RB0[4];
		int Y0 = RB0[5];
		
		//방향좌표
		int[] dy = {0,0,-1,1};
		int[] dx = {-1,1,0,0};
		q.add(new int[] {RX,RY,BX,BY,0}); // 0: 움직인 횟수
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			//System.out.println(Arrays.toString(now));
			int S = now[4]; //지금까지 움직인 횟수
			//꺼내고 좌표가 -라면 공이 들어간 상태임: 만약 R이 -면 무조건 스킵
			// B만 -면 그게 답임
			if(S>10) continue;
			if(now[2]<0) {
				continue;
			}else if(now[1]<0) {
				cnt = S;
				break;
			}
			for(int k=0; k<4; k++) {
				//먼저 기울일 때 벽에 도착하는 구슬을 움직여야한다.
				//System.out.println(k);
				boolean red = false; //빨강이 먼저이냐 아니냐 결정
				
				switch(k) {
				case 0: // 위로 움직일 때
					red = now[0]<now[2]? true:false;
					break;
				case 1: // 아래로 움직일 때
					red = now[0]<now[2]? false:true;
					break;
				case 2: // 왼쪽으로 움직일 때
					red = now[1]<now[3]? true:false;
					break;
				case 3: // 오른쪽으로 움직일 때
					red = now[1]<now[3]? false:true;
					break;
				}
				int redX = now[0];
				int redY = now[1];
				int blueX = now[2];
				int blueY = now[3];
				
				
				while(red) { //빨강먼저면 카운트
					if(map[redX+dx[k]][redY+dy[k]]=='#')break;
					else if(redX+dx[k]==blueX && redY + dy[k] ==blueY)break;
					
					redX += dx[k];
					redY += dy[k];
					
					if(redX == X0 && redY == Y0) {
						redX=-1;
						redY=-1;
						break;
					}
				}
				
				while(true) { //블루는 무조건 카운트
					if(map[blueX+dx[k]][blueY+dy[k]]=='#')break;
					else if(blueX+dx[k] == redX && blueY+dy[k] == redY)break;
					
					blueX += dx[k];
					blueY += dy[k];
					
					if(blueX == X0 && blueY == Y0) {
						blueX=-1;
						blueY=-1;
						break;
					}
				}
				
				while(!red) { //빨강이 나중이면 카운트
					if(map[redX+dx[k]][redY+dy[k]]=='#')break;
					else if(redX+dx[k] == blueX && redY+dy[k] == blueY)break;
					
					redX += dx[k];
					redY += dy[k];
					
					if(redX == X0 && redY == Y0) {
						redX=-1;
						redY=-1;
						break;
					}
				}
				if(redX == now[0] && redY == now[1] &&
						blueX == now[2] && blueY == now[3]) continue;
				q.add(new int[] {redX,redY,blueX,blueY,S+1});
				
			}
			
		}
		
		
		return cnt;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		map = new char[N][M];
		int[] RB0 = new int[6];
		for(int i=0; i<N; i++) {
			String s = sc.next();
			for(int j=0; j<M; j++) {
				char c = s.charAt(j);
				map[i][j] = c;
				switch(c) {
				case 'R':
					RB0[0] = i;
					RB0[1] = j;
					map[i][j] = '.';
					break;
				case 'B':
					RB0[2] = i;
					RB0[3] = j;
					map[i][j] = '.';
					break;
				case 'O':
					RB0[4] = i;
					RB0[5] = j;
					break;
				}
			}
		}
		System.out.println(bfs(RB0));
	}
}