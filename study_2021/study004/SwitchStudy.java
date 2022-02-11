import java.util.Scanner;

/* <Switch 조건문>
 	1. If문 보다 사용 빈도는 적으나 조건이 많을 때 유리하다.
 	2. switch(1){
 				case 1: 
 					출력할 구문
 				case 2:
 					출력할 구문
 	}
 		#case 1이 실행된다면 자동적으로 2, 3이 실행된다
 		#2가 실행된다면?: 2뿐 아니라 case 3,4,5 등이 실행된다.
 		#이렇게 하고 싶지 않다면?: break;	를 사용해 연쇄를 끊어준다.
		#swith, case 모두 소문자임에 유의 
 */
public class SwitchStudy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short i;
		
		System.out.println("숫자를 입력하시오(1~3)");
		i=sc.nextShort();
		
		System.out.printf("swich(%d)%n",i);
		
		switch(i) {
		case 1: System.out.println("one");
		case 2: System.out.println("two");
		case 3: System.out.println("three");
		break;
		}
		
	
	}

}
