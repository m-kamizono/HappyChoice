/* HC_M_FoodDao_updateAllFoodImg.sql */
UPDATE hc_m_food
SET FOOD_IMG =
  (CASE FOOD_ID
   /*$imgCond*/
  END
  ),
   UPDATE_AT = /*updateAt*/'2017/07/21 12:34:56'
WHERE FOOD_ID IN /*foodIdList*/(1,2,3);