package srcbin;


class Item{
	
}
public class ClasspathDemo {

	public static void main(String[] args) {
		

	}

}

/*
1. 이 자바파일의 경로에 들어가 경로를 복사하고, 텍스트 파일로 열어둔다.
2. 현재 위치를 파악하고 터미널을 연다.
	1)드라이브가 다르다면? 'F:'를 입력해 드라이브로 들어가고
	2)나머지 경로를: 'cd 경로'를 입력해 들어가준다. 
		ex)cd eclipse-workspace/Study08/srcbin
	3)파일 탐색
		윈도우: dir
		맥: ls -al
	4)javac ClasspathDemo.java 입력
	  javac에서 c의 뜻: compile = 소스코드를 컴파일(compile)해서 클래스코드(class)로 만든다. 	
	
	5)결과: ClasspathDemo.java 안에 있는 클래스 코드들이 ls -al 로 콘솔에서 나타나는 파일로 분리가 된다.(파일화)

*/