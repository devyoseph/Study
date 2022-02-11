/* <객체지향프로그래밍>
 	1. 추상화(abstract)
 		복잡한 현실의 정보를 최소한의 논리구조로 나타내는 작업
 		
 	2. 부품화(ex: method)
 		예전 컴퓨터는 고장나면 컴퓨터 자체를 바꿔야했다.
 		하지만 현재 컴퓨터는 키보드 마우스 등이 서로 나눠져 있다.
 		
 	3. 은닉화, 캡슐화 
 		은닉화: 그 부품의 사용방법만을 외부로 노출한다.
 	
 	4. 인터페이스: 연결의 접점(서로 연결안되는 것은 겹합못하게 모양 바꿈)
 		ex)HDMI 표준
 		
 	<클래스와 인스턴스>
 	클래스: 설계도, 정의 
 	인스턴스: 설계도에 의한 제품, 호출 
 	
 	 프로그램의 원칙
 	 1. 중복의 제거(re-factoring): 메소드의 사용 	
 	 	계산용 메소드 만들기: private이나 static 붙이지말고
 	 	'class 메소드 이름{ }'
 
 	메소드 안 메소드 사용하기: 먼저 가장 큰 메소드 호출 new ~
 	그리고 '메소드명.내부메소드이름();' 로 호출  
 */


public class ObjectStudy {
	//기본적인 중복의 제거=리팩토링의 예시
	private static void sum(int a, int b) {
		System.out.println(a + b);
	} 		
	public static void main(String[] args) {
		sum(10, 20);
		sum(30, 40);  //리팩토링을 통해서 가독성이 향상되었다. 
	
	//아래 클래스의 이용
	//여기서의 c1은 객체지향에서 인스턴스
		Calc cal = new Calc(); 
		cal.setnum(2, 6);
		cal.avg();
		cal.sum2();
	}
}

//여기서 더 많은 정보를 한번에 호출하기 위해서?= 메소드 내부 메소드

class Calc{
	int a; 	int b;
	
	public void setnum (int  a, int b) {
		this.a = a;
		this.b = b;
	}
	public void sum2() {
		System.out.println(a + b);
	}
	public void avg() {
		System.out.println((a+b)/2);
	}	
}

