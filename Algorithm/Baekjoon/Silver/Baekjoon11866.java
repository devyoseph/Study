import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 Queue<Integer> queue = new LinkedList<>();
	 StringBuilder sb = new StringBuilder();
	 int N = sc.nextInt();
	 int K = sc.nextInt();
	 for(int i=1; i<N+1; i++) {
		 queue.offer(i); //숫자를 넣어준다
	 }
	 for(int i = 0; i<N; i++) {
		 for(int j=0; j<K-1; j++) {
			 queue.offer(queue.poll()); //K-1번 뒤로 넣어준다
		 }
		 sb.append(", ").append(queue.poll()); //맨 위의 숫자를 pop
	 }
	 sb.delete(0, 2).append(">"); //앞 ", "의 문자열을 제거해준다
	 System.out.print("<"+sb.toString());
}}
