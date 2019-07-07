package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.db.dto.HC_M_FoodDto;

/**
 * ハッピーチョイス Formクラス
 */
public class HappyChoiceForm {

    /** 選択された食品ID */
    private String foodId;
    /** おすすめ食品リスト */
    private List<HC_M_FoodDto> foodList;
    /** 不足栄養メッセージ */
    private String lessNutMsg;

    /**
     * 選択された食品ID
     * @return 選択された食品ID
     */
    public String getFoodId() {
        return foodId;
    }
    /**
     * 選択された食品ID
     * @param foodId 選択された食品ID
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    /**
     * おすすめ食品リスト
     * @return おすすめ食品リスト
     */
    public List<HC_M_FoodDto> getFoodList() {
        return foodList;
    }
    /**
     * おすすめ食品リスト
     * @param foodList おすすめ食品リスト
     */
    public void setFoodList(List<HC_M_FoodDto> foodList) {
        this.foodList = foodList;
    }
    /**
     * 不足栄養メッセージ
     * @return 不足栄養メッセージ
     */
    public String getLessNutMsg() {
        return lessNutMsg;
    }
    /**
     * 不足栄養メッセージ
     * @param lessNutMsg 不足栄養メッセージ
     */
    public void setLessNutMsg(String lessNutMsg) {
        this.lessNutMsg = lessNutMsg;
    }

}
