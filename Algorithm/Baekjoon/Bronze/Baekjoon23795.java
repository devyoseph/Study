import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			int N=sc.nextInt();
			if(N==-1) { //-1 을 입력받으면 while문을 나옵니다
				break;
			}
			sum+=N; //break 안되었다면 더합니다
		}
			System.out.println(sum);
}}
