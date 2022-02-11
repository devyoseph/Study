import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int[] arr = new int[4];
//각각 x, y, w, h 가 들어있다
	 int[] length = new int[4];
//상하좌우 값과의 거리를 담는다
	 int min = 1000;
	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	 for(int i =0; i<4; i++) {
		 arr[i] = Integer.parseInt(st.nextToken()); 
	 }
     length[0] = arr[3] - arr[1];
     length[1] = arr[1];
     length[2] = arr[0];
     length[3] = arr[2] - arr[0];
//index값을 정확히 입력하자
     for(int i = 0; i<4; i++) {
    	 if(length[i]<min) {
    		 min = length[i];
    	 }
     }
     System.out.print(min);
}
}
