import java.io.*;
public class Main {
	static int[] arr;
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	 int[] counting = new int[10001]; //카운팅 배열을 만들어준다
	 int N = Integer.parseInt(br.readLine());
	 
     while(N-->0) {
		counting[Integer.parseInt(br.readLine())]++; //배열 안에 값을 넣어주면서 세어준다
	 }
     
	 for(int i=0; i<10001; i++) {  //기록된 수만큼 index를 호출한다
		for(int j=0; j<counting[i]; j++) {
			bw.write(i+"\n");
		}
	 }
     
	 bw.flush();
	 bw.close();
}}
