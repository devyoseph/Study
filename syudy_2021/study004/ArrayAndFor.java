/*	<반복문과 배열>
 	이 둘은 밀접한 관계가 있다.
 	그래서 배열과 반복문을 연결하는 인자가 존재한다 = ' : '

  	String[] class1 = {"김아무개", "박아무개", "심아무개"};
  	for( String e : class1) {}
  
  	#복잡하게 i를 쓸 필요 없이 조건문 () 안에 
  	 	(데이터 타입  데이터 이름(e)  + ' : ' + 배열이름)
  	 	로 정해준다면 순간적으로 데이터 안에 배열 데이터가 저장된다.
  	 	
  	 	= for - each 
  */


public class ArrayAndFor {

	public static void main(String[] args) {
		String[] class1 = {"김아무개", "박아무개", "심아무개"};
	  	for( String e : class1) {
	  			System.out.println(e + "가 등록되었습니다");
	  	}
	  
	}

}
