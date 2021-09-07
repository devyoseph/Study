/*finally: 예외여부와 상관없이 실행되는 로직
try{ 예외가 발생할 것으로 예상되는 로직 
} catch(예외클래스 인스턴스{ 
예외가 발생했을 때 실행되는 로직
} finally{ 예외여부와 상관없이 실행되는 로
}

finally{ }: 언제쓰는가? 데이터베이스(DB)와 접속되어있는 상태를 끊어주기 위해
*/
class B{
		private int[] finalb = new int[5];{
			finalb[0] = 0;
			finalb[1] = 2;
			finalb[2] = 3;
			finalb[3] = 4;
			finalb[4] = 5;
		}
		public void cal(int a, int b) {
			System.out.println(finalb[a]/finalb[b]);
		}
}
public class Exfinally {

	public static void main(String[] args) {
			try {
				B b = new B();
				b.cal(10, 3);
				b.cal(3, 2);
				b.cal(4, 0);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열에러발생: "+e.getMessage());
			}catch(ArithmeticException e) {
				System.out.println("산수에러발생: "+ e.getMessage());
			} finally {
				System.out.println("finally code 실행");
			}
	}
}
