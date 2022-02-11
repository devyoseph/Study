/*  연산자(Operator)
 	1)대입 연산자: =
 	2)산술 연산자: (+, - 등) 나머지 = a%b' 암기하자 = a를 b로 나눈 나머지   
 										+연산자의 경우 문자끼리도 덧셈이 가능하다! 
 	3)비교 연산자: ==, != , <, >, >=, <= 
 				!=  : not equal (!의 뜻: not) 
 		
 			<주의> 1= 2에서 '='는 대입 연산자이므로 말이 안된다)
 	 	
 	 		<주의> 문자열의 비교 연산은 .equal을 사용한다.
 	 					String a = "Hello"
 	 					String b = "World"
 	 					System.out.println(a.equal(b));
 	 				
 	4)논리 연산자: true, false
 	
 	5) 단항 연산자: 좌우가  있는 연산자의 반대개념(이항 연산자)
 				ex) ++,--,+,- 
 				
 	#연산자와 형 변환: 연산하면 자동 형 변환이 이루어질 수 있다. 
 
 
 
 
 */
public class OperatorStudy {

	public static void main(String[] args) {
		int a = 3;
		System.out.println(0%3);   //0 을 3으로 나눈 나머지 = 0
		
		//반복문으로 돌려보기 
		for(int i = 1; i<10; i++)
		{		System.out.println(i%3);
		
		
	}
		System.out.println("");
		int b = 8;
		int c = 3;
		
		System.out.println(b/c);  // 주의! 2로 출력이 됨 = 소수점을 잃어버린다
		
		float d = 10.0f;
		float e = 3.0f;
		
		System.out.println(d/e); // 데이터 크기 안에서 최대한 계산한다.
		
		//int 데이터를 float 데이터로 나눈다면? 
		System.out.println(b/e);
		/*형 변환의 원칙: 작은 데이터 크기 int가 float데이터 형식으로 바뀜
		   그 이후 연산을 하게 된다. 
		   결론: 형 변환 이후 연산 */
	
		
		// 단항 연산자 연습
		int z = 0;
		z++;  // z++의 뜻: z = z+1;
		System.out.println(z); 
		++z;
		System.out.println(z); 
		
		System.out.println(""); 
		// 단항 연산자 심화 이해
		int zz = 0;
		System.out.println(zz++);  // z먼저 대입하고 z에 더해라 
		//출력값은 0이지만 연산 후 zz는 1인 상태 
		System.out.println(++zz);  // z에 더하고 대입해라
		//본래 zz=1에서 1 더한 2가 출력이 된다.
	}

}
