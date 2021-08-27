package PackageFolder;

public class Test2 extends Test {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.a);  
		System.out.println(test.b);  // 상속으로 test의 protected를 가져옴  
	}

}
