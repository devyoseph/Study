import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	Stack<Integer> stack = new Stack<Integer>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	while(true) {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		if(N == 0) break;
		
		int[] height = new int[N];
		long MAX = 0;
		for(int i=0; i<N;i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			while(!stack.isEmpty() && height[stack.peek()]>height[i]) {
				int idx = stack.pop();
				int width = stack.isEmpty()? i: i-stack.peek()-1;
				MAX = Math.max(MAX, (long)width*height[idx]);
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int idx = stack.pop();
			int width = stack.isEmpty()? N: N-stack.peek()-1;
			MAX = Math.max(MAX, (long)width*height[idx]);
		}
		System.out.println(MAX);
	}
}
}
