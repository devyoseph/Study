import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class Main {
		static int a = 0;
		static int b = 0;
		static int t = 0;

public static void main(String[] args) {			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i=1; i<=t; i++) {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				System.out.println(a+b);
			}bw.flush(); bw.close();
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
		

}
}
