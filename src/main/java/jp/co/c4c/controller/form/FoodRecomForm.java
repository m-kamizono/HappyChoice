package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.service.entity.FoodEntity;

/**
 * 相方表示 Formクラス
 */
public class FoodRecomForm {

    /** 選択された食品ID */
    private String foodId;
    /** 選択した食品 */
    private FoodEntity selectedFoodEty;
    /** おすすめ食品リスト */
    private List<FoodEntity> recomFoodEtyList;
    /** キャラクターID */
    private String characterId;

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
     * キャラクターID
     * @return キャラクターID
     */
    public String getCharacterId() {
        return characterId;
    }
    /**
     * キャラクターID
     * @param characterId キャラクターID
     */
    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

}
