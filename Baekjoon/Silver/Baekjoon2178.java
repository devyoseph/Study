import java.util.*;
public class Main {
	static int[][] arr;
	static boolean[][] check;
	static int M,N;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		check[0][0]=true;
		queue.add(new int[] {x,y});
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int nowX = now[0]; 
			int nowY = now[1];
			
			for(int i=0;i<4;i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX<0 || nextY<0 || nextX>=M || nextY>=N || arr[nextX][nextY]==0 || check[nextX][nextY]) {
					continue;
				}
				queue.add(new int[] {nextX,nextY});
				arr[nextX][nextY]=arr[nowX][nowY]+1;
				check[nextX][nextY]=true;
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M=sc.nextInt();
		N=sc.nextInt();
		arr=new int[M][N];
		check=new boolean[M][N];
		for(int i=0;i<M;i++) {
			String s = sc.next();
			for(int j=0;j<N;j++) {
				if(s.charAt(j)=='1') {
					arr[i][j]=1;
				}
			}
		}
		bfs(0,0);
		System.out.println(arr[M-1][N-1]);
}}
