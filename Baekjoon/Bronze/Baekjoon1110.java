import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //  BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
           int num = Integer.parseInt(br.readLine());
           int a = 0;
           int b = 0;
           int result =0;
           int count = 0;
           result = num;
          //각 자리수 반환 
while(true) {
	    
        if(result>=10) {
           a = result/10;
           b = result-a*10;
        }
        if(result<10) {   
        	a=0;
        	b=result;
        }
           //각 자리수 더한 것 = a + b;
        //결과값 뒷자리 = a+b 거나 a+b-10이거나
        
        if(a+b>=10) {
        	result = b*10+(a+b-10);
        }
        if(a+b<10) {
        	result = b*10+(a+b);
        }
        count ++;
        if(result == num) {break;}
}       System.out.println(count);    
}}

