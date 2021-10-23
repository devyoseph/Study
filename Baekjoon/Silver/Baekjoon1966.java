import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static int max;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 StringTokenizer st;
	 int T = Integer.parseInt(br.readLine());
	 while(T--> 0) {
		 st = new StringTokenizer(br.readLine()," ");
		 int N = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
         
		 int[] priority = new int[10];
         //중요도 배열, 3index에는 중요도 3에 해당하는 문서의 개수
		 
         int[] document = new int[N]; //각 문서들의 중요도가 들어간다
         
		 int count =0; //현재까지 문서를 출력한 개수
		 int out =-1; //문서를 출력할 때 out을 통해 현재 출력하는 문서의 번호를 기억
         
		 int now=0; //while문을 사용하기에 현재 index번호를 계속 돌려줄 now를 지정
         
		 st = new StringTokenizer(br.readLine()," ");
		 
         for(int i=0; i<N; i++) {
			 int num = Integer.parseInt(st.nextToken());
			 priority[num]++; //문서들의 중요도 분류
			 document[i] = num;
		 }
         
		 findMax(priority); //중요도의 최대값을 찾는다
		 
         while(out!=M) {
			 if(document[now]==max) { //최대값과 같은 값만 출력
				 out = now;
				 document[now]=0; //출력한 문서는 중요도 0으로 바꿈
				 count++;
				 priority[max]--;
				 findMax(priority);
			 } 
			 now++;
			 if(now==N) { //now가 배열에 끝에 다다를 때마다 처음으로 위치를 돌려준다
				 now=0;
			 }
		 }
		bw.write(count+"\n");
	 }
	 bw.flush();
	 bw.close();
}
public static void findMax(int[] priority) {
	for(int i=9; i>=1; i--) {  
		if(priority[i]!=0) {
			max = i;
			i=0;
		}}
	//중요도 9부터 0이 아닌 값을 발견한 순간 max로 갱신하고 반복문을 닫는다
}
}
