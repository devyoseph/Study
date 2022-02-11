/*final: abstract의 반대 상속을 금지 
 #variable = field 임을 명심한다
 	1)변수를 final
 	2)메소드의 final (클래스 상속하고 final의 메소드를 상속 불가능)
	3)클래스의 final (상속자체가 불가능)
*/
class A{
	//메소드를 final 화 시킨다 
	final void b() {}	
	void c() {}
}
class B extends A{
	void c() {}	   //이건 정의되지만
	void b() {}   //이건 정의되지 않는다
}
public class Final {
	// a를 final로 지정하고 b를 그냥 static으로 지정해 차이를 알아본다 
	static final int a = 1;
	static int b = 2;
	public static void main(String[] args) {
		System.out.println(b);
		b= 22;
	//	a =11;    당연히 오류가 발생한다 
		System.out.println(b);
	}

}
