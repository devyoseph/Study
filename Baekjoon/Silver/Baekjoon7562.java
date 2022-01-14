import java.util.*;
public class Main {
	static int[][] arr; //check[][] 배열을 사용x
	static int T,I,X,Y; //I: 체스판 크기, X,Y: 도착지점
	static int[] dx = {1,-1,2,-2,1,-1,2,-2}; //8방향
	static int[] dy = {2,2,1,1,-2,-2,-1,-1};
	static Queue<int[]> queue = new LinkedList<int[]>();
	public static void bfs() {
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int nowX = now[0]; 
			int nowY = now[1];
			if(nowX ==X && nowY==Y) { //도착지점 X, Y에 도달하면 반복문 break
				break;
			}
			for(int i=0;i<8;i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextY<0 || nextX<0 || nextX>=I || nextY>=I
					|| arr[nextX][nextY]!=0) {
					continue;
				}
				queue.add(new int[] {nextX,nextY});
				arr[nextX][nextY]=arr[nowX][nowY]+1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		while(T-->0) {
			I=sc.nextInt();
			arr = new int[I][I];
			int startX = sc.nextInt();
			int startY = sc.nextInt();
			arr[startX][startY]=1;
			queue.add(new int[] {startX,startY});
			X=sc.nextInt();
			Y=sc.nextInt();
			bfs();
			System.out.println(arr[X][Y]-1);
			queue.clear();
		}
}}
