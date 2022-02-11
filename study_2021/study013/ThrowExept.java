/*예외를 바로 처리하지 않고 던지는 것에 대해 이해한다.
 사용법: 메소드() throws 넘기고싶은exception
 목록 띄우기: 환경설정-general-key-content assist 설정 = 나는 ctl cmd space


 IOException > FileNotFoundException인 포함관계이기 때문에
 catch문 중에서 FileNotFoundException부분을 지워도 된다 
*/
package ThrowEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class A{
	void run() throws FileNotFoundException, IOException{		//여기서 throws를 해서 B로 넘김
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class B{
	void run() throws  FileNotFoundException, IOException{
		A a = new A();
		a.run();  //throws로 넘겨져서 여기가 붉게 된다 = try를 시도하자
	}
}
public class ThrowExept {
	public static void main(String[] args) {
			B b = new B();
			try {
				b.run();
			} catch (FileNotFoundException e) {
				System.out.println("파일이 필요합니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
