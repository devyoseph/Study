/* 생성자(constructor): 프로그래밍을 초기화하는 기능
 ### 클래스 Calculator가 실행될 때 클래스 내부 똑같은 이름의 메소드
 		Calculator가 실행되는 것이 약속되어있다.
 		그래서 Calculator가 실행되면서 입력한 a, b값이 수정된다. 
 		
 		=초기화의 기능
 
 */
class Calculator2{
	int a; int b;
	
	//이게 생성자: 클래스내 클래스와 이름이 같은 메소드 
	public Calculator2(int a, int b) {
			this.a = a;
			this.b = b;
	}
	public void cal1(){
		System.out.println((this.a+this.b)/10);		
	}
	
	public void cal2() {
		System.out.println(this.a*this.b);
	}
	}	

public class Constructor {
	public static void main(String[] args) {
			Calculator2 c1 = new Calculator2(15,20);
			c1.cal1();
			c1.cal2();
			
			Calculator2 c2 = new Calculator2(30,40);
			c2.cal1();
			c2.cal2();
	}
}

