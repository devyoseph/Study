/* 자유와 규제
  데이터타입 등 규제를 통해 거대한 프로그램을 만들어간다.
  자유에 질서를 부여하는 규제로 더 나아가는 것이다. 
  
  #접근 제어자
  private: 선언된 클래스 밖에서 실행이 되지 않는다. 
	사용하는 이유?: 내부적으로 계산이 일어나는 곳은 사용자에게 보여주지 않는다.
  
  
  
  
 */
class A{
	public String x() {
		return "public x";
	}
	public String y(){
		return "public y";
	}
	//private String z() {
		//return "private z"; 	프라이빗으로 지정한 얘를 호출하면 오류
	}


public class Access1 {

	public static void main(String[] args) {
				A a = new A();
				System.out.println(a.x());
				System.out.println(a.y());
		//		System.out.println(a.z()); 만약 호출하면 오류가 나온다
		
	}
}
