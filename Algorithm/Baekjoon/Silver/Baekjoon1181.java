import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int N = Integer.parseInt(br.readLine());
       String[] words = new String[N]; //글자를 저장하는 배열
	   for(int i=0;i<N;i++) {
		  words[i] = br.readLine(); //글자를 넣어준 뒤
		  }
          
	   Arrays.sort(words);    //Arrays.sort를 이용해 사전순 배치를 한다
       
	   for(int i=1;i<51;i++) {
		   String save = ""; //중복되는 글자를 쓰지 않기 위해 저장 변수 설정
		   for(int j=0;j<N;j++) {
           
			   if(words[j].length()==i && !words[j].equals(save)) {
               //문자열의 비교는 equals를 쓴다
               
				   save=words[j]; //사용했던 글자를 save에 저장
                   
				   bw.write(words[j]+"\n");
                   
			   }
		   }
	   }
	   bw.flush();
	   bw.close();
}
}
