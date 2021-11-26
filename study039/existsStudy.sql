SELECT Name FROM main.practice
WHERE Name IN(SELECT Name FROM main.practice WHERE practice.Contact=35);
// IN 앞에 column이 Name이면 서브 쿼리에 가져올 column도 Name임을 주의합니다

SELECT * FROM main.practice
WHERE EXISTS(SELECT * FROM main.practice2 WHERE Contact=35);
// Contact 가 35인 값을 가지는 practice2 의 쿼리들을 가져옵니다 
