import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
#Map(함수)
함수 x y를 그림으로 표현한 것을 연상한다
key 과 vaule의 값이 연결된다
x(정의역)은 중복되지 않는다
y(공역)에서 x에 해당되는 치역은  중복될 수 있다 

어떻게 그럼 연결지을까? add X, put O
put을 사용한다
연결지을 두 변수의 타입을 각각 지정해준다 <String, Integer>

사용법: 우선 임포트시킨다 
그리고 인스턴스할 때 데이터타입을 각각 지정한다
put으로 값을 대입한다
get으로 호출할 수 있다

지금까지 put과 get으로 구성요소들을 저장하고 불러왔다 
그런데 map은 set이나 list와는 달리 데이터타입이 두 개가 들어가고
그 두 개가 한 묶음으로 되어있다(자바스크립트의 객체의 프로퍼티)
Set:은 데이터 순서가 없이 데이터가 서로 참조의 형태로 모여있는 형태
List:는 질서정연하게 데이터들이 나열되어 있고 그 순서는 0,1,2,3...

근데 Map은? 둘 모두를 닮았다 데이터가 순서없이 떠다니지만
서로의 데이터가 서로 묶여 있는 상태이다. 그럼 이런 애들을 한꺼번에
처리하려면 어떻게 해야할까?

0)Set과 Map을 임포트 시킨다
1) 복잡하게 묶여있는 그물망을 따로따로 나눠줘야한다 
=즉 데이터타입은 String이나 Integer가 아니라 이런 얘들이 합쳐진
하나의 인스턴스이다. 순서가 없기 때문에 list보다는 set에 더 가깝다는 것을
알 수 있고 그것들을 set처럼 뭉텅이로 나눠줘야한다. 

 처음 데이터타입은 HashMap이며 메소드에 넣을 때는 일단  HashMap 타입으로 넣는다
 static void entrySetUse(HashMap map){}
HashMap 데이터타입은 말 그대로 Map이며 이것을 두개씩 묶인 덩어리로
사용하기 위해 데이터타입 변환을 해줘야한다 그것이 entrySet(); 이다 
순서가 없으니 list로 만들기는 그렇고 set으로 만들어 주는 것이다
데이터타입은 두개이며 set근본이 아니기 때문에 Map.Entry라는 형식으로 저장된다
 Set<Map.Entry<String, Integer>> entries = map.entrySet();
이런 entries를 다시 쪼개서 사용하기 위해 entry로 명명한다

2)key와 value의 뭉텅이로 나눠진 얘들을 호출할 때 
.getKey() .getValue()로 불러온다 두개가 붙어있는 애들이라 이렇게
호출이 나눠져 있다.

for ( Map.Entry<String, Integer> entry : entries){
			System.out.println(entry.getKey() + " : " + entry.getValue());
}
*/
public class Collection03 {

	public static void main(String[] args) {
		HashMap<String, Integer> hs =  new HashMap<String, Integer>();
		hs.put("one", 1);
		hs.put("two", 2);
		hs.put("three", 3);
		
		System.out.println(hs.get("one"));
		System.out.println(hs.get("two"));
		System.out.println(hs.get("three"));
		
		entrySetUse(hs);
		iteratorUse(hs);
	}
		static void entrySetUse(HashMap map){
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			for(Map.Entry<String, Integer> entry : entries ) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			}
		static void iteratorUse(HashMap map) {
			Set<Map.Entry<String, Integer>> entries2 = map.entrySet();
			Iterator<Map.Entry<String, Integer>> i = entries2.iterator();
			while(i.hasNext()) {
				Map.Entry<String, Integer> entry = i.next();
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}


