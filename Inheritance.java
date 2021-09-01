/* [상속(Inheritance)]: 물려준다. 객체의 필드(변수)와 메소드를 물려 받는다.
    		메소드의 추가하여 영향을 줄 수 밖에 없을 때 기능만 가져온다.
    부모 객체(super, based) - 자식(sub, derived) 개체로 이어진다.
    				[코드 중복 제거, 가독성의 증가, 유지보수 유리]
   1.명령어: extends 		ex) Sheet2 extends Sheet;
     
	생성자의 연결: 생성자는 상속시 따로 연결해줘야한다. super로 연결.
	
	2.클래스 다이어그램: 클래스 간의 관계를 다이어그램으로 나타냄
	
	3. 하나의 클래스에 여러 개의 상속된 클래스가 있을 수 있다.
	
	4. 상속은 객체지향의 프로그램의 복잡도를 증가시킨다. 
 */
class Sheet{
		int a; int b;
		//생성자를 사용해본다.
		public Sheet(int a, int b) {
			this.a = a; this.b = b;
		}
		
		void div() {
			System.out.println(a/b);
		}
		
		void div2() {
			System.out.println(a%b);
		}
}
//놀랍게도 상속받는 Sheet2에 생성자Constructor를 생성해준다.
//그러나 그냥 생성하는 것이 아니라 super(); 로 연결시킨다.
class Sheet2 extends Sheet{
	public Sheet2(int a, int b) {
		super(a, b);
	}
	public void div3() {
		System.out.println(a-b);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Sheet s = new Sheet(17,8);
		s.div();
		s.div2();
		
		//하지만 Sheet과 Sheet의 변수를 같이 s로 두면 충돌이 일어난다(주의)
		Sheet2 s2 = new Sheet2(19,6);
		s2.div3();
		
		s2.div(); 
		//또한 상속된 Sheet2에서 Sheet의 메소드를 사용할 수 있으므로
		//사실상 위 s는 불필요해짐을 알 수 있다. 
		
	}

}
