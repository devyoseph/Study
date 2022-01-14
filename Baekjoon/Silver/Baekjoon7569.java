import java.util.*;
public class Main {
	static int[][] arr;
	static boolean[][] check;
	static int M,N,H;
	static int[] dx = {-1,1,0,0,0,0}; //6개의 방향
	static int[] dy = {0,0,1,-1,0,0};
	static int zeroCount = 0;
	static int max = 0;
	static Queue<int[]> queue = new LinkedList<int[]>();
	public static void bfs() {
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int nowX = now[0]; 
			int nowY = now[1];
			
			for(int i=0;i<6;i++) { //반복 6번
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextY<0 || nextX<0 || nextX>=N*H || nextY>=M
					|| arr[nextX][nextY]!=0 || check[nextX][nextY]) {
					continue; //경계값 조건
				}else if(i<4 && (nextX/N)!=(nowX/N)){
					continue; //만약 층 이동이 아닌 수평이동일 때 층이 바뀌지 않도록 한다
				}
				queue.add(new int[] {nextX,nextY});
				arr[nextX][nextY]=arr[nowX][nowY]+1;
				max=Math.max(arr[nextX][nextY],max);
				check[nextX][nextY]=true;
				zeroCount--;
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M=sc.nextInt();
		N=sc.nextInt();
		H=sc.nextInt();
		dx[4]=N;
		dx[5]=-N; //H가 아니라 N만큼 이동함을 주의
		arr=new int[N*H][M];
		check=new boolean[N*H][M];
		for(int i=0;i<N*H;i++) {
			for(int j=0;j<M;j++) {
				int input = sc.nextInt();
				if(input==0) {
					zeroCount++;
				}else if(input==1) {
					check[i][j]=true;
					queue.add(new int[] {i,j});
				}else {
					check[i][j]=true;
				}
				arr[i][j]=input;
			}
		}
		if(zeroCount==0) {
			System.out.println(0);
		}else {
			bfs();
			if(zeroCount!=0) {
				System.out.print(-1);
			}else {
				System.out.println(max-1);
			}
		}
}}
