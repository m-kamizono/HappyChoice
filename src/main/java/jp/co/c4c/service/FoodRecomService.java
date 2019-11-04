package jp.co.c4c.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.db.dto.HC_M_FoodDto;
import jp.co.c4c.service.entity.FoodEntity;
import jp.co.c4c.util.CommonUtil;

@Component
public class FoodRecomService {

    @Autowired
    private HC_M_FoodDao foodDao;
    @Autowired
    CommonUtil cmn;

    /**
     * 選択料理取得
     * @param foodId
     * @return
     */
    @Transactional
    public FoodEntity choiceSelectedFoodEty(String foodId) {
        return new FoodEntity(foodDao.selectFoodByFoodId(foodId));
    }

    /**
     * おすすめ料理取得
     * @param foodId
     * @return
     */
    @Transactional
    public List<FoodEntity> choiceRecomFoodEtyList(String foodId) {

        List<HC_M_FoodDto> recomFoodList = foodDao.selectRecomFoodByFoodId(foodId);

        return recomFoodList.stream().map(recomFood -> {
            return new FoodEntity(recomFood);
        }).collect(Collectors.toList());
    }
}
