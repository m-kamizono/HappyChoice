package jp.co.c4c.controller.form;

import org.springframework.web.multipart.MultipartFile;

/**
 * HappyChoice食品 Formクラス
 */

public class FoodForm {

    /** 食品ID */
    private String foodId;
    /** 食品名 */
    private String foodName;
    /** 食品検索ワード */
    private String searchWords;
    /** 和洋中(10:和食 20:洋食 30:中華) */
    private String wycType;
    /** 主菜フラグ */
    private String maindishFlg;
    /** 食品タイプ(10:ごはん・パン 20:麺 30:肉 40:魚 50:野菜 60:汁物 70:その他) */
    private String foodType;
    /** 炭水化物 */
    private String carbo;
    /** タンパク質 */
    private String prot;
    /** 脂質 */
    private String fat;
    /** ビタミンA */
    private String va;
    /** ビタミンB1 */
    private String vb1;
    /** ビタミンB2 */
    private String vb2;
    /** ビタミンC */
    private String vc;
    /** 鉄 */
    private String fe;
    /** カルシウム */
    private String ca;
    /** 食物繊維 */
    private String fib;
    /** 食塩相当量 */
    private String salt;
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
    public String getSearchWords() {
        return searchWords;
    }
    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }
    public String getWycType() {
        return wycType;
    }
    public void setWycType(String wycType) {
        this.wycType = wycType;
    }
    public String getMaindishFlg() {
        return maindishFlg;
    }
    public void setMaindishFlg(String maindishFlg) {
        this.maindishFlg = maindishFlg;
    }
    public String getFoodType() {
        return foodType;
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public String getCarbo() {
        return carbo;
    }
    public void setCarbo(String carbo) {
        this.carbo = carbo;
    }
    public String getProt() {
        return prot;
    }
    public void setProt(String prot) {
        this.prot = prot;
    }
    public String getFat() {
        return fat;
    }
    public void setFat(String fat) {
        this.fat = fat;
    }
    public String getVa() {
        return va;
    }
    public void setVa(String va) {
        this.va = va;
    }
    public String getVb1() {
        return vb1;
    }
    public void setVb1(String vb1) {
        this.vb1 = vb1;
    }
    public String getVb2() {
        return vb2;
    }
    public void setVb2(String vb2) {
        this.vb2 = vb2;
    }
    public String getVc() {
        return vc;
    }
    public void setVc(String vc) {
        this.vc = vc;
    }
    public String getFe() {
        return fe;
    }
    public void setFe(String fe) {
        this.fe = fe;
    }
    public String getCa() {
        return ca;
    }
    public void setCa(String ca) {
        this.ca = ca;
    }
    public String getFib() {
        return fib;
    }
    public void setFib(String fib) {
        this.fib = fib;
    }
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public MultipartFile getFoodImg() {
        return foodImg;
    }
    public void setFoodImg(MultipartFile foodImg) {
        this.foodImg = foodImg;
    }

}
