package jp.co.c4c.service.entity;

import jp.co.c4c.db.dto.HC_M_FoodDto;

/**
 * 食品名リスト画面 Entityクラス
 */
public class FoodNameEntity {

    /** 食品名 */
    private String foodName;
    /** 食品名かな */
    private String foodNameKana;

    /**
     * 食品名を取得する
     * @return 食品名
     */
	public String getFoodName() {
		return foodName;
	}
    /**
     * 食品名を設定する
     * @param foodName 食品名
     */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
    /**
     * 食品名かなを取得する
     * @return 食品名かな
     */
	public String getFoodNameKana() {
		return foodNameKana;
	}
    /**
     * 食品名かなを設定する
     * @param foodNameKana 食品名かな
     */
	public void setFoodNameKana(String foodNameKana) {
		this.foodNameKana = foodNameKana;
	}

    public FoodNameEntity(HC_M_FoodDto foodDto) {
        this.foodName = foodDto.getFoodName();
        this.foodNameKana = foodDto.getFoodNameKana();
    }

}
