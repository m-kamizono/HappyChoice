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
  hc_m_food.CARBO + org.CARBO <= 15 and
  hc_m_food.FAT + org.FAT <= 15 and
  hc_m_food.PROT + org.PROT >= 5 and
  hc_m_food.VA + org.VA >= 5 and
  hc_m_food.VB1 + org.VB1 >= 5 and
  hc_m_food.VB2 + org.VB2 >= 5 and
  hc_m_food.VC + org.VC >= 5 and
  hc_m_food.FE + org.FE >= 5 and
  hc_m_food.CA + org.CA >= 5 and
  hc_m_food.FIB + org.FIB >= 5
order by
  (
    hc_m_food.CARBO
    + hc_m_food.FAT
    + hc_m_food.PROT
    + hc_m_food.VA
    + hc_m_food.VB1
    + hc_m_food.VB2
    + hc_m_food.VC
    + hc_m_food.FE
    + hc_m_food.CA
  ) desc
  , hc_m_food.FOOD_NAME_KANA asc
