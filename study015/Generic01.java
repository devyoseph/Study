/* 제네릭(Generic): < > 부등호로 닫아준다
 클래스 내부에서 사용할 데이터를 외부에서 지정하는 기법. 얘도 클래스다
 
 왜 제네릭을 도입했는가? 
중복된 클래스를 하나로 합치다보니 
 타입이 안정하지 않기 때문에 사용( Type safety )
 
 1) 제네릭에 변수를 여러개 사용할 수 있다
   




*/
package Generic;

import javax.sound.midi.MidiDevice.Info;

}
class Person<T>{
	public T info;
	//T는 아직 정해지지 않음
	//T는 info의 데이터타입 
}
public class Generic01 {

	public static void main(String[] args) {
		Person<String> p1 = new  Person<String>();
		//여기서 T는 String의 데이터타입으로 정의된다 
		// p1의 데이터타입은 String이 된다 

		Person<StringBuilder> p2 = new Person<StringBuilder>();
		//p2의 데이터타입은 StringBuilder가 된다
		
		//아래 반복되는 클래스들을 실행하는 인스턴스를 만든다
		A a = new A("String");
		B b = new B(5);
		C c = new C(7);
		
		System.out.println("");
		
		ABC<String> abc = new ABC<String>("gereric");

	}

}
// 다음처럼 분명히 역할이 겹치는 클래스들이 있다 
// 근데 데이터타입이 달라서 따로만들어줘야한다
class A{
	public String a;
	public A(String a) {
		this.a = a;
	}
}
class B{
	public int b;
	public B(int b) {
		this.b = b;
	}
}
class C{
	public int c;
	public C(int c) {
		this.c = c;
	}
}
//제네릭을 만들어준다
class ABC<T>{
	public T abc;
	public ABC(T abc){
		this.abc = abc;
	}
	
}
