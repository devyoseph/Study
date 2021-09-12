import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
          //StringTokenizer?
           int sum =0;
          StringTokenizer st = new StringTokenizer(br.readLine(),"X");
             int arr[] = new int[st.countTokens()];
             	int count = st.countTokens();
//length를 써도 카운트가 차감된다
//          System.out.println(st.nextToken().length());
//     
//          System.out.println(st.countTokens());
//          System.out.println(st.nextToken());
//         
//          System.out.println(st.countTokens());         
//          System.out.println(st.nextToken());
          int save = 0;
             for(int i=0; i<count; i++) {
        	save = st.nextToken().length();
        	sum = sum+ save*(save+1)/2;
        	//sum = sum에 더하는 걸 실수함 
          }
          System.out.println(sum);
}}
