import java.util.*;
public class Main {
	static boolean[][] check;
	static boolean[][] arr;
	static int N;
	static int count=0;
	
	public static void dfs(int i,int j) {
		if(i<0 || i>=N || j<0 || j>=N || !arr[i][j] || check[i][j] ) {
			return;
		}
		
		check[i][j]=true;
		count++;
		
		dfs(i+1,j);
		dfs(i-1,j);
		dfs(i,j+1);
		dfs(i,j-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		arr=new boolean[N][N];
		check=new boolean[N][N];
		int[] record= new int[N*N];
		int count2=0;
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<N;j++) {
				if(s.charAt(j)=='1') {
					arr[i][j]=true;
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j] && !check[i][j]) {
					dfs(i,j);
					record[count2]=count;
					count2++;
					count=0;
				}
			}
		}
		Arrays.sort(record);
		System.out.println(count2);
		for(int i=0;i<N*N;i++) {
			if(record[i]!=0) {
				System.out.println(record[i]);
			}
		}
}}
