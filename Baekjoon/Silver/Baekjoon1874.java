import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {
	static int[] arr;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Stack<Integer> storage = new Stack<Integer>();
	 Stack<Integer> stack = new Stack<Integer>();
	 StringBuilder sb = new StringBuilder();
	 StringTokenizer st;
	 int input;
	 int now=0;   //now는 stack의 top의 값이다
	 boolean no = false;
	 int N = Integer.parseInt(br.readLine());
     for(int i=N; i>0; i--) {
    	 storage.push(i);
     } //저장 stack에 거꾸로 집어넣는다
     for(int i=0; i<N; i++) {
    	 input = Integer.parseInt(br.readLine()); //한줄 한줄의 입력값 input
    	 if(input<now) { //입력값이 now보다 작아지면 종료 후 NO출력
    		 no = true; i +=N;
    	 }
    	 while(input>now) {
    		 stack.push(storage.pop()); //storage에서 가져온다
    		 now = stack.isEmpty()?0:stack.peek();
             //stack의 크기가 0이되면 stack.peek()를 사용할 수 없다.
             //그래서 stack이 비어있는 경우 0을 출력하도록 한다
    		 sb.append("+"+"\n");
    	 }
    	 if(input==now) {
    		 stack.pop();
    		 now = stack.isEmpty()?0:stack.peek();
    		 sb.append("-"+"\n");
    	 }
     }
     System.out.print(no?"NO":sb.toString());
}
}
