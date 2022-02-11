import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K=sc.nextInt();
		int[] coin = new int[N];
		for(int i=N-1;i>=0;i--){ //크기가 큰 동전부터 배열에 배치한다
			coin[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<N;i++) {
			if(K>=coin[i]) {  //동전의 크기가 현재 남은 돈 K보다 작아지는 순간 나눈다
				sum+=K/coin[i]; //동전의 개수를 기록한다
				K%=coin[i]; //나눈 나머지를 다시 k에 집어넣는다
			}
		}
		System.out.println(sum);
	}
}
