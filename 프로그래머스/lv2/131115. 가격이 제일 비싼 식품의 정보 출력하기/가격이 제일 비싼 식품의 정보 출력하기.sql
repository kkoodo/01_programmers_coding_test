-- 코드를 입력하세요
--   WITH TBL_ROWNUMBER
--     AS (SELECT PRODUCT_ID
--              , PRODUCT_NAME
--              , PRODUCT_CD
--              , CATEGORY
--              , PRICE
--           FROM FOOD_PRODUCT
--          ORDER BY PRICE DESC
--        )
-- SELECT *
--   FROM TBL_ROWNUMBER
--  WHERE ROWNUM = 1;
 
 
-- SELECT *
-- FROM FOOD_PRODUCT
-- WHERE PRICE IN (SELECT MAX(PRICE)
--                FROM FOOD_PRODUCT)
               
-- [다른풀이]
SELECT *
  FROM FOOD_PRODUCT
 ORDER BY PRICE DESC
 FETCH FIRST 1 ROW ONLY;
