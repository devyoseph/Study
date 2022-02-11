import java.io.*;
import java.util.Stack;
public class Main {
	static int[] arr;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Stack<Character> stack= new Stack<Character>();
	 StringBuilder sb = new StringBuilder();
	 char[] arr;
	 boolean no =false;
	while(true) {
		no=false;  //문장마다 초기
		arr = br.readLine().toCharArray();
     	if(arr[0]=='.')break; // "."을 입력받으면 종료한다
		
		for(int i=0; i<arr.length-1; i++) {  //-1하는 이유: 마지막에 .은 제외
			switch(arr[i]) {
			case'(': stack.push('('); break;
			case'[': stack.push('['); break;
			case')': if(stack.isEmpty()?false:stack.peek()=='(')stack.pop(); 
			//stack의 peek는 stack이 비어있으면 사용하지 못하기 때문에 비어있을 때만 출력한다
			             else { no = true; i+=arr.length;} break;
			case']':  if(stack.isEmpty()?false:stack.peek()=='[')stack.pop();
                         else { no = true; i+=arr.length;} break;
		    }
		}
		if(no==true || stack.isEmpty()==false) {
			System.out.println("no"); }
		if(no==false && stack.isEmpty()==true) {
			System.out.println("yes"); }
		
		stack.clear(); //스택을 초기화해준다
	}
}}
