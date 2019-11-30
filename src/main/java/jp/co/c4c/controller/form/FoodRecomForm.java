package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.service.entity.FoodEntity;

/**
 * 相方表示 Formクラス
 */
public class FoodRecomForm {

    /** 選択された食品ID */
    private int foodId;
    /** 選択した食品 */
    private FoodEntity selectedFoodEty;
    /** おすすめ食品リスト */
    private List<FoodEntity> recomFoodEtyList;
    /** キャラクター番号 */
    private String characterNum;

    /**
     * 選択された食品ID
     * @return 選択された食品ID
     */
    public int getFoodId() {
        return foodId;
    }
    /**
     * 選択された食品ID
     * @param foodId 選択された食品ID
     */
    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }
    /**
     * 選択した食品
     * @return 選択した食品
     */
    public FoodEntity getSelectedFoodEty() {
        return selectedFoodEty;
    }
    /**
     * 選択した食品
     * @param selectedFoodEty 選択した食品
     */
    public void setSelectedFoodEty(FoodEntity selectedFoodEty) {
        this.selectedFoodEty = selectedFoodEty;
    }
    /**
     * おすすめ食品リスト
     * @return おすすめ食品リスト
     */
    public List<FoodEntity> getRecomFoodEtyList() {
        return recomFoodEtyList;
    }
    /**
     * おすすめ食品リスト
     * @param recomFoodEtyList おすすめ食品リスト
     */
    public void setRecomFoodEtyList(List<FoodEntity> recomFoodEtyList) {
        this.recomFoodEtyList = recomFoodEtyList;
    }
    /**
     * キャラクター番号
     * @return キャラクター番号
     */
    public String getcharacterNum() {
        return characterNum;
    }
    /**
     * キャラクター番号
     * @param characterNum キャラクター番号
     */
    public void setcharacterNum(String characterNum) {
        this.characterNum = characterNum;
    }

}
