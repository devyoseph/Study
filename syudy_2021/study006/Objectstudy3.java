/*[클래스 맴버와 인스턴스 맴버 연결 관계 실험]
 	1. static: 클래스 맴버
 	2. 공백 void 이름(){}: 인스턴스 맴버  
*/

class C1{
	static int static_var =1;
	int instance_var =2;
		
	static void static_print() {
			System.out.println(static_var);
	}
//	static void instance_print() {   중간에 실행이 안되면 뒤에도 안된다.
//		System.out.println(instance_var); 
	void instance_static() {
		System.out.println(static_var);
	}
	void instance_instance(){
		System.out.println(instance_var);
}
}

public class Objectstudy3 {

	public static void main(String[] args) {
			C1 c = new C1();
			c.static_print();
			c.instance_static();
			c.instance_instance();
	}

}
