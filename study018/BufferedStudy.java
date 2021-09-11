/*Buffered 메소드: 버퍼를 이용하기에 효율이 좋다 
주의점: 엔터만 경계로 인식,받은 데이터는 String으로 고정

임포트: java.io.*;

Scanner와의 차이점
new BuffferedReader( 안에 )  바로 System.in 으로 받는게 아닌
new InputStreamReader(System.in)로 받는다 (여기서 파일로 받을 수도 있고 등) new FileWriter() 
try catch문이 필수

#BufferedWriter 메소드 
출력: br.write(" ");  // |n은 띄어쓰기
엔터: br.newLine();
남아있는 데이터 모두 출력(필수): br.flush();
닫기: br.close();

끝나고 형 변환이 거의 필수
int num = Integer.parseInt(br.readLine());

Integer.parseInt(); 문자열을 정수로 바꾸는 메소드 
String.valueOf();  정수를 문자열로 바꾸는 메소드

결과값은 : .readLine()에 저장 

값을 다 옮기면 닫아줘야함 close (Scanner와 비슷)
*/
import java.io.*;
public class BufferStudy {

	public static void main(String[] args) {
	try {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
//문자로 받는 경우, String s = br.readLine();
		//InputStramReader() 안에 readLine이 있고 그게 값을 받아 저장해준
		int num = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		br.close();
		
//한줄한줄 읽어서 출력
//1)일단 틀을 만든다. 문자로 받으므로 String
//	String line ="";
//하나하나 line에 대입, 띄어쓰기를 인지못하기에 조건을 넣는다
//	for( int i = 1; (line=br.readLine()) != null; i++) {
//		System.out.println(line);
//	}
	bw.write(String.valueOf(num));
	bw.flush();
	bw.close();
		
	}catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}
}
