/* 1.for문: 소괄호 사용, 바로 변수 선언과 조건을 넣음, 각 끝 = 세미콜론 
  		조건: i<3 , i++ : i가 계속 증가해서 3이 되면 멈춤  
 			i++의 경우 세미콜론을 안적어도 되며 엑셀처럼 ,를 쓰지 않음 
 		순서주의: 변수지정 / 제한조건 / i의 증감 
   2.배열: String str[] = {"하나","둘","셋"}; 이런식으로 만든다.
*/
public class ConditionStudy2 {

	public static void main(String[] args) {
			for(int i=0; i<3; i++) {
				System.out.println("for문의 반복+&i");
			}
				System.out.println("마침");
				System.out.println(" ");
				
				String str[] = {"하나","둘","셋","넷"};
				
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]);
			}
	
	}
	
	

}
