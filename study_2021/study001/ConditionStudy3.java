import java.util.Scanner;

/* 1.While문: for문과 다르게 연산자를 대괄호 안에다 집어넣고 진행한다. 
      for문과 다른점
      1)조건문에 ;가 안들어간다.
      2)연산자에 ;을 붙이는 것을 주의한다.      
   
    2.내가 원하는 숫자로 그때마다 바꾸는 법: Scanner 이용 -> validate 해서 연결시켜야 동작을 할 수 있다.
   
 */
public class ConditionStudy3 {

	public static void main(String[] args) {
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n<10) {
			System.out.println(n);
			n++;
		}
		

}
}