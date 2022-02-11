/*Exception(예외): 예기치 못한 경우가 발생함 
 	# 0으로 나누는 경우: double의 경우 infinity로 출력이 되며 오류가 발생하지 않음
 	 				int의 경우 오류가 발생한다.

	try{ 중괄호: 시도하므로 조건이 없다, 오류를 만나면 즉시 멈춘다 } 
	catch( Exception e){ 
	오류가 잡히면 할 행동: e.getMessage / e.toString / e.printStackTrace()
	}

try문 주의: 오류를 만나면 즉시 멈추므로 오류 이후 구문은 실행되지 않는다
catch문: catch문이 끝나도 뒤 구문들이 실행된다
*/
// 계산기 프로그램이 나눗셈을 0으로 할 때 발생하는 경우를 보자
class Calex{
	int x;
	int y;
	
	public void setNum(int x, int y) {
		this.x = x; this.y = y;
	}
	public void devide() {
// [1]		System.out.println("계산결과는 "+ x/y+"입니다.");   이 부분을 
			try{
				System.out.println("계산결과는 "+ x/y+"입니다."); 
		}  catch(Exception e){
			System.out.println("오류가 발생했습니다."+ e.getMessage());
				//    getMessage = / by zero 
		}
	}
}
public class Exstudy {

	public static void main(String[] args) {
			Calex c = new Calex();
			c.setNum(10, 5);
			c.devide();
			
			c.setNum(5, 0);
			c.devide();  //여기 부분이 오류를 발생시킨다.
	}
}
