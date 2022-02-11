import java.util.Scanner;

/* 1. 조건문 응용
 		1)조건문의 발동 원리
 			if(true){ 	소괄호의 내용이 참이어야 중괄호로 들어간다		}
  		true 가 아니라 false 이면 중괄호가 실행되지 않으며
  		위의 성질을 이용해 단순계산 뿐 아니라 여러 논리 등을 이용할 수 있다.
  		
  		2) 조건문 안에 변수 표시하기
  			println은 안된다!!!! printf 만 된다
  			문자열: %s   / 문자: %c / 참 거짓: %b / 정수: %d / 엔터: %n
  		
  	2. 이용자가 값을 입력하는 경우 (복습 + 학습)
  		1) Scanner 클래스 이용 
  			주의) 임포트 시켜줘야함: import java.util.Scanner
  			
  			Scanner sc = new Scanner(System.in);
  			외운다: Scanner은  next와 짝꿍: next();, nextInt(); 로 받아준다
  						만들어준 sc는 닫아준다 sc.close();

  		2) GetterSetter = 메소드를 이용한 정보 수집 
  			<1>클래스 생성자를 만들고 비워준다.
  			
  			public class Generator(){}
  		
  			<2>정보를 일시적으로 저장할 변수 데이터를 생성
  		     	String name;		//이름
				int age;				//나이
				String hobby;		//취미
  		
  			<3>그 변수 데이터에 자료를 집어넣는 메소드 만들기
  			 public String setName (String name) { 
				 				this.name = name; 
				 } 
				 
			<4>데이터가 저장된 변수를 이용하기 위해 데이터를 반환하는 메소드
			 public String getName(){
				 				return name;
				 }	
				 
콘솔	3) String id = args[0]; 이용  //  콘솔(console)에서 이용가능 
 			if(id.equals("맞추기")) 같은 구문을 활용 
 			
 			run을 실행하지말고 run 항목 중 Run configuration에 들어가
 			새 파일 생성(add) - Name 변경 - arg 창에 내용 입력 후 실행
 */
public class ConditionDeep {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("이름을 입력하세요");
			
			String a;
			
			a = sc.next();
			
			System.out.println("나이를 입력하세요");
			int b;
			b = sc.nextInt();
			
		
			System.out.printf("%n이름은 %s이며 나이는 %d입니다%n",a, b);
	
sc.close();

			System.out.println("=========================");
			
			System.out.println("비밀번호를 입력하세요 1234");
			String id = args[0];
			if(id.equals("1234")) {
				System.out.println("인증되었습니다.");
			}	else {			System.out.println("비밀번호가 틀렸습니다.");
			}
	}

}
