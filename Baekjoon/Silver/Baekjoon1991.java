import java.io.*;
import java.util.*;
public class Main {
	static ArrayList<Integer>[] tree;
	static void preorder(int n) {
		if(n<0) return;
		char c = (char) (n+65);
		System.out.print(c);
		preorder(tree[n].get(0));
		preorder(tree[n].get(1));
	}
	static void inorder(int n) {
		if(n<0) return;
		char c = (char) (n+65);
		inorder(tree[n].get(0));
		System.out.print(c);
		inorder(tree[n].get(1));
	}
	static void postorder(int n) {
		if(n<0) return;
		char c = (char) (n+65);
		postorder(tree[n].get(0));
		postorder(tree[n].get(1));
		System.out.print(c);
	}
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int N = Integer.parseInt(br.readLine());
	tree = new ArrayList[N];
	for(int i=0;i<N;i++) {
		st = new StringTokenizer(br.readLine());
		int node = st.nextToken().charAt(0)-65;
		int left =  st.nextToken().charAt(0)-65;
		int right =  st.nextToken().charAt(0)-65; // . 은 46이므로 음수가 된다
		tree[node]=new ArrayList<Integer>();
		tree[node].add(left); //left 값은 0번째 index 에 들어가고
		tree[node].add(right); //right 값은 1번째 index에 들어간다
	}
	preorder(0);
	System.out.println();
	inorder(0);
	System.out.println();
	postorder(0);
}}
