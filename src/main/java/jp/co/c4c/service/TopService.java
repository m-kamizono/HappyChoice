package jp.co.c4c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;

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
    public List<String> choiceFoodNameKana() {
        return foodDao.selectFoodNameKana();
    }
}
