import java.io.*;
import java.util.Stack;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Stack<Integer> stack = new Stack<Integer>();
	 char[] arr;
	 int length;
	 for(int i = Integer.parseInt(br.readLine()); i>0; i--) {
		 int count =0; // (가 ++ )가 --
		 int index =0;
		 arr = br.readLine().toCharArray(); //배열의 형태로 집어넣기
		 while(count>=0 && index<arr.length) {
         //count가 0보다 작아지는 순간 while문이 멈춘다
			 if(arr[index]=='(') {
				 count++;
			 }else count--;
			 index++;
		 }
		 if(count !=0)System.out.println("NO");
		 else System.out.println("YES");
	 }
}}
