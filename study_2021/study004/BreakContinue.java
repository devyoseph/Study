import java.util.Scanner;

// continue;  를 적을 경우 일단 반복을 멈추고 처음으로 돌아간다 
// break;  즉시 반복문을 정지한다.
import java.util.Scanner;
public class BreakContinue {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자를 입력하시오 1~10");
			int n= sc.nextInt();
			
			
		for(int i = 1; i<=10; i++) {					
					if (i == n)		continue;
					
					// 내가 입력한 n에 i가 일치하게 될 때 즉시 처음으로 돌아가므로
					// 아래 프린트문이 출력되지 않는다.
				
					System.out.print(i + " | ");
			}

	}

}
