/* 1.배열: 자바에서는 대괄호[]가 배열의 선언이다.
		1)int 배열이름[]로 생성: ex)new int[10]; 0부터 9까지의 배열을 가지게 된다. 
			주의! - 10까지 아님!, int로 선언할 수 있다는 것 암기
		 	이유: index의 시작은 항상 0부터이다. 
		 *print 안에 지정한 array함수를 사용할 수 있으며 조건문 안에서 +를 사용해 꾸민다.
		2)String 배열이름[]로 생성: int와 달리 문자열 사용가능 



*/
public class ArrayStudy {
//STEP1
	public static void main(String[] args) {
		int arrayInt[] = new int[10];
		for (int i=0; i<arrayInt.length; i++) {
			System.out.print(i+" ");
	} System.out.println("");
//STEP2
		int arrayInt2[] = {1,3,5,7,9};
		for (int i=0; i<arrayInt2.length; i++) {
			System.out.print(i+" ");
}	  System.out.println("");
//STEP3
		for (int i=0; i<arrayInt2.length; i++) {
			System.out.print(arrayInt2[i]+" ");		
}	  System.out.println("");
//STEP4
		String s[] = {"a","b","c","d","e"};
		for (int i=0; i<s.length; i++) {
			System.out.print(s[i]+" ");		
}
	}}