import java.util.*;

public class Main {
    public static void main(String[] args) {
    Queue<Integer> Q = new LinkedList<Integer>();
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    sb.append("<");
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    for(int i=1; i<=N; i++) { //큐에 1부터 N까지 넣기
    	Q.offer(i);
    }
    
    int idx = 0;
    
    while(!Q.isEmpty()) {
    	idx ++; // idx로 실시간 순번을 기록
    	
    	if(idx%K==0) { // idx가 K의 배수가 될 때 해당 원소를 꺼내고 기록
    		sb.append(Q.poll()+", ");
    	}else {
    		Q.offer(Q.poll()); // 그 외에는 빼고 뒤로 넘김
    	}
    }
    sb.setLength(sb.length()-2); // 마지막에 더했던 ', ' 를 삭제
    sb.append(">");
    System.out.println(sb.toString());
}
}