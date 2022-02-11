import java.io.*;
import java.util.*;
public class Main {
	static int MAX,idx;
	static ArrayList<Node>[] tree;
	static boolean[] check;
	static class Node{
		int num, weight;
		Node(int num, int weight){
			this.num = num;
			this.weight =weight;
		}
	}
	static void dfs(int n, int sum) {
		check[n] = true;
		if(MAX<sum) {
			MAX = sum;
			idx = n;
		}
		for(int i=0;i<tree[n].size();i++) {
			if(!check[tree[n].get(i).num]) {
				dfs(tree[n].get(i).num,sum+tree[n].get(i).weight);
			}
		}
	}
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int node = Integer.parseInt(br.readLine());
	tree = new ArrayList[node+1];
	check = new boolean[node+1];
	for(int i=0; i<node+1;i++) {
		tree[i] = new ArrayList<>();
	}
	for(int i=1;i<=node;i++) {
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int v = (st.countTokens()-1)/2;
		while(v-->0) {
			tree[num].add(new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
	}
	dfs(1,0);
	check = new boolean[node+1];
	dfs(idx,0);
	System.out.println(MAX);
}}
