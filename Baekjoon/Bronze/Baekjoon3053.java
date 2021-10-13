import java.io.*;
import java.text.DecimalFormat;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 DecimalFormat df = new DecimalFormat("0.00000");
	 double RR = Math.pow(Double.parseDouble((br.readLine())),2);
	 //제곱해서 가져온다
	 double euclid = RR*Math.PI;
	 double taxi = RR*2;
	 
	 System.out.println(df.format(euclid));
	 System.out.println(df.format(taxi));
}
}
