import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
    Queue<Integer> queue = new LinkedList<Integer>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    int  t = 1;
    while(true) {
    	//입력값들 받아주는 곳입니다.
        String s = br.readLine();
        if(t==11) break;
        sb.append("#"+s);
        st = new StringTokenizer(br.readLine());
        
        
        //8개의 암호를 큐에 넣어줍니다
        for(int i=0; i<8;i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        int minus = 1; //마이너스 하는 숫자는 계속 1~5 증가를 반복합니다
        while(true) {
            if(minus==6) minus = 1;
            if(queue.peek()-minus>0) {
                queue.offer(queue.poll()-minus);
            }else {
                queue.poll();
                queue.offer(0);
                break;
            }
            minus++;
        }
        
        //답안 출력부 
        for(int i=0; i<8;i++) {
            sb.append(" "+queue.poll());
        }
        
        System.out.println(sb.toString());
        sb.setLength(0);
        t++;
    }
}
}
