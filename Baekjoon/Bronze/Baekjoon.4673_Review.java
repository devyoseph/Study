import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
           //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringBuilder sb = new StringBuilder();
         //10001로 하는 이유: 배열은 0부터 시작하기 때문에 값을 꺼낼 때 연산을 줄인다
           boolean[] all = new boolean[10001];
           //논리 배열문을 생성하면 기본값은 모두 false이다
           for(int i = 0; i<10001; i++) {
           //d메소드를 적용한 값이 erase에 적용된다, 0도 적용됨을 알 수 있다
        	   int erase = d(i);
        	   if(erase <10001) {
        		   //i가 아니라 erase 를 적용함을 주의
        		   all[erase] = true;
        	   }
           }
         
           for(int i  =0; i<10001; i++) {
        	   //위에서 생성했던 숫자들은 true로 변경했으므로 false를 골라낸다 
        	   if(all[i]==false) {
        		  sb.append(i).append('\n');
        	   }
           }
       
           System.out.println(sb);

}  
       
	

public static int d(int num) {
	int sum = num;
	
	while(num != 0) {
		sum +=  num%10;
		num = num/10;
	}
	
	return sum;
}
}
