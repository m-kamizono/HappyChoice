/* HC_M_FoodDao_selectRecomFoodByFoodId.sql */
select
  *
from
 hc_m_food,
 (
    select
      *
    from
      hc_m_food
    where
      FOOD_ID = /*foodId*/1
 ) org
 where
  /*IF org.FOOD_ID == 0*/
  hc_m_food.MAINDISH_FLG = 1 and
  /*END*/
  /*IF org.FOOD_ID == 1*/
  hc_m_food.MAINDISH_FLG = 0 and
  /*END*/
  hc_m_food.CARBO + org.CARBO < 10 and
  hc_m_food.FAT + org.FAT < 10 and
  hc_m_food.VA + org.VA > 5;
