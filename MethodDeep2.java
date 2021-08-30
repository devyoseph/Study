import java.util.Scanner;

/*메소드 복습2
 	1. return; : 메소드 밖으로 값을 내보내준다. 
 		메소드 입력값 - 메소드 - 출력값 - 이 출력값을 메소드 밖으로 내보낸다 
 		
 		#메소드 내부에서 return 값을 만나면 메소드를 무조건 종료시킨다.
 		#return output;  내부에서 계산된 output을 메소드의 결과값으로 만든다.
 		#return을 사용하는 이유?: 현 메소드를 다양하게 사용하기 위해서 출력기능을 분리.
 		
 	2. 반복문에서 += 의 개념: 계속해서 뒤의 값을 앞 정의된 곳에 붙인다.
 			output += i;   // output = output + i; 라는 뜻 
 			i++;

	3. public static String numbering4(int init, int limit) {
	##return 값이 문자열을 반환하기 때문에 numbering메소드의
		데이터 타입은 String으로 정해줘야 한다 (중요)
	
	4. String말고 void를 쓰는 이유: void는 빈공간이라는 뜻으로
		리턴값을 반환하지 않는다는 뜻이다. void와 return은 같이X
		
	5. 아까 작성한 메소드가 public으로 정의했기 때문에 네이밍에 주의한다.
	
	6. 배열을 이용한 최적화: 메소드 내부에 배열을 정의해서 원할 때 계속 꺼내쓴다.
 
 	7.	String[] Array() vs String Array[]
 	 	둘 다 작동하지만 메소드 리턴으로 받기 위해서 Array를 ()로 받아야하기에
 	 	String[] Array 형식으로 쓰도록 한다.
 */


public class MethodDeep2 {

	public static String numbering4(int init, int limit) {
		int i = init;
		int i2 = limit;
		String output = "";
		while(i < i2 + 1) {
			output += i; 
			i++;
		}
		return output;
	}
	
	
	
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작할 숫자를 입력하시오");
		a = sc.nextInt();
		System.out.println("마칠 숫자를 입력하시오");
		b= sc.nextInt();	
		
		String result = numbering4(a, b);
		System.out.println(result);
		
		System.out.println(one());

		System.out.println("");
		
		String[] members = Array();
		// 프린트 내부에 members[] 를 적어서 전체를 출력할 수 없다.
		// 다른 방법을 써야한다.
		System.out.println(members[1]);
	}

	
	public static int one() {
		return 1;
	//	return 2;
	// return 3;
		// 만약 one(); 메소드를 실행하면? return을 만나면 바로 정지하므로 1만 출력한다.		
	}
	
	public static String[] Array() {
			String members[] = {"	김일","김이","김삼"};
			return members;
	}
	
}
