/* 다형성을 응용해보자 
	인스턴스 자체를 변수로 지정해서 메소드 안에 넣을 수 있다. 
 */
package PolyStudy;

abstract class Poly{
	static double a;
	static double b;
	static double c;
	static double d;
	public Poly(double a, double b) {
		this.a = a; this.b = b;
	}
//public abstract로 상속해야만 사용하는 메소드를 형성 	
	public abstract double multi(){}
	public abstract double power() {}
	public abstract void run(){
		multi();
		power();
//abstract의 장점은 일단 메소드의 내용은 없어도 그것을 실행시키는
//호출 메소드를 만들어서 틀을 미리 만들 수 있다는 것이다. 
	}
}


class PolyB extends Poly{
	public PolyB(double a, double b) {
		super(a, b);
	}
	public double multi(){
		return (this.a*this.b);
	}
	public double power() {
		return Math.pow(this.a,this.b);
	}
	public void run() {
		this.c= multi();
		this.d=power();
	}
}

class PolyC extends PolyB{
	public PolyC(double a, double b) {
		super(a,b);
	}
	public void result() {
		System.out.println("결과는...");
		PolyB p =new PolyB(this.a, this.b );
		p.run();
		System.out.println(c+"와 "+d);	
	}
}

public class PolyPractice {

	public static void main(String[] args) {
		PolyB p = new PolyB(10, 5);	
		System.out.println(p.multi());
		System.out.println(p.power());
		
		PolyC p1 = new PolyC(5,5);
		p1.result();

	}

}
