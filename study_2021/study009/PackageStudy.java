/* #패키지(package)
 	[java파일의 위치 파악]
 	왼쪽 패키지 익스플로러 - PackageStudy 우클릭 - properties
 	아래 패키지 경로:  package Packages;
 	
 	Properties 경로: /Users/yang-yoseb/eclipse-workspace/Study09/src/Packages/PackageStudy.java
 	를 비교하면 src를 제외한채 동일한 모습이 나타남을 보여준다.
 	
	<패키지 로드>
	어제배웠던 컴파일의 개념에서 같은 패키지 안에 있지 않으면
	컴퓨터는 해당 클래스가 다른 패키지에 있을 때 인식하지 못한다.
	이것을 해주는 것이 바로 import이다.
	
	import PackageImport.A   처럼 클래스까지만 임포트해준다.
  	(노란줄이 떠도 당황하지 않는다 = 미사용중이라는 뜻)
  	
 	하위 전체를 임포트 시키고 싶다 = * 사용 [와일드 카드]
 	 import PackageStudy2.*;
 */ 
 package Packages;
 import PackageStudy2.PackageImport;

public class PackageStudy {

	public static void main(String[] args) {
		PackageImport b = new PackageImport();
		b.main(args);
	}

}
