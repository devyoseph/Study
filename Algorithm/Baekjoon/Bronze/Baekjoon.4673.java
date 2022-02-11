import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
          //hash set에 10000개를 집어넣고 모두 빼기?
          /*  생성자 나열: a b c d
               1자리수: 2d
               2자리수: 11c + 2d
               3자리수: 101b + 11c + 2d
               4자리수: 1001a + 101b + 11c + 2d
         */
           
           //합쳐서 메소드를 만들자
           //자리수를 입력하면 1~4 변수를 개수만큼 사용 맨 앞자리 0만안됨
           //1001a + 101b + 11c + 2d가 반복됨
            HashSet<Integer> hs = new HashSet<Integer>();
           for(int i=1; i<=10000; i++) {
        	   hs.add(i);
           }
           int sum=0;
          for(int a=0; a<10;a++) {              	
        	  sum=0;
        	  for(int b=0; b<10;b++) {
            	   for(int c=0; c<10;c++) {
            		   for(int d=0; d<10;d++) {
            			   sum=1001*a+101*b+11*c+2*d;
            			   hs.remove(sum);
            			   
            		   }
            	   }
               }
           }

         
           Iterator<Integer> it = hs.iterator();
           while(it.hasNext()) {
        	   System.out.println(it.next());
           }
               
	}
}
