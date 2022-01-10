import java.util.*;
public class Main {
	static boolean[] check;
	static boolean[][] arr;
	static int N;
	static int count=0;
	
	public static void dfs(int i) {
		check[i]=true;
		count++;
		
		for(int j=1;j<=N;j++) {
			if(arr[i][j]&&!check[j]) {
				dfs(j);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr=new boolean[N+1][N+1];
		int input = sc.nextInt();
		while(input-->0) {
			int x = sc.nextInt();
			int y= sc.nextInt();
			arr[x][y]=true;
			arr[y][x]=true;
		}
		check=new boolean[N+1];
		dfs(1);
		System.out.println(count-1);
}}
