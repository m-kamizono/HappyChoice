/* HC_M_FoodDao_selectRecomFoodListByFoodId.sql */
select
  hc_m_food.*
from
  hc_m_food
  , (
    select
      *
    from
      hc_m_food
    where
      FOOD_ID = /*foodId*/1
  ) org
where
  hc_m_food.MAINDISH_FLG = ABS(org.MAINDISH_FLG - 1) and
  hc_m_food.CARBO + org.CARBO < 14 and
  hc_m_food.FAT + org.FAT < 15 and
  hc_m_food.PROT + org.PROT > 3 and
  hc_m_food.VA + org.VA > 4 and
  hc_m_food.VB1 + org.VB1 > 4 and
  hc_m_food.VB2 + org.VB2 > 4 and
  hc_m_food.VC + org.VC > 3 and
  hc_m_food.FE + org.FE > 4 and
  hc_m_food.CA + org.CA > 2 and
  hc_m_food.FIB + org.FIB > 3
order by
  hc_m_food.FOOD_NAME_KANA asc
