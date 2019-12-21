package jp.co.c4c.service.entity;

import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

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
    /** 不足栄養素名 */
    private String[] lessNutNames;

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
     * 不足栄養素名を取得する
     * @return 不足栄養素名
     */
    public String[] getLessNutNames() {
        return lessNutNames;
    }
    /**
     * 不足栄養素名を設定する
     * @param lessNutNames 不足栄養素名
     */
    public void setLessNutNames(String[] lessNutNames) {
        this.lessNutNames = lessNutNames;
    }

    public FoodEntity() {
        this.foodId = 0;
        this.foodName = null;
        this.foodNameKana = null;
        this.foodImg = null;
        this.lessNutNames = null;
    }

    public FoodEntity(HC_M_FoodDto foodDto, boolean lessNutFlg) {
        this.foodId = foodDto.getFoodId();
        this.foodName = foodDto.getFoodName();
        this.foodNameKana = foodDto.getFoodNameKana();
        if (foodDto.getFoodImg() != null) {
            this.foodImg = Base64.getEncoder().encodeToString(foodDto.getFoodImg());
        }

        // 不足栄養素名を設定する処理
        if (lessNutFlg) {
            Map<String, Integer> nutMap = new LinkedHashMap<String, Integer>();
            nutMap.put("たんぱく質", foodDto.getProt());
            nutMap.put("ビタミンA", foodDto.getVa());
            nutMap.put("ビタミンB1", foodDto.getVb1());
            nutMap.put("ビタミンB2", foodDto.getVb2());
            nutMap.put("ビタミンC", foodDto.getVc());
            nutMap.put("鉄", foodDto.getFe());
            nutMap.put("カルシウム", foodDto.getCa());
            nutMap.put("食物繊維", foodDto.getFib());
            nutMap.put("食塩相当量", foodDto.getSalt());

            int minNutNum = Collections.min(nutMap.values());
            this.lessNutNames = nutMap
                    .entrySet()
                    .stream()
                    .filter( entry -> minNutNum == entry.getValue() )
                    .map( lessNut -> lessNut.getKey() )
                    .toArray( s -> new String[s]);
        }
    }

}
