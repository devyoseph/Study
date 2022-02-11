SELECT AVG(grade_avg) FROM // 위에서 작성한 코드를 () 소괄호로 감싸 FROM으로 불러옵니다

(SELECT Name, AVG(Grade) AS grade_avg, AVG(Grade)-(SELECT AVG(Grade) FROM practice)
FROM practice GROUP BY Name 
HAVING AVG(Grade)>=(SELECT AVG(Grade) FROM practice)) AS result; // result라는 임시이름


SELECT Name, AVG(Grade), AVG(Grade)-(SELECT AVG(Grade) FROM practice)
FROM practice //위 내용과 같음

WHERE connect_id //WHERE 절 추가
IN( SELECT id FROM practice2 WHERE Salary>= (SELECT AVG(Salary) FROM practice2))

GROUP BY Name 
HAVING AVG(Grade)>=(SELECT AVG(Grade) FROM practice); //위 내용과 같음
