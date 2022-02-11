SELECT DISTINCT(Units) FROM main.main;
// Units column의 중복되는 값을 제거한 값(값의 종류)들을 보여줍니다

SELECT DISTINCT RIGHT(Variable_code,2) FROM main.main;
// Variable_code 열의 오른쪽 2개 값을 추출하고 중복된 값을 제거해 보여줍니다


SELECT Units FROM main.main GROUP BY Units;
// Units column의 중복되는 값을 제거한 값(값의 종류)들을 보여줍니다

SELECT Year, Units FROM main.main GROUP BY Year;
// Year로 그룹핑을 해 모든 열 데이터를 집어넣었습니다. Units 열은 따로 빼두지 않았기 때문에 오류가 발생합니다


SELECT Units, AVG(CAST(replace(Value,',','') AS unsigned)) FROM main.main GROUP BY Units;
// Units 의 값들을 그룹핑한 뒤 각 그룹마다 Value 값의 평균을 보여줍니다

SELECT Units, MAX(CAST(replace(Value,',','') AS unsigned)) AS 최대값 FROM main.main GROUP BY Units;
// Units 의 값들을 그룹핑한 뒤 각 그룹마다 Value 값의 최대값을 보여줍니다

SELECT Year,Units,COUNT(*) FROM main.main GROUP BY Year,Units;
// Year와 Units 행으로 그룹을 형성하고 각각의 개수를 세어줍니다

SELECT Year,Units,COUNT(*) FROM main.main
GROUP BY Year,Units
HAVING Year=2020;
