데이터 접근

DML 언어인 query문을 입력하면 DML 컴파일러가 번역을 시작합니다

번역한 내용을 런타임 데이터베이스 처리기가 해석하고

저장 데이터 관리자를 통해 데이터베이스에 접근합니다

위 절차로 데이터베이스에 접근해 데이터를 조회할 수 있습니다

​

​

SELECT * FROM 테이블명 WHERE 조건 ;

​

예약어(Reserved Words)

색을 칠한 SELECT FROM WHERE 은

SQL에서 문법적으로 이미 사용되는 단어들입니다

대문자로 쓰는 것을 원칙으로 합니다

​

식별자(Identifier)

사용자가 이름을 정하는 데이터베이스명.테이블명

은 데이터들의 위치를 파악하는 기준이 됩니다

대소문자 가리지 않고 자유롭게 작성합니다

​

SELECT

테이블의 데이터를 조회합니다

'도서관의 수 많은 책 중에서 원하는 책을 꺼내온다'

이런 느낌으로 SELECT를 연상할 수 있습니다

​

​

*

'모든 열'을 의미합니다

애스터리스크(asterisk)라고 부릅니다

하지만 원하는 열(column)을 선택해서 가져올 수 있습니다

SELECT Year, Value FROM main; // 모든 열 중 Year, Value 열을 가져옵니다
 
​

FROM 테이블명 ;​

FROM은 '~로 부터' 뜻을 가집니다

'선택해준 테이블로부터 데이터를 가져온다'

로 해석할 수 있습니다. 문장 끝에는 콜론을 꼭 붙여줍니다

SELECT * FROM main; //main 테이블로부터 모든 열의 정보(*, 애스터리스크)를 가져옵니다
 데이터 베이스가 많아지고 각 데이터 베이스 안에

main 이름을 가지는 테이블이 존재할 수 있습니다

어느 데이터베이스의 main 테이블인지 명확히 해줍니다

SELECT * FROM main.main; //main 이름의 데이터 베이스 안 main 테이블
 ​

​

WHERE 조건문;

테이블을 가져올 때 특정 조건에 만족하는 데이터만 가져올 수 있습니다

WHERE 조건내용; 을 뒤에 추가해줍니다

SELECT * FROM main.main WHERE Year=2014;
 
​

하지만 위 경우는 INT(정수형)인 경우며

TEXT(문자열)인 경우 내용을 ' ' 안에 작성합니다

 // SELECT * FROM main.main WHERE Variable_category='Financial ratios';
 
[공부내용](https://blog.naver.com/josephdev123/222574130179)
 
