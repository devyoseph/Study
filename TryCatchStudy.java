/* 1.예외처리
 			try  {중괄호} + catch(Exception e){    } : 여기서 e는 변수 지정이다.
 			try: 실행하다가 예외상황 발생시 catch하게 된다.  
			catch구문 안에 종료문을 넣고 꺼버릴 수 있다 > 뒤 구문 실행X
				System.exit(0); 
			catch에서 만든 e를 다시 받아서 오류구문을 추출할 수 있다.
				e.printStackTrace();     // 구동할 때 오류가 어디서 났는지 알려줌
*/

public class TryCatchStudy {

	public static void main(String[] args) {
		int intArray[] = new int[5];
			try {
				intArray[3] = 10;	   // 그냥 평범한 구문 
				intArray[6] = 10;   // 배열범위를 초과하게 되었다.
			}
			
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("배열범위 초과"); //2번째 것에서 캐치가 됨.
				System.exit(0); 
			}
			System.out.println("프로그램이 끝났습니다."); //꺼버리는 구문으로 안보인다. 
	}

}
