/*< 다양한 예외들 >
e.printStackTrace 는 자체 출력함수이기 때문에 print 구문 안으로 들어갈 수 없다.
catch 문은 else if 처럼 이어 붙여서 오류상황에 따라 명령을 다르게 할 수 있다
catch(ArrayIndexOutOfBoundsException e){ }
catch(ArithmeticException e){ }
*/
//	배열을 가지는 메소드를 출력한다
// 주의점은 new로 만들어주고, 생성자로 값들을 정해준다.
class A{
	private int[] arra = new int [3];
	A(){
		arra[0] = 0;
		arra[1] = 10;
		arra[2] = 20;
	}
	public void z(int a, int b) {
		try{System.out.println(arra[a]*arra[b]);
	}  catch(Exception e) {
		System.out.println("오류가 발생했습니다. " + e.getMessage() + e.toString() );
		e.printStackTrace();
	} 
	}
}
public class Exvary {
	public static void main(String[] args) {
			A a = new A();
			a.z(1, 2);
			//위는 정상적으로 작동한다. 그러나 배열 범위를 벗어나면?
			a.z(10, 2); //오류가 발생한다

	}

}
