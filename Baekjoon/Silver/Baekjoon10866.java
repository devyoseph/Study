import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder(); //스트링빌더를 통해 출력한다 
	Deque<Integer> dq = new ArrayDeque<>();
	StringTokenizer st;
	int N = Integer.parseInt(br.readLine());
	while(N-->0) {
		st = new StringTokenizer(br.readLine()," ");
        
		switch(st.nextToken()) {
		case"push_front": dq.offerFirst(Integer.parseInt(st.nextToken()));break;
		case"push_back": dq.offerLast(Integer.parseInt(st.nextToken()));break;
		case"pop_front": sb.append(dq.isEmpty()?-1:dq.pollFirst()).append("\n");break;
		case"pop_back": sb.append(dq.isEmpty()?-1:dq.pollLast()).append("\n");break;
		case"size": sb.append(dq.size()).append("\n");break;
		case"empty": sb.append(dq.isEmpty()?1:0).append("\n");break;
		case"front": sb.append(dq.isEmpty()?-1:dq.peekFirst()).append("\n");break;
		case"back": sb.append(dq.isEmpty()?-1:dq.peekLast()).append("\n");break;
		
        //비어있으면 -1을 출력하기 때문에 dq.isEmpty()와 삼항연산자를 사용해 값을 출력한다
        }
	}
	System.out.print(sb.toString());
}
}
