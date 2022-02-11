SELECT Year,Units, Variable_code FROM main.main WHERE Units = 'Dollars' ORDER BY Variable_code LIMIT 5,3;


SELECT id,star,comment,registration_date
FROM review ORDER BY star ASC, registration_date desc
LIMIT 5;

SELECT * FROM main.main WHERE Variable_name LIKE BINARY '%a%';
//  Variable_name 값에 소문자 a가 포함된 문자열을 가진 데이터를 가져옵니다

SELECT * FROM table WHERE birthday BETWEEN '1950-01-01' AND '1980-01-01';
// 생일이 1950~1980년을 만족하는 데이터들을 가져옵니다
