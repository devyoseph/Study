/* 1. 클래스 맴버와 인스턴스 맴버 
 		#Class vs Instance: 둘 모두 각각 변수와 메소드를 가진다.
 		1)하나의 프로젝트에 여러 개의 클래스 = 클래스 맴버
 		2)하나의 클래스 안에 여러 개의 인스턴스 = 인스턴스 맴버
 		3)인스턴스 안에 변수들 = 인스턴스가 소유한 변수들  
 		4)클래스의 변수들 = 클래스끼리는 다르지만 모든 인스턴스들은 같은 변수
		5)인스턴스 맴버는 클래스에 도달하지만, 클래스맴버는 인스턴스 맴버를 못만난다.
				당연: 클래스 -> 인스턴스 순으로 만들어지기에... (인스턴스가 만들어지면 인스턴스 입장에선 이미 클래스에 연결가능)

	2. 이해 내용
		Calculator 라는 클래스를 만들고 c1과 c2를 만들면
		이 둘의 변수는 똑같이 이름이 a, b라도 인스턴스 자체, 즉 틀이
		따로 만들어지기 때문에 서로에게 값을 영향주지 않는다.
 */

/*### 클래스의 변수를 인스턴스들에게 모두 적용시키기 위해? static을 사용 
 class 내에서 static 선언 = 모든 인스턴스에서 변수가 동일한 값이다.

사용하는 방법:
1) 인스턴스 c2.PI 처럼 ' . ' 뒤에 static 변수를 적는다.
2) Calculator.PI 처럼 클래스에서 불러올 수도 있다.

빠르게 해당 함수로 점프하는법 : ctl or cmd + 마우스 클릭
이전 점프 위치로 가는법:  메인창 바로 아래 화살표 뒤쪽 클릭. 
*/
class Calculator{
	//double PI = 3.14; 이 아닌
	static double PI = 3.14;
	int left; int right;
	
	public void setOprands(int a, int b) {
		this.left = a; 	this.right =  b;
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
	
	public void sum() {
		System.out.println(left+right);
	}
}

public class ObjectStudy2 {

	public static void main(String[] args) {
			Calculator c1 = new Calculator();
			c1.setOprands(10, 20);
			c1.avg();
			c1.sum();

			Calculator c2 = new Calculator();
			System.out.println(c2.PI);
			//그러나 c2를 지정하고 PI를 해버리면 c2의 값이
			// 3.14로 고정되는 효과가 있다. 
			
			//그리고 클래스를 통해서도 직접적으로 접근할 수 있다.
	
			System.out.println(Calculator.PI);
	}

}
