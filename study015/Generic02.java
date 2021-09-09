/*
제네릭은 두 개의 변수를 한번에 지정할 수 있다
하지만 두 개를 한꺼번에 지정할 때 묶어줘야한다 
또한 한꺼번에 처리를 해줘야한다

*/
package Generic2;
//위와 완전히 같은 코드
class Gene<T, Q>{
T t;  Q q;
Gene(T t, Q q){
 this.t = t;
 this.q = q;}}

/*메소드를 만들어서
그 메소드의 인스턴스를
만들어보자 */
class GenIn{
  String g;
 GenIn(String g){
this.g = g; 
}} //지극히 평범한 메소드

//인스턴스 만들기(메인메소드)
public class Generic02 {
	public static void main(String[] args) {
		
	  GenIn a = new GenIn("GenIn");
//제네릭에서 원시데이터를 인스턴스 시킬 수 없다
//애초에 (원시데이터 -> 다른 데이터타입)이 이상함
      Integer b = new Integer(100);
//원시데이터는 wrapper메소드로 클래스화 시킨다

//Gene<GenIn, Integer> p = new Gene<GenIn, Integer>(new GenIn("GenIn"), b);
//두 개를 지정, new Gene( ) 안에 두개가 들어간다

     Gene p = new Gene(a, b); 
      
System.out.println(a.g);
}}