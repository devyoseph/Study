import java.util.Scanner;
public class Main {
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 int num = 0;
	 int room =0;
	for( int i =1; num < N; i++) {
		num += i;
		room ++;
	}
//벌집과 형식은 같다
	int diff = num-N;
//하지만 차이를 계산해서(diff) 몇번째인지 계산한다
	if(room%2 ==0) {
		System.out.print(room-diff+"/"+(diff+1));
	} else { System.out.print(diff+1+"/"+(room-diff));
	}
//room이 짝수인 경우 위에서 아래, 홀수인 경우 아래에서 위로 num이 이동한다
}
}
