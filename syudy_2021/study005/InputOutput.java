/* <프로그램의 입력과 출력(IO>
 	1. void main (String[] args)의 의미 파헤치기 
 		String[]: 문자열을 담을 수 있는 배열
 		args: 배열의 이름 / 콘솔에서 값을 받는 용도로 사용한다. 
 		main이 이끄는 메소드의 args는 파라미터이다.
 		void는 리턴값이 존재하지 않는다의 의미 
 
 	실행 순서: main이 실행되고 args가 값을 받아서 내부 구문이 실행된다. 
 
 #	2. 콘솔실행: 디렉토리 추적하기
 		왼쪽 현재 프로젝트 파일 우클릭 - Location이 나타냄 
 		그 경로를 복사해서 콘솔로 들어간 후 'cd 경로'를 친다.
 		cd = 들어가는 명령   / cd.. = 나오라는 명령 
 		다른 드라이브라면( ex:  F:)  F:를 먼저 치고 위를 수행한다.
 		여기서 만약 디나이 당한다면
 		cd "/Users/yang-yoseb/eclipse-workspace/Study05" 
 		이런식으로 다시 쳐본다. 
 		
 		들어간 후: dir/w 	또는 ls -al 입력해보기 
 			src 가 존재하는지 확인한다! 
 		
 		cd bin 으로 bin 들어가기 
 		
 		<자바에서 입력값을 주는법> 
 		java -cp bin InputOutput
 		-cp: class pass라는 뜻
 		bin: bin안에 class가 있다는 것을 컴퓨터는 알게 된다.
 		클래스 이름에 .class를 붙이지 않는다.  
 		[	java -cp bin org. fsdfdsfds.  InputOutput
 		로 클래스를 앞에 다 쳐줘야 실행이 된다. ]
 		
 		실행이 안된다고 하지만 맥북은 된다 = 0이 출력됨.
 		
 		java -cp bin InputOutput 1
 		java -cp bin InputOutput 2 4 5 
 	
 		등으로 입력해본다. 
 
 	3. 콘솔에서 입력값을 받고 그 값을 출력해보기
 	 		for - each 구문 사용  
 	 		
 	
 	4. 콘솔에서 사용하면 위와 같이 하면 되고 
 		이클립스 내부에서 콘솔로 실행하고 싶다면 run configuration에서
 		arg 값을 입력해준다. 입력방식은 콘솔과 같이
 									1 2 3 4 
 		등으로 입력해주면 된다.
 		
 	5. sc.close를 치는 것을 잊지말자
 */
public class InputOutput {

	public static void main(String[] args) {
			for(String e : args) {
					System.out.println(e);
			}
			System.out.println(args.length);
	}

}
