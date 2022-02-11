import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static int num=0;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 StringTokenizer st;
	 int N = Integer.parseInt(br.readLine());
	 String[] arr = new String[N+1];
	 while(N-- >0) {
		 st = new StringTokenizer(br.readLine(), " ");
		 switch(st.nextToken()) {
		 case"push":num++; arr[num]=st.nextToken(); break;
		 case"pop": if(num==0) bw.write(-1+"\n");
			                if(num!=0) {bw.write(arr[num]+"\n"); arr[num]="";num--;}break;
		 case"top": if(num==0) bw.write(-1+"\n");
                           if(num!=0) bw.write(arr[num]+"\n");break;
		 case"size":bw.write(num+"\n");break;
		 case"empty":if(num==0) bw.write(1+"\n");
                              if(num!=0) bw.write(0+"\n");break;
		 }
	 }
	 bw.flush();
	 bw.close();
     //한번에 출력해도 정답으로 처리된다
}}

//스택 클래스를 활용한다
// import java.io.*;
// import java.util.Stack;
// import java.util.StringTokenizer;
// public class Main {
// public static void main(String[] args) throws IOException{
// 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	 Stack<Integer> stack = new Stack<Integer>();
// 	 StringTokenizer st;
// 	 for(int i = Integer.parseInt(br.readLine()); i>0; i--) {
// 		st = new StringTokenizer(br.readLine()," ");
// 		switch(st.nextToken()) {
// 		case"push": stack.push(Integer.parseInt(st.nextToken())); break;
// 		case"pop": System.out.println(stack.isEmpty()?-1:stack.pop()); break;
// 		case"top": System.out.println(stack.isEmpty()?-1:stack.peek()); break;
// 		case"size": System.out.println(stack.size()); break;
// 		case"empty": System.out.println(stack.isEmpty()?1:0); break;
// }}}}
