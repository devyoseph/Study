import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {
//nexttoken은 length로 불러내도 횟수가 차감된다 
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
          //StringTokenizer?
           int t = Integer.parseInt(br.readLine());
           int sum =0;
           int save = 0;
         for(int i=0; i<t;i++) {
        	 sum =0;
        	 save =0;
           StringTokenizer st = new StringTokenizer(br.readLine(),"X");
             	int count = st.countTokens();
        
             for(int j=0; j<count; j++) {
        	save = st.nextToken().length();
        	sum = sum+ save*(save+1)/2;
             }System.out.println(sum);
          }
}}
