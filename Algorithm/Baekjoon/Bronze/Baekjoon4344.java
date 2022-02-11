import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {
/*계속 오류 난 이유 Double이 까다롭다
	double count =0; 하고 반복문 안에서 
	count ++; 하니까 정수가 되어버렸다 = 계산들이 다 망가짐
    딴건 모르겠고 String.format("%.3f", 숫자) 이것만 기억하자
	*/
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
          //StringTokenizer?
           DecimalFormat df = new DecimalFormat("0.000");
           double t = Integer.parseInt(br.readLine());
           double sum=0;
           double num = 0;
           double avg = 0;
           double score =0;
           double count =0;
           double arr[];
    for(int i=0; i<t; i++) {
    	sum=0;
    	num = 0;
    	avg = 0;
    	score =0;
    	count =0;
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	num = Integer.parseInt(st.nextToken());
    	arr = new double[(int) num];
    	for(int j=0; j<num; j++) {
    		arr[j] =Double.parseDouble(st.nextToken());
    		sum = sum + arr[j];
    	}
    	avg=sum/num;
    	for(int j=0;j<num;j++) {
    		if(arr[j]>avg) {
    			count =count +1.0;
    		}
    	}
 
    	double answer = (count/num)*100;
    	System.out.println(String.format("%.3f", answer)+"%");
    }
          
}}
