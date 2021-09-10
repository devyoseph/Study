import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
콜렉션즈 프레임워크의 조작 중 정렬을 배운다

Collections 클래스는 Collection과 다르며 구성요소가 전부 static이기에
인스턴스화할 필요가 없다
Collections.sort(computers);
sort의 경우 사용하기 위해 해당 인스턴스의 클래스가
Comparable interface를 implements하고 있어야 한다 
sort가 실행되면 compareTo의 결과에 따라 정렬이 된다 

Comparable을 사용하면 구현해야하는 메소드
public int compareTo(Object o){
			return this.serial  - ((Computer)o).serial;
}
a.compareTo(b); : 위 구문에 따라 a-b를 하게 됨 
*/

class Computer implements Comparable{
	String s;
	int i;
	Computer(String s, int i){
		this.s = s; this.i = i;
	}
	
	public int compareTo(Object o) {
		return this.i-((Computer)o).i;
	}
	
	//그냥 출력하면 배열번호가 나오므로
	public String toString() {
		return i+" "+s;
	}
}

public class Collection04 {

	public static void main(String[] args) {
		List<Computer> computers = new ArrayList();
		computers.add(new Computer("sun",300));
		computers.add(new Computer("moon",200));
		computers.add(new Computer("wind",100));
		
		Iterator i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("");
	    Collections.sort(computers);
	    i = computers.iterator();
	    while(i.hasNext()) {
			System.out.println(i.next());
    	}

}
}
