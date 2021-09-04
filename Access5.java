/*지금까지는 데이터 타입의 접근제어자를 보았다.
	클래스의 접근제어자를 살펴보자
	1)public: public class Public{ }   =  다른 패키지에서 사용 가능
	2)default(아무것도 안적을 때): class Default{ } = 같은 패키지만 사용 가능



*/
package AccessPack;
import  OtherAccess.*;  //임포트는 필수이다.

public class Access5 {

	public static void main(String[] args) {
		Access4 a = new Access4();
		a._public();  // public 이기에 다른 패키지에서도 작동한다.
							//그러나 디폴트이면 작동하지 않을 것이다. 
	}

}
