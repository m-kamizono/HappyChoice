package jp.co.c4c.service.ety;

import org.springframework.web.multipart.MultipartFile;

/**
 * update用 Formクラス
 */

public class FoodForm {

    /** 食品ID */
    private String foodId;
    /** 食品名 */
    private String foodName;
    /** 画像データ */
    private MultipartFile foodImg;

    public String getFoodId() {
        return foodId;
    }
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public MultipartFile getFoodImg() {
        return foodImg;
    }
    public void setFoodImg(MultipartFile foodImg) {
        this.foodImg = foodImg;
    }

}
