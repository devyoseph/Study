import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	 int max = 0;
	 int[] arr = new int[3];
	 while(true) {
		 max =0;
		 st = new StringTokenizer(br.readLine()," ");
		 for(int i =0; i<3; i++) {
			 arr[i] = (int) Math.pow(Integer.parseInt(st.nextToken()),2);
			 if(arr[i]>max) {
				 max = arr[i];
			 }
//값을 받는 동시에 제곱해주고 최대값을 탐색한다
		 }
		 if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
			 break;
		 }
// 0 0 0을 받으면 종료한다
		 for(int i =0; i<3; i++) {
			 int temp = 0;
			 if(arr[i]==max) {
				 temp = arr[0];
				 arr[0] = arr[i];
				 arr[i] = temp;
			 }
//값을 일시적으로 받아주는 temp에 저장하고 최대값을 맨 앞으로 옮긴다
		 }
		if(arr[0] != arr[1]+arr[2]) {
			System.out.println("wrong"); 
		} if(arr[0] == arr[1]+arr[2]) {
			System.out.println("right"); 
		} 
	 }
}
}
