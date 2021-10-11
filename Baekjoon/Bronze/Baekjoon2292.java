import java.util.Scanner;
public class Main {
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 int num = 1;
//num을 N보다 커질 때까지 증가시켜줄 것이다
	 int room =0;
//증가시키면서 방의 개수가 하나씩 증가한다
	 if(N ==1) {
		 System.out.print(1);
//1이면 1을 출력해줘야한다
	 }else {
	for( int i =0; num < N; i++) {
		num += 6*i;
//각각 항의 차이가 등차수열이다
		room ++;
//항이 증가할 때 방의 수도 증가한다
	}System.out.print(room);
	}
}
}
