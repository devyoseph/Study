import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
	 StringBuilder sb = new StringBuilder();
     //스트링빌더를 통해 출력
     
	 Queue<Integer> queue = new LinkedList<>();
     
	 StringTokenizer st;
	 int first=0;
	 int N = Integer.parseInt(br.readLine());
	 while(N--> 0) {
     
		 st = new StringTokenizer(br.readLine()," ");
		 switch(st.nextToken()) {
         
		 case"push": first = Integer.parseInt(st.nextToken()); queue.add(first); break;
         //first 변수를 통해 back에 출력할 숫자를 기록한다
         
		 case"pop": sb.append(queue.isEmpty()?-1:queue.poll()).append("\n");break;
         //비어있는지 확인 후 poll()이나 remove()를 해준다
         
		 case"size": sb.append(queue.size()).append("\n");break;
         //size()는 어느 때나 사용할 수 있다
         
		 case"empty": sb.append(queue.isEmpty()?1:0).append("\n");break;
         
		 case"front":sb.append(queue.isEmpty()?-1:queue.peek()).append("\n");break;
         //front와 back이 헷갈릴 수 있다. front는 맨 처음 들어온, 출력 예정인 자료므로 peek()
         
		 case"back": sb.append(queue.isEmpty()?-1:first).append("\n");break;
         //Queue는 마지막에 집어넣은 숫자를 알려주는 메소드가 없다. add()할 때 기록해준다
         
		 }
	 }
     
	 System.out.print(sb.toString());
}}
