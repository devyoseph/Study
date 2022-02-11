/*#Abstract(추상): 반드시 상속해서 사용하도록 한다
	사용법: abstract class 클래스명
				public abstract 데이터타입 클래스명 
	
	만약 아래 AbstractDemo 클래스에 하나라도 abstract	메소드가 있으면
	AbstractDemo 클래스는 abtract 추상 클래스가 된다. 
	하지만 추상메소드 AbstractDemo안에 정상 메소드도 있을 수 있다. 
*/
abstract class AbstractDemo {
		public abstract int b() ;
		//여기서 b는 메소드이다. 내용없는 추상적인 데이터이다. 
	
		public void d() {
			System.out.println("Hello");
		}
}
public class Abstract{
	public static void main(String[] args) {
		//AbstractDemo a = new AbstractDemo(); 
		//상속받지 않았으니 사용할 수 없음에 주의한다. 
		//그럼 상속받은 B를 보자
		B b = new B();
		b.b(); //단지 b.b메소드에 1이 입력되는 것이지 출력되는 것은 아니다.
		System.out.println(b.b());
	}
}
//그렇다면 AbstractDemo를 상속하는 B를 만들어준다.
class B extends AbstractDemo{
	public int b() {
		return 1;
	}	
}
/*메소드의 시그니처만 지정해놓고 상속해서 정의하는 경우
 	작은 프로젝트에서는 거의 없다.
 	
 	#디자인패턴
 	패턴을 익혀가며 설계에 대한 감각을 익힌다. 	
 */




*/