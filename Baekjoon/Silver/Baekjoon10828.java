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
