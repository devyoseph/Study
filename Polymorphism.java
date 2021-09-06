/*#다형성: 하나의 메소드나 클래스가 다양한 방법으로 동작하는 것
1)오버로딩(Overloading): 메소드와 다형성
2)
 
 
 
 */
package PolyStudy;
//Overloading의 경우를 보자: 메소드와 다형성
class O{
	public void a(int para) {
		System.out.println("숫자를 출력");
		System.out.println(para);
	}
	public void a(String para) {
		System.out.println("문자를 출력");
		System.out.println(para);
	}
}
public class Polymorphism {
	public static void main(String[] args) {
			O o = new O();
			o.a(0);
			o.a("zero");
			
			A a = new C(); 

			System.out.println(a.x());
/*			a.y();   A클래스 형식 안에 C형식을 집어 넣는 것에 오류가 발생
 			그렇다면 위 A a = new C(); 에서 
 			아래 C메소드에 x() 메소드를 만든다면 System.out.println(a.x());
	        결과는 어떻게 될까? 바로 C메소드의 내용이 출력된다			
	        
	        결론: 부모메소드 = 상속받는 자식 메소드로 정의하면
	        	겹치는 부분은 자식메소드로 Overriding, 부모메소드에 없는 부분 호출시 에러 발생 
	        	형식으로는 A를 내용은 C이며 부모에 없는 자식에만 있는 형식은 사용할 수 없다. 
	        */		
	}
}
//클래스의 다형성
class A{
	public String x() {
		return "x";
	}
}
class C extends A{
	public String y() {
		return "y";
	}
//   public String x() {
//	return "z";
}	
}


