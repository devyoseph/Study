import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		long min=0,max=0;
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, arr[i]);
		}
		max++;
		while(min<max) {
			long sum=0;
			long mid=(min+max)/2;
			for(int i=0;i<N;i++) {
				sum+=arr[i]-mid>0?arr[i]-mid:0;
			}
			if(sum<M) {
				max=mid;
			}else{
				min=mid+1;
			}
		}
		System.out.print(min-1);
}}
