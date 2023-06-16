-- 코드를 입력하세요
  WITH TBL_COUNT
    AS (SELECT NAME
             , COUNT(NAME)  AS "COUNT"
          FROM ANIMAL_INS
         GROUP BY NAME
       )
SELECT NAME
     , COUNT
  FROM TBL_COUNT
 WHERE COUNT > 1
 ORDER BY NAME

-- [다른풀이]
-- SELECT NAME
--      , COUNT(*) AS "COUNT"
--   FROM ANIMAL_INS
--  GROUP BY NAME
-- HAVING COUNT(NAME) > 1
-- ORDER BY NAME;