SELECT COUNT(Year) FROM main.main;


SELECT * FROM main.main WHERE Year IS NULL;
// Year column이 NULL값인 모든 행을 가져옵니다

SELECT SUM( CASE WHEN Year IS NULL THEN 1 END) FROM main.main;
// Year column 값이 NULL이면 1로 카운트 해서 더합니다

SELECT COALESCE( Year, '####' ) FROM main.main;
// Year 값이 NULL이면 ####으로 나타냅니다

SELECT Year AS 년도, Value AS 값 FROM main.main;
// Year column을 '년도', Value column을 '값'으로 표기합니다

SELECT Year AS 년도, Value AS 값, Year(SYSDATE())-Year AS 년차 FROM main.main;
// 현재 연도와 차이를 계산한 세번째 행이 만들어집니다

SELECT CONCAT(Year, '년') AS 년도, Value AS 값 FROM main.main;
// Year과 '년' 텍스트를 합쳐서 보여줍니다


SELECT Year 년도, Value 값, CONCAT( YEAR(SYSDATE())-Year, ' 년 전 ', Value, ' 달러' ) AS 정보 FROM main.main;
// 현재 시간의 연도를 계산한 값과 Year 행의 값을 뺀 값 + ' 년 전' + Value + ' 달러'

SELECT
CASE Year
   WHEN 2021 THEN '금년'
   WHEN 2020 THEN '작년'
   ELSE Year
END AS 년도, Value 값 FROM main.main;

SELECT Year 년도, Value 값,
CASE
   WHEN YEAR(SYSDATE())-Year BETWEEN 0 AND 2
   THEN '최신 데이터입니다'
   WHEN YEAR(SYSDATE())-Year BETWEEN 3 AND 5
   THEN '예전 데이터입니다'
   ELSE '오래된 데이터입니다'
END AS 정보
FROM main.main;
