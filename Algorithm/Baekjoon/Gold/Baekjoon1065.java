import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringBuilder sb = new StringBuilder();
           int N = Integer.parseInt(br.readLine());
          //2 자리수 이하 
           if(N<100) {
        	   System.out.println(N);
          //3 자리수 이하
           } else if(N>=100 && N<1000) {
        	   int sum = 99;
        	  for(int i = 100; i<N+1;i++) {
        		int a = i/100;
        		int b = (i%100)/10;
        		int c = i%10;
        		if( a-b == b-c) {
        			sum++;
        		}
        	  }
        	  System.out.println(sum);
           } else if( N == 1000) {
        	   System.out.println(144);
           }
	}
}


