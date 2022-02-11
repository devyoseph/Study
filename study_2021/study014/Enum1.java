/*우리가 보기 편하게 변수를 지정한다
	아래 APPLE이 과일인지 회사인지 구분을 해줘야하며
	각각의 변수를 final로 길게 써줘야한다 = 복잡
	
	 인터페이스로 구현하면 더 편리할 수 있다

한꺼번에 소스코드 바꾸기
이름을 드래그하고 ctrl - alt - T ( MAC: Cmd + Opt + T) - rename

swich의 조건: 알고보면 데이터 타입에 조건이 존재한다
byte, short , char, int , enum, String, Character, Byte, Short, Integer
enum이 존재한다!!!에 집중 
*/
package EnumStudy;

import java.util.Scanner;

public class Enum1 {
			private final static int BUS = 1;
			private final static int CAR = 2;
			private final static int TRAIN = 3;
			
			private final static int GOOGLE = 1;
			private final static int COMPANY_CAR = 2;
			private final static int ORACLE = 3;
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("숫자를 입력하시오");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("BUS");
			break;
		case 2:
			System.out.println("CAR");
			break;
		case 3:
			System.out.println("TRAIN");
			break;
		default:
			System.out.println("1~3을 입력하시오");
			
			}
			//인터페이스의 활용
	     	System.out.println(" ");
			int type = COLOR.BLACK;
			switch(type) {
			case 1:
				System.out.println("WHITE");
				break;
			case 2:
				System.out.println("BLACK");
				break;
			case 3:
				System.out.println("GOLD");
				break;
			default:
				System.out.println("default");
			
		}
			
	}
}

interface FRUIT{
	 int APPLE = 1 ;     int PEACH = 2;    int ORANGE =3;
}
interface COLOR{
	int WHITE = 1; 		int BLACK=2; 		int  GOLD=3;
}

