import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	 int T = Integer.parseInt(br.readLine());

	 for(int i =0; i<T; i++) {
	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	 int H = Integer.parseInt(st.nextToken());
	 int W = Integer.parseInt(st.nextToken());
	 int N = Integer.parseInt(st.nextToken());
	 
	 String row = "";
	 String column = Integer.toString(N%H);
	 if(N%H ==0) {
		 row = Integer.toString(N/H);
		 column = Integer.toString(H);
	 }else if(N%H !=0){
	     row = Integer.toString(N/H+1);}
	 //column은 층, row는 방 번호
	 if(row.length()<2) {
	   bw.write(column+0+row+"\n");
	   bw.flush();
	 }
	 else if(row.length()>=2) { 
		   bw.write(column+row+"\n");
		   bw.flush();
		 }
	 }
	 bw.close();
}
}
