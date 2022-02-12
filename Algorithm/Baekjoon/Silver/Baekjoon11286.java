import java.util.*;

public class Main {
	public static void main(String[] args){
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (Math.abs(o1)==Math.abs(o2)?o1-o2:Math.abs(o1)-Math.abs(o2));
			}
		});
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-->0) {
			int num = sc.nextInt();
			if(num==0) {
				System.out.println(pQ.isEmpty()?0:pQ.poll());
			}else {
				pQ.offer(num);
			}
		}
}
}