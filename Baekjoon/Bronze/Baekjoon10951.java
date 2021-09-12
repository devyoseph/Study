import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
           StringTokenizer st;
           int a,b;
//백준에서는 끝나는 조건이 없을 때
//Buffered에서는 값을 입력하지 않으면 null값을 입력하는 것을 이용해
//while문의 연쇄를 끊어준다
           String s;
             	while(true) {
          s=br.readLine();
          if( s == null) {break;}
            st = new StringTokenizer(s," ");
          
          a= Integer.parseInt(st.nextToken());
           b= Integer.parseInt(st.nextToken());
        
        	   System.out.println(a+b);
             	}
           }}

