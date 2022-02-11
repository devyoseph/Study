/*enum은 클래스이므로 생성자(Constructor)를 넣을 수 있다
생성자 파라미터를 정해서 값을 저장하고 외부로 뽑아낼 수 있다
또한 메소드를 만들 수 있다. 

enum 과 values() : enum을 하나씩 꺼내서 사용할 수 있게 하는 것이 values
enum명.values() 로 사용한다 

for문 필수: 하나씩 꺼내오기( :) 
for( 데이터타입 변수명 : 배열, enum.values){}
	for (int num :  Array)    : 배열의 구성요소를 하나씩 꺼내온다 
	for (Color c2 : Color.values())
	
*/
package EnumConstructor;

enum Color{
	SILVER("차가움"), GOLD("비쌈"), RED("강렬함");
	//생성자로 인해 변수들이 한바퀴 돈다는 것을 알 수 있다
	//이전 코드 public static final 어쩌구 코드의 증명
	public String feel;
	public String getFeel() {
		return this.feel;
	}
	Color(String feel) {
		System.out.println("Constuctor 호출: "+this+"의 느낌은... " + feel);
			this.feel = feel;
	}
}


public class EnumCon {

	public static void main(String[] args) {
		Color c = Color.GOLD;
		
		switch(c) {
		case SILVER:
			System.out.println("실버"+Color.SILVER.feel);
			break;
		case GOLD:
			System.out.println("골드"+Color.GOLD.getFeel());
			//메소드를 이용했다. 결과는 같지만 유지보수는 더 쉬울 것이다
			break;
		case RED:
			System.out.println("레드"+Color.RED.feel);
			break;
		}
		
		System.out.println(" ");
		
		for (Color c2 : Color.values()) {
			System.out.println(c2);
		}
	}

}
