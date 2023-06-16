-- 코드를 입력하세요
  WITH TBL_ROWNUMBER
    AS (SELECT PRODUCT_ID
             , PRODUCT_NAME
             , PRODUCT_CD
             , CATEGORY
             , PRICE
          FROM FOOD_PRODUCT
         ORDER BY PRICE DESC
       )
SELECT *
  FROM TBL_ROWNUMBER
 WHERE ROWNUM = 1;