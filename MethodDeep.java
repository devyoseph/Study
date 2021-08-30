import java.util.Scanner;

/* 메소드 복습 및 심화
	Method = Function 
	메소드를 만든다 = 정의 
	메소드를 실행한다 = 호출 [메소드의 입력과 출력의 로직]
  		1. 메소드 입구에 값을 입력하게 만든다 = 입력 값의 형식 정해줌 
  				그렇게 함으로 입력값에 따라 출력값을  좀 더 세분화 해줄 수 있다.
  					입력값을 수용하기 위한 변수를 '매개변수(parameter)'라고 한다.
  	 	2. 위 매개변수를 받는 것을 인자라고 한다.
  	 	 			numbering2(n); 내부 n이 바로 인자(argument)이다.
  	 	3. 매개변수를 여러개 설정하여 출력값을 구체화할 수 있다. 			
  	 	 	
  	#메소드의 기능: 유지보수가 용이하다.
  
   메소드 main: 내가 실행하고자 하는 로직을 위치시키는 곳(약속)
 */
public class MethodDeep {
	public static void numbering() {
				int i =0;
				//while과 if문 소괄호 안에 ; 가 안붙음을 주의하고 
				//if문에 i=10이 아니라 논리 연산자 ==가 들어감을 주의한다.
				while(i<10) {
						System.out.print(i);
						i++;
						
						if(i == 10) { 
							System.out.println("");
						}
				}		
	}
			//메소드 안 입력의 틀을 지정해준다. 그래서 출력값을 다양화한다.
	public static void numbering2(int limit) {
				int i = 0;
				while(i < limit) {
					System.out.print(i);
					i++;
					
					if(i == limit) {
					System.out.println("");	
					}
					
				}
	}
	public static void numbering3(int init, int limit) {
		int i = init;
		while(i < limit) {
			System.out.print(i);
			i++;
			
			if(i == limit) {
			System.out.println("");	
			}
			
		}
}
	public static void main(String[] args) {
		// 여기서 main이 메소드이다. 
				numbering();
				numbering();
				System.out.println("");
				
				int n;
				int n2;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("숫자를 입력하시오");
				
				n = sc.nextInt();
				
				numbering2(n);
				numbering2(n);			
				
				System.out.println("시작할 숫자를 입력해보시오");
				n2 = sc.nextInt();
				
				numbering3(n2,n);
				numbering3(n2,n);
	}
	
}