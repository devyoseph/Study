/* #유효범위(=scope)
 	프로그램이 커지면 여러가지 이유로 충돌하게 되는데 
 	이때 고안된 개념이 scope라고 한다.
 	
 	두 시트를 비교하기: 왼쪽 창에서 ctrl을 눌러 두 개의 클래스를 동시에
 		클릭한 뒤-오른쪽 마우스-compare with-each other 
 
 	참고)전역변수(global variables) vs 지역변수(local variables) 
 */
public class ScopeStudy {
//		static int i = 0;			(1)
	static void a() {
		int i = 0; // i= 0;		(2)
	}	
	public static void main(String[] args) {
			for(int i=0; i<10; i++) {
				System.out.println(i);
				a();
/*a()는 i를 0으로 고정시켜주는 메소드인데 for구문 안에서
	a()를 실행시키면 i가 초기화될 것처럼 보이지만 메소드의 변수는 
	메소드 내에서만 작용함을 유의한다. 즉 변수 i가 이름만 같다. 
	
	
	####유효범위는 [선언]의 유무가 매우 중요하다.
	아무리 전역변수여도 메인 for문에서 int i로 생성하면 그 안에서만
	가동한다. 또 위 a() 메소드 내 i를 int i 로 선언해도 a() 안에서만
	가동해야한다. 
	요약: static으로 변수를 고정시키고 int로 재선언하지 않아야만
			서로 연결되며 그 외 메소드 안에서 선언 시 분리된다. 
			메소드 안에서 int i; 의 변수선언: 메소드 안에서만 사용할 i를 정한다.   
*/			}
	}

}
