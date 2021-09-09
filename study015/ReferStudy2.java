
public class ReferStudy2 {

		static void _value(int b) {
			b = 2;
		}
		
		static void runValue() {
			int a = 1;
			_value(a);
			System.out.println("runValue :"+a);
			
			//원시 데이터타입의 경우 데이터 저장소를 만들고 값을 넣기 때문에
			//2가 아닌 1이 나온다 (당연)
		}
		
		static void _reference1( A b) { //여기가 중요: b라는 인스턴스가 a로 덮어지는 것이 아니라
			b = new A(2);  					//b가 a의 경로를 참조하게 된다. 즉 b는 a의 경로를 가져감
		}												//근데 새로운 A(2)값을 참조하게 되었다.
		//즉 이제 a와 b는 서로 연결되어 있지 않다
		
		static void runReference1() {
			A a = new A(1);  //인스턴스가 여기서 연결되고
			 _reference1(a);  //a를 메소드로 보낸다(위) 
			 
			 System.out.println("runReference1 :"+a.id);
			 //다시 돌아와 a와 b는 서로 다른 참조를 하기에 a는 여전히 1이다
		} 
		
		static void _reference2(A b) {
			b.id = 2;
		}
		
		static void runReference2() {
			A a = new A(1); 
			 _reference2(a);
			//위는  b = new A(); 식의 참조였지만
			//여기는 b.id = 2;로 참조된 a의 값을 변경했다
			 
			 System.out.println("runReference1 :"+a.id);
			 //참조된 값을 변경했으므로 당연히 1이 출력된다
		}
	public static void main(String[] args) {
				runValue();
				runReference1();
				runReference2();
	}
}
