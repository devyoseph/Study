import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int N = Integer.parseInt(br.readLine());
	 for(int i=0; N>0; i++) {
		 if(Integer.toString(i).contains("666")) N--;
		 if(N==0) {System.out.print(i);
	 }
}}}
