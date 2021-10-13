import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	 int[] x = new int[3];
	 int[] y = new int[3];
	 boolean[] overlapX = new boolean[3];
	 boolean[] overlapY = new boolean[3];
	 int X=0,Y=0; 
	 for(int i =0; i<3; i++) {
		 st = new StringTokenizer(br.readLine(), " ");
		 x[i] = Integer.parseInt(st.nextToken());
		 y[i] = Integer.parseInt(st.nextToken());
	 }
	 for(int i =0; i<3;i++) {
		 for(int j =0; j<3; j++) {
			 if(i != j) {
			 if(x[i]==x[j]) {
				 overlapX[i] = true;
				 overlapX[j] = true;
			 }
			 if(y[i]==y[j]) {
				 overlapY[i] = true;
				 overlapY[j] = true;
			 }
		 }
		 }
	 }
	 for(int i =0; i<3; i++) {
		 if(overlapX[i] == false) {
			 X = x[i];
		 }
		 if(overlapY[i] == false) {
			 Y = y[i];
		 }	 
	 }
	System.out.print(X+" "+Y); 
}
}
