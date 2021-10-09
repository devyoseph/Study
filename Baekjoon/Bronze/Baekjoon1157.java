import java.io.*;

public class Main {
public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   int[] arr = new int[26];
	   int max = 0;
	   char ch ='?';
	   int count = 0;
	   String s = br.readLine().toUpperCase();
	   for(int i =0; i<26; i++) {
		   arr[i] = countChar(s,(char)(65+i));
	   }
	   for(int i = 0; i<26; i++) {
		   if(arr[i]>max) {
			   max = arr[i];
			   ch = (char)(65+i);
		   }
	   }
	   for(int i =0; i<26; i++) {
		   if(max == arr[i]) {
			   count ++;
		   }
	   }
	   if(count ==1) {
		   System.out.println(ch);
	   }else { System.out.println("?");}
	}

private static int countChar(String s, char c) {
	int count = 0;
	for(int i =0; i<s.length(); i++) {
		if(s.charAt(i)==c) {
			count++;
		}
	}
	return count;
}
}
