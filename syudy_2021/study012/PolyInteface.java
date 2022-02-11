/*인터페이스와 다형성 
		인터페이스는 구현해야만 하는 규제라고 했다.
		그리고 implements를 통해 구현하며 인스턴스화를 시킬 때
		Is i = new ls2(); 를 통해 형식은 Is이지만 내용은 ls2로 다형성을
		이용할 수 있음에 주의하자. 사용처ex) 아동용 휴대폰 어플리케이션 등 
*/
package PolyStudy;
interface Is{
		public void x() {
			System.out.println("old version(x)");
		}
}
interface Is2{
		public void y() {
			System.out.println("old version(y)");
}
}

class Icall implements Is,Is2{
	public void x() {
		System.out.println("new version(x)");
	}
	public void y() {
		System.out.println("new version(y)");
	}
}
public class PolyInteface {

	public static void main(String[] args) {
			Icall i = new Icall();
			i.x();
			Is i2 = new Icall();
			i2.x();
			Is2 i3 = new Icall();
			i3.y();
	}

}
