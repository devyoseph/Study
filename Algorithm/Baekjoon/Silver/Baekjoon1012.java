import java.util.*;
public class Main {
	static boolean[][] check;
	static boolean[][] arr;
	static int M,N;
	static int count=0;
	
	public static void dfs(int i,int j) {
		if(i<0 || i>=M || j<0 || j>=N || !arr[i][j] || check[i][j] ) {
			return;
		}
		
		check[i][j]=true;

		dfs(i+1,j);
		dfs(i-1,j);
		dfs(i,j+1);
		dfs(i,j-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int input;
		while(T-->0) {
			M = sc.nextInt();	
			N = sc.nextInt();
			arr=new boolean[M][N];
			check=new boolean[M][N];
			input=sc.nextInt();
			while(input-->0) {
				arr[sc.nextInt()][sc.nextInt()]=true;
			}
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j] && !check[i][j]) {
						dfs(i,j);
						count++;
					}
				}
			}
			System.out.println(count);
			count=0;
		}
}}
