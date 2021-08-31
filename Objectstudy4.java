// 일부러 클래스에서 인스턴스로 접근해서 오류내보기 
class D1{
	int instance = 2;
	
	static void classerror() {
			System.out.println(instance);
	}
	
}






public class Objectstudy4 {

	public static void main(String[] args) {
			D1 d = new D1();
			d.classerror();
	}

}
