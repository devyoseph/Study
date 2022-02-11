import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
 //반복문을 두번 돌린다 0~9 서칭 , 문자안에서 서칭
 //숫자를 문자로 바꾼다음 문자열에서 서칭한다
 //문자열 수 반환 = str.length();
 //문자열 하나 가져오기 .charAt(index);
           //char은 작은 따옴표 ' ' 안에 가둔다는 것을 주의 
           int A,B,C;
           String GOP;
           A=Integer.parseInt(br.readLine());
           B=Integer.parseInt(br.readLine());
           C=Integer.parseInt(br.readLine());
           GOP=String.valueOf(A*B*C);
           final int length = GOP.length();
           int[] arr = new int[10];
           //arr[0~length-1)
           for(int i=0; i<length; i++) {
           switch(GOP.charAt(i)){
           case '0': arr[0] ++;
        		   	break;
           case '1': arr[1] ++;
		   	break;	   	
           case '2': arr[2] ++;
		   	break;	   	
           case '3': arr[3] ++;
		   	break;	   	
           case '4': arr[4] ++;
		   	break;	   	
           case '5': arr[5] ++;
		   	break;	   	
           case '6': arr[6] ++;
		   	break;	   	
           case '7': arr[7] ++;
		   	break;	   	
           case '8': arr[8] ++;
		   	break;	  
           case '9': arr[9] ++;
		   	break;	  
           }
        	   }
           for(int out : arr) {
        	   System.out.println(out);
           }
           

}}

