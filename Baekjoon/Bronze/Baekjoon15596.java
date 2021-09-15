import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //       BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
          //StringTokenizer?
         
           StringTokenizer st = new StringTokenizer(br.readLine()," ");
           int n=st.countTokens();
           int[] arr = new int[n];
           int a=0;
           for(int i=0; i<n; i++) {
        	   	a=Integer.parseInt(st.nextToken());
        	   	arr[i]=a;
        	}
        	Test t = new Test();
        	System.out.println(t.sum(arr));
}}

class Test{
	long sum(int[] a) {
		long sum=0;
		for(int i=0; i< a.length;i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
