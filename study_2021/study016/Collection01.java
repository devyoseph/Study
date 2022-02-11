import java.util.ArrayList;

/*
 Collections framework = 컨테이너(Container)
 구성:	Map / Collection-Set, List, Queue 
 배열의 단점은 크기를 정할 수 없다는 것이다
이 콜렉션 프레임워크를 통해 자유자재로 할 수 있다(배열의 한계극복)
각각의 카테고리에 따라 데이터의 저장방식이 다르다

Set과 List의 차이
Set: 1이라는 데이터가 있으면 더 이상 1의 데이터는 추가되지 않음(중복X)
List: 1이라는 데이터가 있어도 1이 추가될 수 있음(중복X)

1. ArrayList(List)
사용법: 먼저 임포트 시킨다= import java.util.ArrayList;
그리고 Scanner처럼 인스턴스화 시킨다
배열의 길이/추가: array.length / array[1] = "two";
프레임워크의 길이/추가/호출: al.size() / al.add("two") / al.get(2);

 주의점: ArrayList는 모든 데이터타입을 받을 수 있게 만들었기에
 al.add() 나 al.get()으로 나오는 애들의 데이터타입은 object가 되어야한다
 만약 내가 String value = al.get(1); 이런식으로 값을 가져오려면 오류가 뜬다
 String value = (String)al.get(1); 으로 맞춰줘야 한다 

개선점: 그래서 위처럼 타입의 안정성이 떨어지기 때문에
프레임워크에 저장되는 데이터타입을 한정해줄 수 있다

ArrayList<String> al = new ArrayList<String>();
제네릭의 개념을 더해서 입력되는 타입을 
Object가 아닌 String으로 가져올 수 있다	

*/
public class Collection01 {

	public static void main(String[] args) {
			String[] arrayObj = new String[2];
				arrayObj[0] = "one";
				arrayObj[1] = "two";
	//			arrayObj[2] = "three";  이미 배열의 크기를 fix해서 변경이 안된다
				
			for(int i = 0; i < arrayObj.length; i++) {
				System.out.println(arrayObj[i]);
			}
			
			System.out.println("");
			
			ArrayList al = new ArrayList();
			al.add("one");  //저장될 때 String이 아닌 Object로 저장된다
			al.add("two");
			al.add("three");
			for(int i=0; i<al.size();i++) {
				System.out.println(al.get(i));
			}
	}

}
