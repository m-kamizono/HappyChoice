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
public class FoodListService {

    @Autowired
    private HC_M_FoodDao foodDao;
    @Autowired
    CommonUtil cmn;

    /**
     * 料理候補取得
     * @param foodType
     * @param searchWord
     * @return
     */
    @Transactional
    public List<FoodEntity> choiceFoodList(String foodType, String searchWord) {
        // searchWordがnullの時にsplitしないようにチェックしてnullじゃなかったら半角・全角空白で区切る
        String[] searchWords = (searchWord == null) ? null : searchWord.split("( |　)+");

        List<HC_M_FoodDto> fooodList = foodDao.selectFoodByCond(foodType, searchWords);

        // List<HC_M_FoodDto>をList<FoodEntity>にして返す
        return fooodList.stream().map(food -> {
            FoodEntity ety = new FoodEntity();
            ety.setFoodId(food.getFoodId());
            ety.setFoodName(food.getFoodName());
            ety.setFoodNameKana(food.getFoodNameKana());
            ety.setFoodImg(cmn.convByteToString(food.getFoodImg()));
            return ety;
        }).collect(Collectors.toList());
    }

}
