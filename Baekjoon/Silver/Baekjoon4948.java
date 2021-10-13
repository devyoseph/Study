import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 boolean[] prime = new boolean[246913];
	 int n, sum;
	 int devide =0;
	 for(int i=2; i<246913; i++) {
		 devide = 246912/i;
		 for(int j=2; j<=devide; j++) {
			 prime[i*j] = true;
		 }
	 }
	 prime[0] = true;
	 prime[1] = true;
	 while(true) {
		 sum = 0;
		 n = Integer.parseInt(br.readLine());
		 if(n==0) {
			 break;
		 }
		 for(int i=n+1; i<=2*n; i++) {
			 if(prime[i]==false) {
				sum ++;
			 }
		 }
		 bw.write(sum+"\n");
		 bw.flush();
	 }
	 bw.close();
}
}
