import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		String[] arr = {"ZRO","ONE","TWO","THR","FOR","FIV","SIX","SVN","EGT","NIN"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			int[] counting = new int[10];
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			String[] now = br.readLine().split(" ");
			for(int j=0; j<N; j++) {
				for(int k=0; k<10; k++) {
					if(now[j].equals(arr[k])) {
						counting[k]++;
						k = 10;
					}
				}
			}
			for(int j=0; j<10 ; j++) {
				for(int k=0;k<counting[j];k++) {
					sb.append(arr[j]+" ");
				}
			}
            System.out.println("#"+i);
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
}
}
