/* #생성자와 상속의 관계
	생성자는 우리가 만들지 않아도 컴퓨터가 알아서 생성하고 있다.
	예를 들어 Constructor라는 클래스를 만들고 실행할 때, 컴퓨터는
	자동으로 비어있는 Constructor 이름의 생성자를 만들고 사용한다.
	 >이것을 실험하는 것이 아래 예제에 나온다.
	
  
  
  
 */
//여기서는 대충 InheritCons 라는 클래스명을 사용했다.
//놀랍게도 아래를 실행했을 때 에러가 생기지 않는다.
//클래스를 만들때 같은 이름의 메소드(생성자)를 만들어준다는 것이다.
public class InheritCons {

	public static void main(String[] args) {
		InheritCons i = new InheritCons ();
		
		InheritCons2 i2 = new InheritCons2();
	
		/* 위 구문은 오류가 걸린다. 
		<매개변수를 요구하는 생성자> 
		아래 생성자 조건에 의해 무조건 변수를 입력해야 하기 때문이다. 
		그렇기에 매개변수를 요구하는 생성자가 있는 경우,
		빈 인스턴스를 생성하기 위해 수동으로 빈 생성자를 입력해주어야한다 
	
		그 절차를 생략해주는 것이 바로 super( para1, para2); 구문이다.
		super를 그 클래스 최상단에 놓는 것을 명심한다. 
		*/
	}

}

class InheritCons2{
//	public InheritCons2() {}
	public InheritCons2(int paramet) {}
}
