import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {
	static int[] arr;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Stack<Integer> stack = new Stack<Integer>();
	 StringBuilder sb = new StringBuilder();
	 StringTokenizer st;
	 int N = Integer.parseInt(br.readLine());
	 arr = new int[N];
	 st = new StringTokenizer(br.readLine()," ");
	for(int i=0; st.hasMoreTokens(); i++) {
		arr[i] = Integer.parseInt(st.nextToken());}
     //여기까지 입력값을 통해 수열을 배열 안에 집어넣음   
        
        
	stack.push(0); //처음 index는 비교할 것이 없으므로 넣어주고 시작한다
	
    for(int i=1; i<N; i++) {
  
		while(!stack.isEmpty() && arr[i]>arr[stack.peek()]) {
					arr[stack.pop()] = arr[i]; }
        //arr[i]가 arr[i-1]보다 작을 때는 어차피 아래 push를 통해 index가 추가된다
        //arr[i]가 arr[i-1]보다 커지는 순간은 연산이 시작된다
        //arr[i-1]과 비교하지 않고 저장되어있는 값 모두와 비교하므로 arr[stack.peek()]와 비교한다
		
        stack.push(i);
	//현재 수가 이전 수보다 크기가 작든 크든 시행 마지막에 stack에 현재 수의 index가 저장된다
    
	}
	while(stack.size()!=0) {
		arr[stack.pop()] = -1;}//stack에 남아있는 index는 모두 -1로 바꿔준다
        
	for(int i=0; i<N; i++) {
		sb.append(arr[i]+" ");
	} //배열을 텍스트화
    
	System.out.print(sb.toString());
}}
