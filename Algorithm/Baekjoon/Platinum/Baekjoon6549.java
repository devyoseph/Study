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
		//높이들을 배열에 기록해줌
		for(int i=0; i<N;i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		//스택에 들어가는 값은 Index이다.
		//배열을 순회하면서 이전 높이보다 작은 높이가 들어갈 때 pop을 해서 현재 인덱스 바로 전의 높이를 기준으로 넓이들을 구해준다. 
		for(int i=0; i<N; i++) {
			while(!stack.isEmpty() && height[stack.peek()]>height[i]) {
				int idx = stack.pop();
				int width = stack.isEmpty()? i: i-stack.peek()-1; // 스택이 비었다면 현재 i가 곧 가로길이, 그 외는 그 전 인덱스+1까지의 지점
				MAX = Math.max(MAX, (long)width*height[idx]);
			}
			stack.push(i); //인덱스를 넣어준다
		}
		
		while(!stack.isEmpty()) { //내부에 남아있는 값들을 강제적으로 pop하면서 넓이를 기록
			int idx = stack.pop();
			int width = stack.isEmpty()? N: N-stack.peek()-1;
			MAX = Math.max(MAX, (long)width*height[idx]);
		}
		System.out.println(MAX);
	}
}
}
