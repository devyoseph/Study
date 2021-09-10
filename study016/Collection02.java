/*  Set과 List는 인터페이스이다 
콘테이너의 Set을 알아보자
수학에서의 벤다이어그램이 생각나는가?
집합을 영어로 뭐라할까? Set
Set의 데이터는 순서가 있지 않다
Set: HashSet, LinkedHashSet, TreeSet

사용법: ArrayList처럼 임포트시켜준다
ArrayList와 같이 add로 추가해준다
한 번 입력된 값은 참조로 사용되기 때문에 중복이 되지 않는다

불러오는 법: Iterator 인터페이스 사용(컬렉션즈 프레임워크 표준) 
사용법: 
<메소드>
A.containsAll(B); [부분집합확인 메소드]A가 B를 포함하는가? = true or false
A.addAll(B); [합집합 메소드] A와 B를 합쳐 A로 만든다
A.retainAll(B); [교집합 메소드] A와 B의 교집합을 A로 만든다
A.removeAll(B); [차집합 메소드] A에서 B를 뺀 것을 A로 만든다 

<호출>
Iterator<Integer> iter = h.iterator();  로 불러온다
Set, List 안에는 .iterator()이라는 메소드가 존재한다
그러므로 Set과 List로 불러온 인스턴스를 통해
인스턴스이름.iterator()을 사용하여 호출하기 위한 데이터타입
Iterator로 정의할 수 있다
예시) Iterator<Integer> it = h.iterator();
이렇게 정의된 Iterator 클래스 내부에는
.hasNext() 메소드: 더 호출할 요소가 있다면 true, 없으면 false를 반환 
어떻게 개수를 셀까? iterator()로 데이터를 생성한다면
원본 데이터가 iterator로 복사가 된다. hasNext를 사용하면
복사된 iterator안에서 값이 사용되고 그 데이터가 지워지게 된다
.next() 메소드: 이터레이션의 다음 요소를 반환한다 
.remove() 메소드: 마지막 요소를 컬렉션에서 제거한다 
사용할 수 있게 된다
*/
import java.util.HashSet;
import java.util.Iterator;
public class Collection02 {
//hashset은 클래스
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(3);

		Iterator<Integer> it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
