package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.db.dto.HC_M_FoodDto;

/**
 * 共通 Formクラス
 */
public class CmnForm {

    /** 選択された食品ID */
    private String selectedFoodId;
    /** 食品タイプ */
    private String foodType;
    /** 検索ワード */
    private String searchWord;
    /** 検索候補リスト */
    private List<String> sgstWordList;
    /** 食品選択肢リスト */
    private List<HC_M_FoodDto> foodChcList;
    /** おすすめ食品リスト */
    private List<HC_M_FoodDto> recmdFoodList;

    /**
     * 選択された食品ID
     * @return 選択された食品ID
     */
    public String getSelectedFoodId() {
        return selectedFoodId;
    }
    /**
     * 選択された食品ID
     * @param selectedFoodId 選択された食品ID
     */
    public void setSelectedFoodId(String selectedFoodId) {
        this.selectedFoodId = selectedFoodId;
    }
    /**
     * 食品タイプ
     * @return 食品タイプ
     */
    public String getFoodType() {
        return foodType;
    }
    /**
     * 食品タイプ
     * @param foodType 食品タイプ
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    /**
     * 検索ワード
     * @return 検索ワード
     */
    public String getSearchWord() {
        return searchWord;
    }
    /**
     * 検索ワード
     * @param searchWord 検索ワード
     */
    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }
    /**
     * 検索候補リスト
     * @return 検索候補リスト
     */
    public List<String> getSgstWordList() {
        return sgstWordList;
    }
    /**
     * 検索候補リスト
     * @param sgstWordList 検索候補リスト
     */
    public void setSgstWordList(List<String> sgstWordList) {
        this.sgstWordList = sgstWordList;
    }
    /**
     * 食品選択肢リスト
     * @return 食品選択肢リスト
     */
    public List<HC_M_FoodDto> getFoodChcList() {
        return foodChcList;
    }
    /**
     * 食品選択肢リスト
     * @param foodChcList 食品選択肢リスト
     */
    public void setFoodChcList(List<HC_M_FoodDto> foodChcList) {
        this.foodChcList = foodChcList;
    }
    /**
     * おすすめ食品リスト
     * @return おすすめ食品リスト
     */
    public List<HC_M_FoodDto> getRecmdFoodList() {
        return recmdFoodList;
    }
    /**
     * おすすめ食品リスト
     * @param recmdFoodList おすすめ食品リスト
     */
    public void setRecmdFoodList(List<HC_M_FoodDto> recmdFoodList) {
        this.recmdFoodList = recmdFoodList;
    }
}
