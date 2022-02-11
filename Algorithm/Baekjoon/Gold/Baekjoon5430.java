import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 Deque<Integer> deque = new ArrayDeque<>();
	 StringTokenizer st;
	 StringBuilder sb  = new StringBuilder();
	 int T = Integer.parseInt(br.readLine());
     
	 for(int i =0; i<T; i++) {
		 boolean error = false;  //에러를 출력할 변수
		 boolean left =true; // 방향을 알려주는 변수
		 
         char[] order = br.readLine().toCharArray(); //RDDD명령을 배열에 넣는다
		
         int size=Integer.parseInt(br.readLine()); 
         
		 String s = br.readLine();
         
		 sb.append(s).delete(s.length()-1, s.length()).delete(0, 1); //입력 배열의 []를 잘라준다
		 st= new StringTokenizer(sb.toString(),","); // ","을 기준으로 나눈다
         
		 sb.delete(0, sb.length()); //sb를 이후에 사용하므로 초기화
         
		for(int j=0; j<size; j++) {
			deque.offerLast(Integer.parseInt(st.nextToken())); //deque에 집어넣는다
		}
        
		for(int j=0; j<order.length;j++) {
			switch(order[j]) {  //배열에 넣은 명령들을 수행
			case'R': left=left==true?false:true; break; //left의 현재 방향과 반대로 만들어준다
			case'D': if(deque.isEmpty()) { //비어있다면 반복문을 멈추고 error 변수를 켜준다
						 error=true; j+=order.length; break;}
						if(left)deque.pollFirst();else deque.pollLast();break;
                        //방향 변수에 따라 삭제되는 부분이 달라진다
			}
		}
		if(!error && left) {
		while(!deque.isEmpty()) {
			sb.append(",").append(deque.pollFirst());}}
            
		if(!error && !left) {
			while(!deque.isEmpty()) {
				sb.append(",").append(deque.pollLast());}}
         //방향 변수에 따라 출력방향이 달라진다
         
		sb.delete(0,1).append("]");
        
		 System.out.println(error?"error":"["+sb.toString());
         
		 sb.delete(0, sb.length());
		 deque.clear(); //사용한 스트링빌더와 데큐를 초기화
	 }
}
}
