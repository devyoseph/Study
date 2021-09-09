/* 복제란?: 원시 데이터타입들(int, Sting, car등) 
 int a = 1;
 int b = 1 ;일 때  
 a 빈 공간에 1이 저장 -  b의 빈 공간 생성 - a와 같은 데이터 1이 저장 
 
 * 참조(Reference): 객체로 만드는 데이터타입들
 A a = new A(1); 은 다르다
 1) a에 빈공간이 생기고 저장되는 것이 아니라 메모리 어딘가에
 A빈공간의 인스턴스가 만들어지고 1의 데이터가 저장된다
 
 2) b를 생성하는 동시에 A b =a;를 걸어주면, b의 공간을 만드는 것이 아니라
 b가 바로 a와 인스턴스의 경로를 공유하는 식으로 된다 	
 
 3) 그래서 b를 변경하면 b는 a와 연결되어있기 때문에 a도 변경되는 것이다

쉽게 이해하기: 인스턴스(원시 데이터타입이 아닌 것들)을 서로 같다고 해주면
컴퓨터의 '바로가기'처럼 서로 연결되는 것이다
*/
class A{
	public int id;
	A(int id){
		this.id = id;
	}
}
public class ReferStudy {
		
		public static void runValue() {
 		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue :" + a);
		}
		//a의 값 '1'을 복제한 다음 b에다 넣었다 
	public static void main(String[] args) {
			A a = new A(1);
			A b = a;
			b.id = 2; 
		System.out.println( a.id); //바꾼건 b인데 a가 변경되었다
	}
}
