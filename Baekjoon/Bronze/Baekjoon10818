import java.io.*;
import java.util.StringTokenizer;


public class Main {
public static void main(String[] args) throws IOException {

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
           int size = Integer.parseInt(br.readLine());
           StringTokenizer st = new StringTokenizer(br.readLine());
           String str[] = new String[size];
           
           for(int i =0;i<size;i++) {
        	   str[i] = st.nextToken();
           }
           //집어 넣었음, 비교해보자 
           int min =Integer.parseInt(str[0]);
           int max=Integer.parseInt(str[0]);
           for(int i =0; i<size;i++) {
        	   if(max< Integer.parseInt(str[i])) {
        		   max = Integer.parseInt(str[i]);
        	   }
        	   if(min> Integer.parseInt(str[i])) {
        		   min = Integer.parseInt(str[i]);
        	   }
           }
           System.out.print(min+" "+max);
           
}}
