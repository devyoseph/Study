/* a.equals(b);  :   Boolean형이며 a가 b와 비교해 true or false 반환
 mac에서 Object 클래스의 equals()로 바로 이동하는법: cmd 누른 상태로 .equals 그냥 올려놓기

상속에서 자식이 부모행세는 가능하지만 부모가 자식행세는 불가능하다<다형성과 연관>
Student s -> Object  obj가능
Object obj -> Student s 불가능  (아래 확인)
//		return (this.name == obj.name);  s는 자식인데 자식을 obj로 받아서 쓸 수 없다 
 
 해결책: Object 앞에 (형변환 하고 싶은 타입) 을 적어준다
 예시: (Student)obj: 메소드와 반대로 앞에다 소괄호를 써준다!!! (주의)
 
 #hashCode() 메소드와 equals() 메소드를 같이 사용해서
 오버라이딩(Overriding)함을 잊지 말자
 
해당 부분 오른쪽 클릭 - Source - Generate hashCode  
*/
class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	public boolean equals(Object obj) {
//		return (this.name == obj.name);   이렇게 하면 상속관계 땜에 불가능
//     return (this.name==(Student)obj.name;  바로 사용할 수도 없다
		
	//	#먼저 형 변환을 해야한다
//		s = (Student)obj;   이렇게 쓰지 않도록 주의! 둘다 데이터형식을 써준다
		Student s = (Student)obj;
		return (this.name == s.name);
	}
}

public class Equalstudy {	
	
	public static void main(String[] args) {
			Student s1 = new Student("input");
			Student s2 = new Student("input");
			System.out.println(s1); //배열 번호가 나와서 
			System.out.println(s2);
			System.out.println(s1 == s2);// 같다고 하지 않는다
			System.out.println( s1.equals(s2));
			//cmd 누른채로 equals 위에 올리면 implementation이 뜸
			//.equals 가  boolean형임을 확인
	}

}
