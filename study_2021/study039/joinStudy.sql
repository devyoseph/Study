SELECT
	B.id,
    B.name,
    A.Grade,
    A.Sales
FROM practice AS A JOIN practice AS B // AS를 사용해 임시 이름을 지어줌
ON A.connect_id = B.id;


SELECT
	B.id,
    B.name,
    A.Grade,
    A.Sales
FROM practice AS A LEFT JOIN practice2 AS B
ON A.connect_id = B.id
UNION
SELECT
	B.id,
    B.name,
    A.Grade,
    A.Sales
FROM practice AS A LEFT JOIN practice2 AS B
ON A.connect_id = B.id;
