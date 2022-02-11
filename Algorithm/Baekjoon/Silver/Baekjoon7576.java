import java.util.*;
public class Main {
	static int[][] arr;
	static boolean[][] check;
	static int M,N;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,1,-1};
	static int zeroCount = 0;
	static int max = 0;
	static Queue<int[]> queue = new LinkedList<int[]>();
	public static void bfs() {
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int nowX = now[0]; 
			int nowY = now[1];
			
			for(int i=0;i<4;i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX<0 || nextY<0 || nextX>=M || nextY>=N || arr[nextX][nextY]!=0 || check[nextX][nextY]) {
					continue;
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
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[M][N];
		check=new boolean[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
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
