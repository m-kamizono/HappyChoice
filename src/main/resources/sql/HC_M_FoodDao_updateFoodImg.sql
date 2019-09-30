/* HC_M_FoodDao_updateFoodImg.sql */
update
  hc_m_food
set
  FOOD_IMG = /*file*/'....'
  , UPDATE_AT = /*updateAt*/'2017/07/21 12:34:56'
where
  FOOD_ID = /*foodId*/1;