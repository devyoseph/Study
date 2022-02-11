import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 boolean isSIX = false;
	 int sum=1;
	 String s;
	 int[] SIX = new int[10001];
	 for(int i=666; sum<10001; i++) {
		 s = String.valueOf(i);
		 int n = s.length();
		 isSIX = false;
		 for(int j=0; j<s.length()-2;j++) {
			 if(s.indexOf("666")!=-1) {
				isSIX = true;
			 }
		 }
		 if(isSIX) {
			SIX[sum] = i;
			sum++;
		 }
	 }
	 int N = Integer.parseInt(br.readLine());
	 System.out.println(SIX[N]);
}
}
