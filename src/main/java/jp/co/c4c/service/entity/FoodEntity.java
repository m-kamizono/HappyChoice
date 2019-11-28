package jp.co.c4c.service.entity;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

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
    /** 不足栄養メッセージ */
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
     * 不足栄養メッセージを取得する
     * @return 不足栄養メッセージ
     */
    public String getLessNutMsg() {
        return lessNutMsg;
    }
    /**
     * 不足栄養メッセージを設定する
     * @param lessNutMsg 不足栄養メッセージ
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

    public FoodEntity(HC_M_FoodDto foodDto, boolean lessNutFlg) {
        this.foodId = foodDto.getFoodId();
        this.foodName = foodDto.getFoodName();
        this.foodNameKana = foodDto.getFoodNameKana();
        if (foodDto.getFoodImg() != null) {
            this.foodImg = Base64.getEncoder().encodeToString(foodDto.getFoodImg());
        }
        // 不足栄養素メッセージを設定する処理
        if (lessNutFlg) {
            Map<String, Integer> nutMap = new TreeMap<String, Integer>();
            nutMap.put("炭水化物", foodDto.getCarbo());
            nutMap.put("タンパク質", foodDto.getProt());
            nutMap.put("脂質", foodDto.getFat());
            nutMap.put("ビタミンA", foodDto.getVa());
            nutMap.put("ビタミンB1", foodDto.getVb1());
            nutMap.put("ビタミンB2", foodDto.getVb2());
            nutMap.put("ビタミンC", foodDto.getVc());
            nutMap.put("鉄", foodDto.getFe());
            nutMap.put("カルシウム", foodDto.getCa());
            nutMap.put("食物繊維", foodDto.getFib());
            nutMap.put("食塩相当量", foodDto.getSalt());

            // 比較関数Comparatorを使用してMap.Entryの値を比較し、降順でのソート
            List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(nutMap.entrySet());
            Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
                public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                    return obj1.getValue().compareTo(obj2.getValue());
                }
            });

            // 文字列作成
            String nutStr = "";
            int preNut = 0;
            for(Entry<String, Integer> entry : list_entries) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                if (StringUtils.isEmpty(nutStr)) {
                    nutStr += entry.getKey();
                    preNut = entry.getValue();
                    continue;
                }
                // 前の栄養素の値と今回の栄養素の値が違う場合、ループを抜ける
                if (preNut != entry.getValue()) break;
                // 前の栄養素の値と今回の栄養素の値が同じ場合、栄養素名を入れる
                nutStr = nutStr + "と" + entry.getKey();
                preNut = entry.getValue();
            }
            this.lessNutMsg = "不足している" + nutStr + "を補う食品を食べよう！";
        }
    }
}
