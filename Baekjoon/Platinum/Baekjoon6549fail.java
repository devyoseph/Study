import java.io.*;
import java.util.*;
public class Main {
	static int max;
	static Stack<Integer> stack = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	static void getMax(int N, int now) {
		if(N>stack.peek()) {
			stack.push(N);
			stack2.push(now);
			return;
		}
		int last = now;
		while(N<stack.peek()) {
			last=stack2.pop();
			max=Math.max(stack.pop()*(now-last), max);
		}
		if(N==stack.peek()) return;
		else {
			stack.push(N);
			stack2.push(last);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			max=0;
			st=new StringTokenizer(br.readLine()," ");
			int n =Integer.parseInt(st.nextToken());
			if(n==0) break;
			stack.push(0);
			int i=1;
			while(st.hasMoreTokens()) {
				getMax(Integer.parseInt(st.nextToken()),i);
				i++;
			}
			getMax(0,i);
			System.out.println(max);
			stack.clear();
		}
}}
