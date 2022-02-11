/* 유효범위가 겹친다면?
 	static i 있는 상태 에서 메소드 a안에서 int i 를 하고 출력을 i를 하면 
 	어떻게 될까?
 
 	=먼저 같은 메소드 안에 있는 지역변수를 우선으로 한다.
 	선언이 없다면 전역변수를 사용한다. 
 	
 	<this>
 	1.static 문에서는 이용할 수 없다. 
 	2. 그러므로 그냥 클래스 안에 보이드로 만든 메소드에서 실험
 	3. this. : 이 메소드가 아닌 이 클래스에서의 변수를 사용한다.
 	
 	<전역변수>
 	전역변수가 자주 사용된다면 메소드가 쪼개지기 힘들게 된다.
 	즉 방대한 메소드들을 언제든지 나눌 수 있게끔 설계해야한다.
 */
class C{
		int v = 0;
		void n() {
			int v = 2;
			System.out.println(v);
			System.out.println(this.v);
		}
}
public class ScopeStudy2 {
	static int i = 0;
	static void m() {
		int i = 1;
		System.out.println(i); //여기서는 static 이기에 this가 사용이 안된다.
	}
	
	public static void main(String[] args) {
			m();
			C c = new C();
			c.n();
	}

}
