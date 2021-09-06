/*1.접근제한자: default, public, private, protected
 
 		1)String a; 	 앞에 아무것도 안붙음 = 디폴트(default), 같은 패키지 안에서만 접근 가능하다.
 		
 		2)public String a; 앞에 public 선언 = 다른 패키지에서도 이용가능
 		
 		3)private String a; 철저히 현재 클래스에서 사용가능
 		
 		4)protected String a; 같은 패키지 안에서 사용가능(default와 비슷)
 		 			default와의 차이점: 상속(extends)의 개념을 사용하면 사용가능 
 	
 	2.클래스 생성: Test test = new Test();     // Test1과 2를 이어주는 매개체
  			클래스를 생성하고 test.  을 입력하면 뒤에 a라는 변수가 보인다.

 			*완성도 있는 프로그램을 만들기 위해 접근제한자를 자유자재로 쓴다.
*/


package PackageFolder;

public class Test {
					String a = "코딩";
					protected String b = "protected - extends";
	public static void main(String[] args) {
		

	}

}
