import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Integer> stack1 = new Stack<Integer>(); //탑의 높이 기록
		Stack<Integer> stack2 = new Stack<Integer>(); //탑의 인덱스 기록
		
		int N = Integer.parseInt(br.readLine());
		// 레이저 인덱스를 기록할 배열
		int[] ans = new int[N];
		
		int idx = 0;
		st = new StringTokenizer(br.readLine());
		
		while(idx<N) {
			int now = Integer.parseInt(st.nextToken());
		
			if(stack1.isEmpty()) { // 원래 비어있다면 그냥 넣어줍니다
				stack1.add(now);
				stack2.add(idx);
			} else {
				//값이 현재 넣으려는 숫자보다 큰 값을 만날 때까지 pop 합니다
				while(stack1.peek()<=now) {
					stack1.pop();
					stack2.pop();
					if(stack1.isEmpty()) {
						break;
					}
				}
				// 비어있지 않다면 현재 높이보다 큰 타워의 index를 기록합니다
				if(!stack1.isEmpty()) {
					ans[idx] = stack2.peek()+1;
				}
				stack1.add(now);
				stack2.add(idx);
			}
			idx++;
		}
		
		
		//답안 출력 부분
		for(int i: ans) {
			System.out.print(i+" ");
		}
	}

}
