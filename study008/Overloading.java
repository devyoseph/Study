/* <Overloading>
 	이전에 복습한 GetterSetter 처럼 변수를 전부다 한꺼번에 받지 않고
 	부분만 받아서 사용할 수 있도록 하는 것이다. 그렇지만 조금 낮은 수준의
 	중복제거이며 잘 응용하도록 한다.
 	
 	아래 구문에서 쓰인 것:
 	이제껏 this.a 등으로 this.를 변수에만 지정해왔다. 하지만 더 확장해
 	this.메소드로 중복을 제거할 수 있다.
 	
 	Overriding vs Overloading
 	전자는 부모 메소드에 기능들을 덮어 씌우는 것이고
 	후자는 반복되는 것을 줄이기 위한 행위다
 	둘 모두 출력되는 데이터타입에 대해 주의해야 한다. (일치 확인) 
 	
 	
 */
package Over;

class Ovd{
	int a, b;
	int c=0;	//여기서 0으로 해주는 이유 = 변수를 두개만 적을 수 있기
	
	public void setnum(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("변수가 2개인 메소드");
	}
	public void setnum2(int a, int b, int c) {
		this.setnum(a, b);
		this.c = c;
		System.out.println("변수가 3개인 메소드");
	}
	
	void sum(){
		System.out.println(a+b+c);
	}
}

public class Overloading {

	public static void main(String[] args) {
				Ovd o = new Ovd();
				o.setnum(10,20);
				o.sum();
				
				Ovd o2 = new Ovd();
				o2.setnum2(20, 30, 40);
				o2.sum();
	}

}
