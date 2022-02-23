import java.io.*;
import java.util.*;

public class Main {
	static int[] parents;
	
	static int find(int a) {
		if(parents[a]==a) return a;
		
		parents[a] = find(parents[a]);
		return parents[a];
	}
	
	static void union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		
		parents[aRoot] = bRoot;
	}
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int N = Integer.parseInt(br.readLine());
	   parents = new int[N];
	   for(int i=1; i<N; i++) {
		   parents[i] = i;
	   }
	   int M = Integer.parseInt(br.readLine());
	   
	   for (int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   for (int j = 0; j < N; j++) {
			   if(st.nextToken().equals("1")) {
				   union(i,j);
			   }
		   }
	   }
	   
	   boolean judge = true;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int root = find(Integer.parseInt(st.nextToken())-1);
	   
	   while(M-->1) {
		   if(root!=find(Integer.parseInt(st.nextToken())-1)) {
			   judge = false;
			   break;
		   }
	   }
	   System.out.println(judge?"YES":"NO");
	}   
}