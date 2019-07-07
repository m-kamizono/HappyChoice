package jp.co.c4c.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.db.dto.HC_M_FoodDto;

@Component
public class FoodListService {

    @Autowired
    private HC_M_FoodDao foodDao;

    /**
     * 料理候補取得
     * @param foodTyle
     * @param searchWord
     * @return
     */
    @Transactional
    public List<HC_M_FoodDto> choiceFoodList(int foodTyle, String searchWord) {
        return foodDao.selectFoodByFoodType(foodTyle, this.zenkakuHiraganaToZenkakuKatakana(searchWord));
    }

    /**
     * 全角ひらがなを全角カタカナへ変換
     * @param s
     * @return
     */
    private String zenkakuHiraganaToZenkakuKatakana(String s) {
    	// 文字列が空の場合、nullを返す
    	if (StringUtils.isEmpty(s)) return null;

        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'ぁ' && c <= 'ん') {
                sb.setCharAt(i, (char)(c - 'ぁ' + 'ァ'));
            }
        }
        return sb.toString();
    }

}
