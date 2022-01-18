import java.util.*;
public class Main {
	static ArrayList<Integer>[] tree;
	static int[] check;
	static int N;
	static void dfs(int n, int parent) {
		check[n]=parent;
		for(int i=0;i<tree[n].size();i++) {
			if(check[tree[n].get(i)]==0) {
				dfs(tree[n].get(i),n);
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	int T = N-1;
	tree = new ArrayList[N+1];
	check = new int[N+1];
	for(int i=0;i<N+1;i++) {
		tree[i]=new ArrayList<Integer>();
	}
	while(T-->0) {
		int start = sc.nextInt();
		int last = sc.nextInt();
		
		tree[start].add(last);
		tree[last].add(start);
	}
	dfs(1,1);
	for(int i=2;i<N+1;i++) {
		System.out.println(check[i]);
	}
}}
