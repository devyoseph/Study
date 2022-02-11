
/*
 enum(enumerated type: 열거형): 서로 연관된 상수들의 집합 
사용법: enum 클래스명{
		변수들 세미콜론 없이 쉼표(,)로 열거
}
*/


enum Fruit{
	APPLE, PEACH, BANANA  // ;세미콜론이 필요가 없다!!
//public static final Fruit APPLE = new Fruit(); 이 함축되어 있다 	
//하나의 데이터타입이며 아래에서도 사용시 데이터타입을 명시한다	
}

class Enum2 {

	public static void main(String[] args) {
		
		Fruit a = Fruit.APPLE; // type은 APPLE과 똑같은 데이터타입이어야 저장이된다
		
		 switch (a) {
		 case APPLE:
			 System.out.println("APPPPPPLE");
			 break;
		 case PEACH:
			 System.out.println("PEEAAACH");
			 break;
		 case BANANA:
			 System.out.println("BAAANAAANA");
			 break;
		 }

	}
}
