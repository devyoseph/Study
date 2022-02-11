import java.util.*;
public class Main {
	static int[] arr;
	static int N,K,max;
	static int[] move = {-1,1,0};
	public static void bfs(Integer start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		while(!queue.isEmpty()) {
			int now = queue.poll();
			if(now==K){
				break;
			}
			move[2]=now;
			
				for(int i=0;i<3;i++) {
				int next = now + move[i];
				if(next<0 || next> max-1 || arr[next]!=0) {
					continue;
				}
				queue.add(next);
				arr[next]=arr[now]+1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		max=Math.max(N, K)+3;
		arr=new int[max];
		arr[N]=1;
		bfs(N);
		System.out.println(arr[K]-1);
}}
