/*
제네릭은 두 개의 변수를 한번에 지정할 수 있다
하지만 두 개를 한꺼번에 지정할 때 묶어줘야한다 
또한 한꺼번에 처리를 해줘야한다

*/
package Generic2;

class DG{
	int d;
	DG(int d){
		this.d = d;
	}
	}
//자기의 변수를 저장하는 클래스

class Dgen<T,Q>{
	public T a;
	public Q b;
	
	Dgen(T a, Q b){
		this.a = a;
		this.b = b;
	}
}



public class Generic02 {

	public static void main(String[] args) {
		Integer i = new Integer(100);
		Dgen<DG, Integer> p1 = new Dgen<DG, Integer>(new DG(2),i);
	    System.out.println(p1.b);
	}

}
