import java.io.*;
import java.util.*;
public class Main {
	static ArrayList<Node>[] tree;
	static int MAX,index; // 지름의 최대값을 기록하는 곳
	static boolean check[]; //방문체크
	static class Node{
		int num,len; //현재 숫자와 길이 저장
		Node(int num, int len){
			this.num = num;
			this.len = len;
		}
		
	}
	static void dfs(int n, int sum) {
		check[n]=true;
		if(MAX<sum) {
			MAX = sum;
			index = n;
		}
		for(Node node : tree[n]) {
				if(!check[node.num]) {
					dfs(node.num,sum+node.len);
				}
		}
	}
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int node = Integer.parseInt(br.readLine());
	tree = new ArrayList[node+1];
	for(int i=0;i<=node;i++) {
		tree[i] = new ArrayList<>();
	}
	int N = node - 1;

	while(N-->0) {
		st = new StringTokenizer(br.readLine());
		int parent = Integer.parseInt(st.nextToken());
		int child = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		tree[parent].add(new Node(child,len));
		tree[child].add(new Node(parent,len));
	}
	check = new boolean[node+1];
	dfs(1,0);
	check = new boolean[node+1];
	dfs(index,0);
	System.out.println(MAX);
}}
