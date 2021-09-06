/* <배열> .length와 같이 외울 것!!
 		배열은 하나의 데이터 타입이다.
 		배열 호출시 0부터 되는 것을 잊지말자.
 		색인(index):[ 0 ],  [ 1 ]  이런 배열에서 데이터를 꺼내는 대괄호를 말함 
 		.length를 통해 데이터 개수를 추출할 수 있다.
 				= length의 경우 실시간 자료 개수가 아닌 빈 곳을 포함한 자료크기이다 = 고정된 수 
 		
 		#배열 정의 
 		저번에 배운 대괄호로 생성하는 것이 있는데 두가지 경우 생성 가능하다.
 		1)지정할 배열 뒤에 [대괄호 ]
 			String classgroup[] = {"홍길동", "장희빈", "흥선대원군","춘향"};
 		
 		2)변수 타입 뒤에 바로 대괄호
 			String[] classgroup = {"홍길동", "장희빈", "흥선대원군","춘향"};
 
		##빈 배열 데이터 생성하기 ex) 빈데이터 [5]로 생성 = [0]~[4] 
		
		String class[] = new String[5];
		
		//여기서 매우 주의할 점: new String[5];	에서 5란 데이터 방의 크기다
		  즉, 0,1,2,3,4로 색인이 가능하다 
 
 		3) 안에 들어 있는 자료들 = element라고 한다.
 */

public class ArrayStudy2 {

	public static void main(String[] args) {
		
		//두가지 배열 정의 모두 가능하다!!
			String classgroup[] = {"홍길동", "장희빈", "흥선대원군","춘향"};
			System.out.println(classgroup[1]);
			
			String[] classgroup2 = {"홍길동", "장희빈", "흥선대원군","춘향"};	
			System.out.println(classgroup2[2]);
	
			System.out.printf("총 인원은 %d명 입니다%n%n",classgroup.length);
		
			// 빈 배열 정의 시 숫자는 데이터가 들어갈 수 있는 수이다. 
			String class1[]  = new String[4];
			
			//class1.length는 자료를 추가하든 안하든 값은 4로 일정하다.
			
			//class 안에 내용은 문자열이며 print로 부른다는 것은 변하지 않는다.
			class1[0] = "김철영";
			System.out.print(class1.length);
			class1[1] = "김철일";
			System.out.print(class1.length);
			class1[2] = "김철이";			
			System.out.print(class1.length);
			class1[3] = "김철삼";
			System.out.print(class1.length);
	
			
	
	}
	

}
