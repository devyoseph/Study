import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	 int sum = 0;
	 int diff = 0; //아래 반복문에서 쓰일 변수
	 int max = 0; // 주어진 M과 가장 가까운 수
	 int mindiff = 300000; //주어진 M값과의 차이를 저장
	 st = new StringTokenizer(br.readLine()," ");
	 int N = Integer.parseInt(st.nextToken());
	 int M = Integer.parseInt(st.nextToken());
	 
	 int[] card = new int[N]; //주어진 카드의 숫자로 배열을 생성
	 
	 st = new StringTokenizer(br.readLine()," ");
     for(int i =0; i<N; i++) {
    	 card[i] = Integer.parseInt(st.nextToken());
    	 //두번째 입력값의 카드 숫자를 배열에 넣는다
	 }
     
     for(int i=0; i<N-2; i++) {
    	 for(int j = i+1; j<N-1; j++) {
    		 for(int k = j+1; k<N; k++) { 
//i를 선택하면 다음 숫자j는 i보다 크고 k는 j보다 크다
    			 sum = card[i] + card[j] + card[k]; //뽑은 카드들을 더한다
    			 diff = M-sum;
    			 if(diff>=0 && diff<mindiff) {
    				 mindiff = diff;
    				 max = sum; //차이 양수일 때 값이 최소면 값을 갱신
    			 }
    		 }
    	 }
     }
     System.out.println(max);
}
}
