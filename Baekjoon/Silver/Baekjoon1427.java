import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	 int[] count = new int[10];
	 for(int i=0; i<10;i++) {
		 int j=System.in.read()-48; //아스키 코드 한자리 숫자에서 48을 빼면 된다
		 if(j>-1)count[j]++;else i=10;
	 }
	 for(int i=9;i>-1;i--)for(int j=0;j<count[i];j++)System.out.print(i);
}}
