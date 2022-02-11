import java.util.*;
public class Main {
	static int V;
	static int[] check;
	static boolean judge;
	static Queue<Integer> queue = new LinkedList<Integer>();
	static LinkedList<Integer>[] graph;
	
	static void bfs() {
	for(int j=1;j<=V;j++) {
		if(check[j]==0) {
			
			queue.add(j);
			check[j]=1;
		
				while(!queue.isEmpty()) {
						int now = queue.poll();
						
						for(Integer next:graph[now]) {
							if(check[next]==0) {
								queue.offer(next);
								check[next]=check[now]*-1;
							} else if(check[next]==check[now]) {
								judge=false;
								break;
							}
						}
				}
		}
	}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	while(K-->0) {
		V = sc.nextInt();
		int E = sc.nextInt();
		judge=true;
		check = new int[V+1];
		graph = new LinkedList[V+1];
		
		for(int i=1;i<=V;i++) {
			graph[i]=new LinkedList<>();
		}
		
		while(E-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		bfs();
		System.out.println(judge?"YES":"NO");
	}
}}
