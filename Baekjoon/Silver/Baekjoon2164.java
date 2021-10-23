import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Queue<Integer> queue = new LinkedList<>();
	 int N = Integer.parseInt(br.readLine());
	 for(int i = 1; i<N+1; i++) {
		 queue.offer(i);
	 }
	 for(int i = 0; i<N-1; i++) {
		 queue.poll();
		 queue.offer(queue.poll());
	 }	 
	 System.out.print(queue.poll());
}}
