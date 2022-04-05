import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<Integer>();
        
        int cnt = 1; // 처음 투 포인터 안에 종류의 개수
        int MAX; //최대값 기록
        
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] counting = new int[d+1]; // 초밥 카운팅 배열
        int[] list = new int[k]; //맨 처음 리스트를 저장 = 회전초밥이므로 나중에 사용 
        counting[c] ++; // 쿠폰 번호를 미리 추가
        
        //초기 명단 작성
        for(int i=0; i<k; i++) {
        	int num = Integer.parseInt(br.readLine());
        	list[i] = num;
        	counting[num] ++;
        	if(counting[num]==1) {
        		cnt ++;
        	}
        	q.add(num);
        	//System.out.println(num);
        }
        //System.out.println(Arrays.toString(list));
        MAX = cnt;
        for(int i=0; i<N-k; i++) {
        	int in = Integer.parseInt(br.readLine());
        	
        	int out = q.poll();
        	counting[out] --;
        	if(counting[out]==0) {
        		cnt --;
        	}
        	q.add(in);
        	counting[in] ++;
        	if(counting[in]==1) {
        		cnt ++;
        	}
        	if(MAX < cnt) {
        		MAX = cnt;
        	}
        }
       for(int i=0; i<k; i++) {
    	   int in = list[i];
    	   int out = q.poll();
	       	counting[out] --;
	       	if(counting[out]==0) {
	       		cnt --;
	       	}
	       	q.add(in);
	       	counting[in] ++;
	       	if(counting[in]==1) {
	       		cnt ++;
	       	}
	       	if(MAX < cnt) {
        		MAX = cnt;
        	}
       }
       System.out.println(MAX);
        
    }
}