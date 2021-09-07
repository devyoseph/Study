/* 예외를 예상해서 해당 예외만 throw로 보내기(=예외 만들기)
사용법: throw new Exception메소드("반환할 내용");
암기하자! 뜨로우 뉴 익셉션

<사용자 정의 예외>
내가 정의하는 예외를 만들어보자: 기본생성자는 필수라고 생각해라(어차피 아래 같은 이름의 생성자를 만들면 기본생성자를 수동으로 생성해줘야한다)
1) 만들 예외의 종류를 정해야한다: checked(Runtime X)  / unchecked(Runtime O)
		사용: checked일 경우, 상속으로 Exception을 상속한다
		       	 unchecked일 경우,	상속으로 RuntimeException을 상속한다
			 	 그 후 생성자를 만들고, super(); 로 가져온다.
2)위 생성자 클래스를 만들었으면, 아래 문자를 받는
	생성자 클래스를 만든다(생성자 클래스 2개).	super도 정해진 변수를
	안에 넣는다(message).		 	
	
3)호출: throw new 내가만든Exception 등으로 호출한다.
	checked(Exception을 상속)로 만들었다면 try catch가 필수이다.
	오류발생이 예상되는 곳에 만들어 놓는다. 

4)응용: 생성자 변수에 일단 변수들을 넣고, 입력해주었던 값들을 추적하기위해
			오류와 동시에 입력값들도 같이 반환하는 생성자를 만들어본다.
*/
package ThrowEx;
class DevideException extends RuntimeException{
	public int a;
	public int b;
	DevideException(){
			super();
	}
	DevideException(String message){
		super(message); 
	}
//입력값까지 알려주는 예외 생성자 
	DevideException(String message, int a, int b){
		super(message); 
		this.a=a;
		this.b=b;
	}


}


class Ex{
	int a,b;
	public void setNum(int a, int b){
		this.a = a; this.b =b;
	}
	public void devi() {
		if( b==0) {
		//	throw new ArithmeticException("0은 사용할 수 없습니다"); //여기서 사용!
			throw new DevideException("0으로 나눌 수 없다.",a,b);
		}
		System.out.println("결과는 ... " + this.a/this.b);
	}
}
public class Exceptionfin {

	public static void main(String[] args) {
		 	Ex e = new Ex();
		 	try {
		 	e.setNum(10, 0);
		 	e.devi();}
		 	catch(DevideException e1) {
		 //		e1.getMessage();  얘는 출력메소드가 아님을 주의한다
		 	System.out.println(e1.getMessage());
		 	System.out.println(e1.a);
		 	System.out.println(e1.b);
		 	//내가 만들어준 예외 메소드를 호출해보자
		 	
		 	}

	}

}

//왜 io exception만 붉은색으로 오류가 발생할까? 알아보자 
/* java.lang.* 아래의 포함관계를 보면 Throwable이 모든 예외 부모클래스이다.
 Throwable 아래 Error 와 Exception이 있다 
Error: 자바 버츄얼 머신의 자체적인 오류
Exception: 어플리케이션의 문제(아래 두개가 있다)
-IOException
-RuntimeException - ArithmeticException

<RuntimeException 의 유무가 중요하다>
ArithmeticException는 런타임익셉션이 있다 (= unchecked)
IOException는 런타임익셉션이 없다 (= checked) : 반드시 try & catch 사용

 요약: checked Exception(RuntimeException이 없는)은 try & catch 필수

*/
class D{
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOException() {
		throw new IOException();  //얘만 붉은색으로 오류가 뜬다(위 이유 적음) 
	}
}
