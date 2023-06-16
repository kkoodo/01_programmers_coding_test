-- 코드를 입력하세요
-- SELECT TO_CHAR(DATETIME, 'FMHH24')        AS "HOUR"
--      , COUNT(TO_CHAR(DATETIME, 'FMHH24')) AS "COUNT"
--   FROM ANIMAL_OUTS
--  GROUP BY TO_CHAR(DATETIME, 'FMHH24')
-- HAVING TO_NUMBER(TO_CHAR(DATETIME, 'FMHH24')) BETWEEN 9 AND 19
--  ORDER BY TO_NUMBER(TO_CHAR(DATETIME, 'FMHH24'));

-- [다른풀이]
-- SELECT EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP))   AS "HOUR"
--      , COUNT(ANIMAL_ID) AS "COUNT"
--   FROM ANIMAL_OUTS
--  GROUP BY EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP))
-- HAVING EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) BETWEEN 9 AND 19
--  ORDER BY HOUR;

-- [다른풀이]
SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS "HOUR"
     , COUNT(ANIMAL_ID)                     AS "COUNT"
  FROM ANIMAL_OUTS
 WHERE TO_CHAR(DATETIME, 'HH24') BETWEEN '09' AND '19'
 GROUP BY TO_CHAR(DATETIME, 'HH24')
 ORDER BY HOUR;