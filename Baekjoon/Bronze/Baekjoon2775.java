import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int[][] arr = new int[15][15];
	 for(int i =0; i<15; i++) {
		 arr[0][i] = i;
		 arr[i][1] = 1;
	 }
	 for(int k =1; k<15; k++) {
		 for(int n =2; n<15; n++) {
			 arr[k][n] = arr[k-1][n] + arr[k][n-1];
		 }
	 }
	 int k, n;
	 int T = Integer.parseInt(br.readLine());
	 for(int i=0; i<T; i++) {
		k = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		System.out.println(arr[k][n]);
	 }
}	 
}
