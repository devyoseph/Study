package srcbin;
/* 이 자바 파일(ClasspathDemo2.java)를 콘솔에서 javac로 컴파일한다.
 	그러면 Item2.class라는 파일과 ClasspathDemo2라는 파일이 생긴다.
 	
 	컴파일 후: java ClasspathDemo2를 입력하면 터미널에서 Hello World출력
		주의) 패키지가 있으면 cd ..로 나가서 입력 java 패키지명.클래스명
		ex)[패키지 밖으로 나온 다음] java srcbin.ClasspathDemo2 입력시 실행
 
	
	< -claasspath "." >: 클래스 패스는 서로 연결된 클래스를 찾을 수 없을 때 해당 폴더를 찾아서 쓰라는 말이다.
	java -classpath "." srcbin.ClasspathDemo2 는 위 java srcbin.ClasspathDemo2와 동일하다.
	만약 intem2 클래스를 다른 파일에 옮긴다면?
	java -classpath ".;lib" srcbin.ClasspathDemo2로 클래스패스를 이용해 연결해준다. 
		"." 뜻: 현재 경로에서 찾아라
		; 뜻: 경로와 경로를 구분 
		".;lib" 뜻: 현재 폴더에 없으면 lib파일에서 찾아라 

	클래스패스를 사용하는 이유: 자바는 실행될 때 현재 디렉토리 안에서만 연결된 클래스를 찾기 때문에 	  
  		set CLASSPATH=경로;E
	<환경변수로 CLASSPATH 등록하기>
  	클래스패스의 검색: echo $CLASSPATH
			없는 경우 빈칸으로 뜬다.
	루트 디렉토리인 lib으로 들어간다.
	현재 나의 경로: pwd	  로 검색하고 복사

	클래스패스를 설정해준다(3가지 방법)

	 1.export CLASSPATH=$CLASSPATH:/Users/yang-yoseb/eclipse-workspace/Study08/srcbin/lib
	 2.export CLASSPATH = 경로
	 3.export CLASSPATH = 경로1:경로2:경로3 
  	
	클래스 패스 초기화: $set CLASSPATH=
	
	나중에 질문할 것: 패키지에서 나간상태로 클래스패스를 안쪽-안쪽에 있는
	디렉토리에 쓰고 싶을 때 어떻게 -cp와 export로 접근할 수 있는지 
 */
class Item2{
	public void print() {
		System.out.println("Hello World");
	}
}
public class ClasspathDemo2 {

	public static void main(String[] args) {
			Item2 i = new Item2();
			i.print();
	}

}
