/*#인터페이스(Interface):  abstract,final과 함께 규제이다
  		어떤 객체가 인터페이스를 사용하면 그 객체는 반드시
  		인터페이스의 메소드를 구현해야 한다.
		사용법: interface 클래스명 (class가 이미 interface안에 포함되어 있다(?))
		구현법: [클래스명] implements [interface클래스명]{
		}  
		
	#사용하는 이유: 개발자끼리 소통할 때 변수나 메소드의 입력형식을 통일함으로 커뮤니케이션 미스를 줄인다
			즉, 만들어지진 않았지만 메소드의 형식을 약속하기 위해 사용된다(=명세서 역할)
			
 주의점) 
 1.하나의 클래스가 여러 개의 인터페이스를 구현할 수 있다.(상속extends는 1대 1이다)
 2.인터페이스가 상속이 된다 (묶인 interface 클래스의 모든 메소드를 구현해야만 한다)
 3.인터페이스의 멤버는 반드시 public: 왜냐하면 구현해야만 하니까
 
 abstract vs interface
 abstract는 본체 안에 구체적인 로직을 가질 수 있지만(overriding	도 기대)
 interface는 본체가 껍데기 뿐이다. 
 */
interface I{
	public void x();
}
interface I2{
	public void y();
}
class A implements I, I2{
	public void x() {
	}//만약 이처럼 interface된 클래스를 implements로 구현하지 않으면 오류발생
	public void y() {
	}
}
// interface는 상속이되며 상속된 클래스를 implements할 경우 모두 구현한다.
interface I3 extends I2{
	public void z();
}
class B implements I3{
	public void y() {}
	public void z() {}
}
	public static void main(String[] args) {
	
	}

}
