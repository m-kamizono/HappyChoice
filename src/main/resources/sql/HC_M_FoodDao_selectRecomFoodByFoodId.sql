/* HC_M_FoodDao_selectRecomFoodByFoodId.sql */
select
  hc_m_food.*
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
  hc_m_food.CARBO + org.CARBO < 10 and
  hc_m_food.FAT + org.FAT < 10 and
  hc_m_food.VA + org.VA > 5;
