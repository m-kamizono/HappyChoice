/* HC_M_FoodDao_selectFoodByCond.sql */
select
  *
from
  hc_m_food
where
  /*IF foodType != null*/
  FOOD_TYPE like concat('%[', /*foodType*/'10', ']%') and
  /*END*/
  /*IF searchWordCond != null*/
  /*$searchWordCond*/
  /*END*/
  0 = 0;
