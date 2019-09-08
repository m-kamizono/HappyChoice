package jp.co.c4c.service.entity;

/**
 * 食品リスト画面 Entityクラス
 */
public class FoodEntity {

    /** 選択された食品ID */
    private int foodId;
    /** 食品名 */
    private String foodName;
    /** 食品名かな */
    private String foodNameKana;
    /** 画像データ */
    private String foodImg;

    /**
     * 食品IDを取得する
     * @return 食品ID
     */
	public int getFoodId() {
		return foodId;
	}
    /**
     * 食品IDを設定する
     * @param foodId 食品ID
     */
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
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
    /**
     * 画像データを取得する
     * @return 画像データ
     */
    public String getFoodImg() {
        return foodImg;
    }
    /**
     * 画像データを設定する
     * @param foodImg 画像データ
     */
    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }
}
