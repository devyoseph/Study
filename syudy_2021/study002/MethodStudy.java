package PackageMethod;
// 1. 주석처리: 블록 선택 - 'ctrl + /'  
// 2. 만들어진 Jmethod를 ctrl + 마우스 클릭하면 위치가 바로 나온다.
//			-이건 인텔리제이에서 사용가능 
// 3. void: 실행형 method / return형 메소드: Ex)String  - return 이름

/*메소드를 만드는 이유
 * 1. 유지/보수를 위해서
 * 2. 가독성이 좋아지니까
 * 3. 캡슐화( 여러 곳에서 중복된 코드를 작성할 필요가 없어짐)
 
 	리턴 메소드 주의점
 	1. String을 쓰면 return 값은 반드시 문자열로 리턴해야한다.
 			-byte, short, int, long, string, double, float 등 포함 
 			즉, 과정이 어떻든 리턴값은 문자열이어야 한다.
 *
 */


// 메소드를 활용한 최적화
public class MethodStudy {

	public static void main(String[] args) {
//STEP1		
		String a = "Hello ";
		String b = "Joseph";
		
		System.out.println(a + b);		
		System.out.println(" ");
//STEP3  아래에 메소드 먼저 만들기, 메소드 실행하기 		
		MethodStudy Jmethod  = new MethodStudy();
		Jmethod.Jmethod("THIS IS ", "METHOD");
		System.out.println(" ");

//STEP5 리턴형 메소드 실행하기 		
	    System.out.println(Jmethod.Jmethod2("THIS IS ", "RETURN"));
	}
	
	
//STEP2 메소드 만들기 
	public void Jmethod(String a, String b) {
		String result = a + b;    // result로 계산 결과값을 담아주고
		
		System.out.println(result);		
	}
//STEP4 리턴형 메소드 만들기
	public String Jmethod2(String c, String d) {
		String result = c + d; // c,d 말고 다른 이름으로 해도 상관X
		return result; 
	}		
}
