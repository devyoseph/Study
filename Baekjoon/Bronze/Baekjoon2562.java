import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
  //         StringTokenizer st = new StringTokenizer(br.readLine());
           String str[] = new String[9];
           for(int i=0; i<9;i++) {
        	   StringTokenizer st = new StringTokenizer(br.readLine());
               str[i] = st.nextToken();
          
           }
//count를 0으로 배정해둬서 틀렸다
//모두 같은 수 일 경우를 생각했어야 함
           int count=1;
           int max=Integer.parseInt(str[0]);
          
           for(int i =0;i<9;i++) {
        	   if(max< Integer.parseInt(str[i])) {
        		   max = Integer.parseInt(str[i]);
        	   count = i+1;
        	   }
   //     	   if(min> Integer.parseInt(str[i])) {
      //  		   min = Integer.parseInt(str[i]);
        //	   }
           }
           System.out.print(max+"\n"+count);
}}

