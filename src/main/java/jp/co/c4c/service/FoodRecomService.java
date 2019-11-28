package jp.co.c4c.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.service.entity.FoodEntity;

@Component
public class FoodRecomService {

    @Autowired
    private HC_M_FoodDao foodDao;

    /**
     * 選択料理取得
     * @param foodId
     * @return
     */
    @Transactional
    public FoodEntity choiceSelectedFoodEty(String foodId) {
        return new FoodEntity(foodDao.selectFoodByFoodId(foodId), true);
    }

    /**
     * おすすめ料理取得
     * @param foodId
     * @return
     */
    @Transactional
    public List<FoodEntity> choiceRecomFoodEtyList(String foodId) {
        return foodDao.selectRecomFoodByFoodId(foodId).stream().map(recomFood -> {
            return new FoodEntity(recomFood, false);
        }).collect(Collectors.toList());
    }
}
