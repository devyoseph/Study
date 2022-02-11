import java.util.*;
public class Main {
	static boolean[] check;
	static boolean[][] arr;
	static int N;
	static int V;
	
	public static void dfs(int i) {
		check[i]=true;
		System.out.print(i+" ");
		
		for(int j=1;j<=N;j++) {
			if(arr[i][j]&&!check[j]) {
				dfs(j);
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V);
		check[V]=true;
		System.out.print(V+" ");
		
		while(!queue.isEmpty()) {
			int now = queue.poll(); //출구의 노드를 빼면서 동시에 저장
			
			for(int i=1;i<=N;i++) {
				if(arr[now][i]&&!check[i]) {
					queue.offer(i);
					check[i]=true;
					System.out.print(i+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		V = sc.nextInt();
		arr=new boolean[N+1][N+1];
		while(M-->0) {
			int x = sc.nextInt();
			int y= sc.nextInt();
			arr[x][y]=true;
			arr[y][x]=true;
		}
		check=new boolean[N+1];
		dfs(V);
		check=new boolean[N+1];
		System.out.println();
		bfs();
}}
