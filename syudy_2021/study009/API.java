/* #그동안의 의문 해소
 System.out.print(0);
 에서 print나 이런 것들은 메소드이며 언제든 호출할 수 있기에
 static이다. 그렇다면 이것은 어디서 온 것일까?
 바로 패키지 선언 아래 부분에 
 import java.lang.*; (와일드 카드)
 가 숨어있다. 즉 자바언어(language)가 숨어있는 것이다.
 = 자바가 기본적으로 제공하는 패키지들
 
  #API란? (Application programming interface)의 약자
  인터페이스: 시스템과 제어자와의 접점
  즉 API를 잘 다루는 것이 자바를 잘 다루는 것이다.
  
  UI: user interface 
  
API를 모아둔 웹페이지: http://docs.oracle.com/javase/
여기서 API Documentation을 클릭한다.

왼쪽 위: 자바가 기본적으로 제공하는 패키지들이다.
println을 찾아보면 변수에 따라 대응할 수 있게 
같은 println이 변수에 따라 여러개 정의되고 있음을 볼 수 있다.
  
  
 
 */
public class API {

	public static void main(String[] args) {
		

	}

}
