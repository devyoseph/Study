import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	 StringBuilder sb = new StringBuilder();
	 int N = Integer.parseInt(br.readLine());
	 int[] H = new int[N];
	 int[] W= new int[N];
	 for(int i =0; i<N; i++) {
		 st = new StringTokenizer(br.readLine()," ");
		 W[i] = Integer.parseInt(st.nextToken());
		 H[i] = Integer.parseInt(st.nextToken());
	 }
	 for(int i = 0; i<N; i++) {
		 int r = 1; //count +1하지 않고 1에서 시작한다
		 for(int j=0; j<N; j++) {
			 if(H[j]>H[i] && W[j]>W[i]) {
				 r++;
			 }
		 }
		 sb.append(r+" ");
	 }
	 System.out.print(sb.toString());
}
}
