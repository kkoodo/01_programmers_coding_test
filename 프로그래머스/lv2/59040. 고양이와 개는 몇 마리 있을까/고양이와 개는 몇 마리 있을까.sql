-- 코드를 입력하세요
SELECT MAX(ANIMAL_TYPE) AS "ANIMAL_TYPE"
     , COUNT(ANIMAL_ID) AS "count"
  FROM ANIMAL_INS
 GROUP BY ANIMAL_TYPE
 ORDER BY ANIMAL_TYPE;