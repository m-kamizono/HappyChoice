package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.service.entity.FoodEntity;

/**
 * 食品リスト画面 Formクラス
 */
public class FoodListForm {

    /** 食品タイプ */
    private String foodType;
    /** 検索ワード */
    private String searchWord;
    /** 食品選択肢リスト */
    private List<FoodEntity> foodList;

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
     * 食品選択肢リスト
     * @return 食品選択肢リスト
     */
    public List<FoodEntity> getFoodList() {
        return foodList;
    }
    /**
     * 食品選択肢リスト
     * @param foodList 食品選択肢リスト
     */
    public void setFoodList(List<FoodEntity> foodList) {
        this.foodList = foodList;
    }

}
