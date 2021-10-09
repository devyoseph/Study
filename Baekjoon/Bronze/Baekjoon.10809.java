import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   		 String N= br.readLine();
	         char start = 'a';
	         for(int i =0; i<26; i++) {
	        	 System.out.print(N.indexOf((char)(start+i))+" ");
	         }
	         
	}
}

//
//import java.io.*;
// public class Main {
// public static void main(String[] args) throws IOException {
// 	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	   		 String N= br.readLine();
// 	         for(int i =0; i<26; i++) {
// 	        	 System.out.print(N.indexOf((char)(96+i))+" ");
// 	         }
	         
// 	}
// }


