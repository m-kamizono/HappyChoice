package jp.co.c4c.service.entity;

import java.util.Base64;

import jp.co.c4c.db.dto.HC_M_FoodDto;

/**
 * 食品リスト画面 Entityクラス
 */
public class FoodEntity {

    /** 食品ID */
    private int foodId;
    /** 食品名 */
    private String foodName;
    /** 食品名かな */
    private String foodNameKana;
    /** 画像データ */
    private String foodImg;
    /** 画像データ */
    private String lessNutMsg;

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
    /**
     * 不足栄養素を取得する
     * @return 不足栄養素
     */
    public String getLessNutMsg() {
        return lessNutMsg;
    }
    /**
     * 不足栄養素を設定する
     * @param foodImg 不足栄養素
     */
    public void setLessNutMsg(String lessNutMsg) {
        this.lessNutMsg = lessNutMsg;
    }

    public FoodEntity() {
        this.foodId = 0;
        this.foodName = null;
        this.foodNameKana = null;
        this.foodImg = null;
        this.lessNutMsg = null;
    }

    public FoodEntity(HC_M_FoodDto foodDto) {
        this.foodId = foodDto.getFoodId();
        this.foodName = foodDto.getFoodName();
        this.foodNameKana = foodDto.getFoodNameKana();
        if (foodDto.getFoodImg() != null) {
            this.foodImg = Base64.getEncoder().encodeToString(foodDto.getFoodImg());
        }
        // TODO: 不足栄養素メッセージを設定する処理
        this.lessNutMsg = "カルシウムと鉄分が足りないよ";
    }
}
