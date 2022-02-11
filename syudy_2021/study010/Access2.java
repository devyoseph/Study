/* 아래 클래스들을 대입해가며 공부한다
 
 public > protected > default > private
  전체	 > 다른패키지 서브클래스 > 같은 패키지 > 현재 클래스 
*/
package AccessPack;
import OtherAccess.*;  //임포트 시켜준다

//Class Myself라는 자기 자신을 호출하는 클래스를 만들어본다.
//자기 자신을 호출할 때 생성자 안에 this. 으로 불러온다.
class Myself{
	public Myself() {
		this._public();
		this._protected();
		this._default();
		this._protected();
	}
	
	public void _public() {
		System.out.println("PUBLIC");
	}
	void  _default() {
		System.out.println("DEFAULT");
	}
	protected void _protected() {
		System.out.println("PROTECTED");
	}
	private void _private() {
		System.out.println("PRIVATE");
	}
}


//같은 패키지에 있는 Access3에서 호출해본다. 
public class Access2 extends Access3{
			public Access2(){}
			public static void main(String[] args) {
				Access3 a = new Access3();
				a._public();
				a._protected();
	    	//	a._defaut();
			//	a._private();
			}
			}

//다른 패키지에 있는 Access4를 임포트 한 뒤 불러본다.
class CheckOther extends Access4{
	public CheckOther(){
		Access4 b = new Access4();
		b._public();
		//b._protected();
		//b._default();
		//b._private();
		//this._private();
		this._public();
		//this._default();
		this._protected();
		}
	
	}
