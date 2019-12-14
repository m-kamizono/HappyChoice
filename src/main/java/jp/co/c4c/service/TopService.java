package jp.co.c4c.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.service.entity.FoodNameEntity;

@Component
public class TopService {

    @Autowired
    private HC_M_FoodDao foodDao;

    /**
     * 食品名かなの一覧取得
     * @param
     * @return
     */
    @Transactional
    public List<FoodNameEntity> getFoodName() {
        return foodDao.selectFoodName().stream().map(foodName -> {
            return new FoodNameEntity(foodName);
        }).collect(Collectors.toList());
    }

}
