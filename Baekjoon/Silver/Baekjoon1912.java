import java.io.*;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	int[] arr = new int[n];
	for(int i=0; i<n;i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	int max=arr[0]; //최대값 시작은 0항의 값을 넣어준다
	int sum=0;
	for(int i=0; i<n;i++){
		sum+=arr[i]; //현재항을 더한 뒤
		max=Math.max(max, sum); //최대값이면 기록한다
	    if(sum<0) {
	    	sum=0; //sum이 음수가 된 순간 초기화시켜준다
	    }
	}
	System.out.print(max);
}}
