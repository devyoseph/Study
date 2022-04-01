import java.util.*;
public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] bag = new int[K+1];
			int max = 0;
			for(int i=0; i<N; i++) {
				int V = sc.nextInt();
				int C = sc.nextInt();
				
				for(int j=V; j<=K; j++) {
					if(bag[j-V] < bag[j] + C) {
						bag[j-V] = bag[j] + C;
						max = Math.max(bag[j-V], max);
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}
}