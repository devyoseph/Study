import java.io.*;
import java.util.*;

public class Main {
	static int[] parents;

	static int find(int a) { 
	    if(parents[a]==a) return a;

	    parents[a] = find(parents[a]); 
	    
	    return parents[a]; 
	}

	static boolean union(int a, int b) { 
	    int aRoot = find(a); 
	    int bRoot = find(b); 
	    if(aRoot == bRoot) return false;
	    parents[aRoot] = bRoot;
	    return true;
	}
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int V = Integer.parseInt(st.nextToken());
	   int E = Integer.parseInt(st.nextToken());
	   parents = new int[V+1];
	   int[][] arr = new int[E][3];
	   
	   for(int i=1; i<=V; i++) {
		   parents[i] = i;
	   }
	   for(int i=0; i<E; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   arr[i][1] = Integer.parseInt(st.nextToken());
		   arr[i][2] = Integer.parseInt(st.nextToken());
		   arr[i][0] = Integer.parseInt(st.nextToken());
	   }

	   Arrays.sort(arr,(o1,o2)->(o1[0]-o2[0]));
	   int cnt = V-1;
	   int result = 0;
	   for(int i=0; i<E; i++) {
		   if(union(arr[i][1], arr[i][2])) {
			   result += arr[i][0];
			   cnt--;
			   if(cnt==0) i=E;
		   }
		   
	   }
	   System.out.println(result);
	}   
}