import java.util.*;
public class Main {
	static boolean[][] arr;
	static int[][] check;
	static int[][] checkCrashed;
	static int M,N;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<int[]>();
		check[0][0]=1; //벽을 부수지 않은 기록 배열 처음 위치에 1 입력
		checkCrashed[0][0]=1; //벽을 부순 기록 배열 처음 위치에 1 입력
        
		queue.add(new int[] {0,0,1}); //세번째 값은 벽을 부술 수 있는 기회
        
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int nowX = now[0];
			int nowY = now[1];
			int chance = now[2]; //벽 부수기 가능 횟수

				for(int i=0;i<4;i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				if(nextX<0 || nextY<0 || nextX>=N || nextY>=M) {
					continue; //경계값을 벗어나면 무조건 제외
				}
				if(arr[nextX][nextY] && chance==0) {
					continue; //벽 부술 기회=0이고 벽을 만나면 제외
				} else if(!arr[nextX][nextY] && chance==1 && check[nextX][nextY]==0) {
				check[nextX][nextY]=check[nowX][nowY]+1;
				queue.add(new int[]{nextX,nextY,1}); //벽이 아니고, 벽 부수기 기회가 있다면 check에 기록
				} else if(!arr[nextX][nextY] && chance==0 && checkCrashed[nextX][nextY]==0) {
				checkCrashed[nextX][nextY]=checkCrashed[nowX][nowY]+1;
				queue.add(new int[]{nextX,nextY,0}); //벽이 아니고, 벽 부수기 기회가 없다면 checkCrashed에 기록
				} else if(arr[nextX][nextY] && chance==1 && checkCrashed[nextX][nextY]==0 ) {
				checkCrashed[nextX][nextY]=check[nowX][nowY]+1;
				queue.add(new int[]{nextX,nextY,0}); //벽이지만 기회가 있다면 차감하고 Crashed에 기록
				} else {
					continue;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new boolean[N][M];
		check=new int[N][M];
		checkCrashed=new int[N][M];
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<M;j++) {
				if(s.charAt(j)=='1') { //true가 벽
					arr[i][j]=true;
				}
			}
		}
		bfs();
		int max = Math.max(check[N-1][M-1], checkCrashed[N-1][M-1]);
		int min = Math.min(check[N-1][M-1], checkCrashed[N-1][M-1]);
		if(max==0) { //둘 다 0이면 -1 출력
			System.out.println(-1);
		}else if(min==0) { //둘 줄 하나가 0이면 그 중 큰 값을 출력
			System.out.println(max);
		} else { //둘다 0이 아니면 그 중 작은 값을 출력
			System.out.println(min);
		}
}}
