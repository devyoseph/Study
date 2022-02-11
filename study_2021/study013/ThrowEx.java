import java.io.*;

//오류 투성인 구문이며 BufferedReader에 대한 이해도를 높혀야할 것 같다
public class ThrowEx {

	public static void main(String[] args) {
BufferedReader bReader = null;
try {
	bReader = new BufferedReader(new FileReader("out.txt"));
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
String input = null;
try {
	input = bReader.readLine();
} catch (IOException e) {
	e.printStackTrace();
}
System.out.println(input);
	}
}
/*에러가 발생하는 이유? 
	FileReader 두번클릭하고 F2키를 눌러 도움말 창을 연다 
*/	
