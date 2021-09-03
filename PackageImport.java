package PackageStudy2;
/* 메인함수 바깥 클래스 내 void를 그냥 선언하면 호출이 안된다
	static 사용!!

	#컴파일 추가사항
	javac 경로/..../파일이름.java -d bin
	-d: 컴파일을 다른 곳에 저장하겠다
	bin: 그 파일 이름은 bin 
	
	컴파일을 import(패키지 로드)했는데 클래스명이 중복되는 경우
	인스턴스를 생성할 때 아예 경로까지 다 만들어준다.
	
	Packages.org.B b = new Packages.org.B();

	*/
public class PackageImport {
		static void print() {
			System.out.println("import 되어있다.");
		}
	
	public static void main(String[] args) {
		print();
	}

}
