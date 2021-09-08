/*Object: 모든 클래스의 조상: 굳이 상속하지 않아도 불러낼 수 있다
 * 모든 클래스에는 extends Object가 숨어있기 때문이다
 * 자식객체가 부모객체의 내용을 덮어씌우는 것: overriding이 적용될 수 있다
 수 많은 기능 중: clone(), equals(), finalize(), toString() 등을 해볼 것이다.
 모든 클래스의 공통점을 살펴볼 수 있다(객체지향성 확인) 
 
 1)toString: toString을 클릭하고 Open implementation(구현) 을 눌러 이동할 수 있다
  		안되는 경우: 메뉴- Window창 - Java - Installed 
  	toString()이 맘에 들지 않을 때 Overriding을 작성할 수 있다	


*/
class A{
	double a, b;
    public void setNum(double a, double b) {
    	this.a = a; this.b = b;
    }
    public void power() {
    	System.out.println(Math.pow(this.a, this.b));
    }
    public String toString() {
    	return "left: "+this.a+" and right: "+this.b;
    }
    }
public class ObjectStudy {
	public static void main(String[] args) {
	//인스턴스 임포트를 시키고 출력하면 인스턴스 식별코드가 나온다
		A a = new A();
		a.setNum(5, 7);
	//출력하면? = A@2a139a55 
		System.out.println(a.toString());  //print문 안에 .toString()이 늘 숨어있음을 명심 
		System.out.println(a); //toString을 붙이지 않아도 된다. 
	//맘에 안든다 = overring을 통해 바꾼다
	//내가 부른 클래스 안에 지정해주면 그 클래스에 덮어씌워진다	
		
		B b = new B();
		System.out.println(b.toString());
	//해당 toString에만 적용됨을 알 수 있다.	
	}
}
class B{}

