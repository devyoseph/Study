import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 int N = Integer.parseInt(br.readLine());
	 for(int i =2; i<=N; i++) {
		 while(N%i ==0) {
			 N = N/i;
			 bw.write(i+"\n");
		 }
		 if(N==1) {
			 break;
		 }
	 }
	 bw.flush();
	 bw.close();
}
}
