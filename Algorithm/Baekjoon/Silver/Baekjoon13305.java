import java.io.*;
import java.util.StringTokenizer;
public class Main {
	static int[] arr;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 long N = Long.parseLong(br.readLine());
	 StringTokenizer st = new StringTokenizer(br.readLine()," ");
	 StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
	 long sum=0;
	 long min=1000000000;
	 while(N-->1) {
		 long length = Long.parseLong(st.nextToken());
		 long cost = Long.parseLong(st2.nextToken());
		 if(cost<min)min = cost;
		 sum+=length*min;
	 }
	 System.out.print(sum);
}}
