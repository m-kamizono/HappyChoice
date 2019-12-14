package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.service.entity.FoodNameEntity;

/**
 * TOP画面 Formクラス
 */
public class TopForm {

    /** キャラクター番号 */
    private String characterNum;
    /** 検索候補文言リスト */
    private List<FoodNameEntity> foodNameList;
    /** 検索値結果フラグ */
    private boolean emptyResultFlg;


    /**
     * キャラクター番号
     * @return キャラクター番号
     */
    public String getCharacterNum() {
        return characterNum;
    }
    /**
     * キャラクター番号
     * @param characterNum キャラクター番号
     */
    public void setCharacterNum(String characterNum) {
        this.characterNum = characterNum;
    }

    /**
     * 検索候補文言リスト
     * @return 検索候補文言リスト
     */
    public List<FoodNameEntity> getFoodNameList() {
        return foodNameList;
    }
    /**
     * 検索候補文言リスト
     * @param foodNameList 検索候補文言リスト
     */
    public void setFoodNameList(List<FoodNameEntity> foodNameList) {
        this.foodNameList = foodNameList;
    }
    /**
     * 検索値結果フラグ
     * @return 検索値結果フラグ
     */
    public boolean isEmptyResultFlg() {
        return emptyResultFlg;
    }
    /**
     * 検索値結果フラグ
     * @param emptyResultFlg 検索値結果フラグ
     */
    public void setEmptyResultFlg(boolean emptyResultFlg) {
        this.emptyResultFlg = emptyResultFlg;
    }

}
