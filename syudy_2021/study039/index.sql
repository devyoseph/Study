SHOW INDEX FROM 테이블명;  // 인덱스 조회

DROP INDEX 인덱스명 ON 테이블명;  // 인덱스 삭제

CREATE CLUSTERED INDEX 인덱스명 ON 테이블명 (칼럼명);
// 내가 원하는 테이블의 칼럼을 클러스터 인덱스로 만듭니다

CREATE INDEX 인덱스명 ON 테이블명 (칼럼명);
// Non-Clustered 인덱스를 생성합니다

CREATE INDEX 인덱스명 ON 테이블명 (칼럼명1, 칼럼명2, 칼럼명3,...);
// Composite-Clustered 인덱스를 생성합니다
