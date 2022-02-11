import java.io.*;
import java.util.Stack;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Stack<Integer> stack = new Stack<Integer>();
	 int sum=0;
	 for(int i = Integer.parseInt(br.readLine()); i>0; i--) {
		 int num = Integer.parseInt(br.readLine());
		 if(num==0) {
			 sum -= stack.peek();
			 stack.pop();
		 }else {
			 sum += num;
			 stack.push(num);
		 }}
	 System.out.print(sum);
}}
