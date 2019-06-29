/* HC_M_FoodDao_selectFoodByCond.sql */
select
  *
from
  hc_m_food
where
  /*IF foodType != 0*/
  FOOD_TYPE = /*foodType*/10 and
  /*END*/
  /*IF searchWord != null*/
  SEARCH_WORDS like concat('%', /*searchWord*/'%ぽてさら%', '%') and
  /*END*/
  0 = 0;
