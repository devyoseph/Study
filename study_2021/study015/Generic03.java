//제네릭이 데이터타입을 제한하기 위해서
//extends를 사용한다: 해당 클래스 상속받은 자식까지 사용가능

package Generic2;

interface Parents{
     int getFavor();
}

class Baby implements Parents{
		public int baby ;
		Baby(int baby){this.baby = baby;}
		public int getFavor() {
			return baby;
		}}

class Limitdata <T extends Parents>{
	public T a;
	Limitdata(T a){
		this.a = a;
	}
}

public class Generic03 {

	public static void main(String[] args) {
		Baby e = new Baby(50);		
		Limitdata p1 = new Limitdata(e);
				System.out.println(p1.a.getFavor());
	}
}
