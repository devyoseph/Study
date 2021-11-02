import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static int[] arr;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String s = br.readLine();
	 int index=-1;
	 int sum=0;
	 String plus,minus="";
	 
	 if(s.contains("-")) { // -를 포함하고 있다면 plus와 minus를 나누어 저장한다
			 index=s.indexOf("-");
			 minus=s.substring(index);
			 plus=s.substring(0,index);
	 } else plus=s;
     
	 StringTokenizer st = new StringTokenizer(plus,"+");
     
	 while(st.hasMoreTokens()) { //plus 부분 나눠주기
		 String s1 = st.nextToken();
		 int i=0;
		 while(s1.charAt(i)=='0') { //처음부분이 0이 아닌 곳부터 값을 가져온다
			 i++;
		 }
		 sum+=Integer.parseInt(s1.substring(i, s1.length()));
	 }
     
	 st = new StringTokenizer(minus,"+|-"); //+와 - 모든 기호를 기준으로 쪼갠다
     
	 while(st.hasMoreTokens()) {
		 String s1 = st.nextToken();
		 int i=0;
		 while(s1.charAt(i)=='0') {
			 i++;
		 }
		 sum-=Integer.parseInt(s1.substring(i, s1.length()));
	 }
	 System.out.print(sum);
}}
