import java.io.*;
public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char[] first = br.readLine().toCharArray();
	char[] second = br.readLine().toCharArray();
	int[] max = new int[second.length]; 
	Integer[] index = new Integer[second.length];
	int out=0;
	for(int i=0;i<first.length;i++) {
		for(int j=0;j<second.length;j++) {
			if(first[i]==second[j]) {
				if(index[j]==null) {
					index[j]=i;
					max[j]=1;}
				for(int k=0;k<j;k++) {
					if(index[k]!=null && i>index[k] && max[k]+1>max[j]) { 
						max[j]=max[k]+1;
						index[j]=i;}}}
			out=Math.max(out, max[j]);}}
System.out.print(out);
}}
