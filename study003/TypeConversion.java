/* 1. 형변환(Type Conversion) 
	 	ex) int 를 double 이나 float으로 바꿈 
		
	<200과 200.0의 경우를 보면 둘의 비트값은 아예 다르다>
		00000000 00000000 00000000 11001000
		01000011 01001000 00000000 00000000 
	형변환은 이해해 보도록 하자.
	 
		 1)자동 형 변환
		 2)명시적 형 변환 
		 
*/
public class TypeConversion {

	public static void main(String[] args) {

		double a = 3.0F;  

// 자동 형 변환 - float의 숫자 형식을 지정했지만 double형으로 자동 변환해줌

//		float b = 3.0; // 그냥 3.0은 double 형식이다. - 오류발생
		
//자동 형 변환의 원칙= 좁은 데이터 타입에서 넓은 데이터 타입으로 변환 가능  
	// byte - short - int - long - float - double
	// 				char - int : 반대는 불가능, 문자의 유니코드 값으로 변환 
	
		//자동 형 변환의 예시
		int c = 1;
		float d =2.0f;
		double e = c + d;
		System.out.println(e);
		
	    //계산 됨을 알 수 있다. 
		//계산과정 : int 1은 1.0f로 변환되고 결과인 3.0f는 3.0으로 변환된다. 
		
		
		
/*		2)명시적 형 변환(수동)
			자동 형 변환이 적용되지 않는 경우이며 수동으로 해준다.
			
			자동으로 안되는 경우? 넓은 데이터에서 좁은 데이터로 변환
*/	
		float f = (float)4.0;  // f가 없는 double의 데이터 형식을 float 변환 
		int g = (int)100.0f;  // 만약 100.1이라면? 100이됨 = 소수점 이하 제거 
		
	} 

}
