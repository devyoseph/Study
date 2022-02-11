/* Class의 경우 생성자를 적지 않아도 다음 구문이 숨겨져 있다.
			public GetterSetter( ) { }
	그러나 다른 생성자를 만드는 순간 이 구문은 사라진다. 그러므로
	다른 생성자를 만들 때 수동으로 클래스의 생성자를 만들어줘야 한다. 
			public GetterSetter( ) { }

	this.name 등으로 구분을 더 쉽게 할 수 있다. this는 여기서 class를 의미
		this.name = _name;
		this.age = _age;
		this.hobby = _hobby;
		
	인텔리제이를 사용하면 alt + insert 키로 생성자 한번에 만들기 가능(Constructor)
*/
public class GetterSetter {
			
				String name;		//이름
				int age;				//나이
				String hobby;		//취미
//클래스의 생성자 만들기 	
	public GetterSetter(String _name, int _age, String _hobby) {
				name = _name;
				age = _age;
				hobby = _hobby;
				/* 
				1. 정보를 하나씩 따로 입력하여 저장하는 법 = Setter 사용 
			   	<메인>
				 1) 
				 public GetterSetter (){}   처럼 비워두고 
				 
				 2)
				 public String setName (String name) { 
				 				this.name = name; 
				 } 으로 자료 저장 방향을 설정해준다.
				 
				 3)
				 public String getName(){
				 				return name;
				 }	으로 저장된 정보를 출력할 수 있는 통로를 만들어준다. 
				 
				 <자료를 수집하는 class, 여기서는 Mgetset.java>   
				 
				1) GetterSetter user = new GetterSetter(); 로 불러온 다음
		   		user.setName("Joseph"); 로 2)에 의해 this.name에 저장된다.
		   		
		   		2) System.out.println(user.getName());  으로 호출해본다.
				*/ 
	}
}
	

