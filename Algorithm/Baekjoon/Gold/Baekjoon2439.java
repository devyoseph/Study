import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
//값을 받는다     
           int t = Integer.parseInt(br.readLine());
//일단 총 줄의 개수는 t개일 것이므로 i의 범위가 t까지다
           for(int i =1; i<=t; i++) {
//t가 100이라면 1번째 줄에는 띄어쓰기를 99번해야한다
//그래서 j를 거꾸로 내려오게 한다 초기값을 t-1
//그래서 1까지 줄어들어 첫번째 줄에는 99번의 띄어쓰기와 하나의 *이 만들어진
//###마지막 줄에 띄어쓰기가 들어가지 않도록 주의한다
        	   for(int j =t-i; j>0; j--) {
        		 
        	   bw.write(" ");}
//별은 매 줄마다 1부터 i 까지 증가한다        	   
        	   for(int k =1; k<=i; k++) {
          		 
            	   bw.write("*");}
        	   bw.write(" ");
        	   bw.write("\n");
           }
           bw.flush();
           bw.close();
              
    }
}
