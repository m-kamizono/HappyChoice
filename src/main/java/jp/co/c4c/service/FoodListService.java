package jp.co.c4c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.db.dto.HC_M_FoodDto;
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
    public List<HC_M_FoodDto> choiceFoodList(int foodType, String searchWord) {
        return foodDao.selectFoodByCond(foodType, cmn.convKataToHira(searchWord));
    }

}
