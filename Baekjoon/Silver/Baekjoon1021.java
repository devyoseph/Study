import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	Deque<Integer> deque = new ArrayDeque<>();
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	int[] extract = new int[M];
	for(int i=0; i<N; i++) {
		deque.offerLast(i+1);
	} //덱에 1부터 N의 값을 넣어줌
	
	st = new StringTokenizer(br.readLine()," ");
	
	for(int i=0; i<M;i++) { 
		extract[i]= Integer.parseInt(st.nextToken());
	} //배열 안에 값을 넣는다
	
	int sum=0;
	for(int i=0; i<M; i++) {
		int find = extract[i];
		int trying=0;  // 시행횟수 = pop을 카운트해준다
		int size = deque.size();
	    while(true) {
	    	if(deque.peekFirst()==find) {
	    		deque.pollFirst(); //찾는값과 일치하는 순간 값을 꺼내고 종료
	    		break;
	    	}
	    	trying++;
	    	deque.offerLast(deque.pollFirst());
	    }
	    sum+=trying>size/2?size-trying:trying;
	    // 부등호가 >=이 아님을 주의한다. 정수 연산이기 때문에 홀수를 나누는 경우를 주의한다
	    // 시행횟수가 자료크기의 절반 보다 크면 빼주고, 작으면 그대로 사용한다
     }
	 System.out.println(sum);
}
}
