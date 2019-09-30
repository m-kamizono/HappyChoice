package jp.co.c4c.controller.form;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jp.co.c4c.service.entity.FoodEntity;

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
    private MultipartFile foodImgFile;
    /** 一括更新用画像データ */
    List<MultipartFile> foodImgList;

    /** 食品一覧 */
    private List<FoodEntity> foodList;

    /**
     * @return foodId
     */
    public String getFoodId() {
        return foodId;
    }

    /**
     * @param foodId セットする foodId
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    /**
     * @return foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName セットする foodName
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return searchWords
     */
    public String getSearchWords() {
        return searchWords;
    }

    /**
     * @param searchWords セットする searchWords
     */
    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }

    /**
     * @return wycType
     */
    public String getWycType() {
        return wycType;
    }

    /**
     * @param wycType セットする wycType
     */
    public void setWycType(String wycType) {
        this.wycType = wycType;
    }

    /**
     * @return maindishFlg
     */
    public String getMaindishFlg() {
        return maindishFlg;
    }

    /**
     * @param maindishFlg セットする maindishFlg
     */
    public void setMaindishFlg(String maindishFlg) {
        this.maindishFlg = maindishFlg;
    }

    /**
     * @return foodType
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * @param foodType セットする foodType
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    /**
     * @return carbo
     */
    public String getCarbo() {
        return carbo;
    }

    /**
     * @param carbo セットする carbo
     */
    public void setCarbo(String carbo) {
        this.carbo = carbo;
    }

    /**
     * @return prot
     */
    public String getProt() {
        return prot;
    }

    /**
     * @param prot セットする prot
     */
    public void setProt(String prot) {
        this.prot = prot;
    }

    /**
     * @return fat
     */
    public String getFat() {
        return fat;
    }

    /**
     * @param fat セットする fat
     */
    public void setFat(String fat) {
        this.fat = fat;
    }

    /**
     * @return va
     */
    public String getVa() {
        return va;
    }

    /**
     * @param va セットする va
     */
    public void setVa(String va) {
        this.va = va;
    }

    /**
     * @return vb1
     */
    public String getVb1() {
        return vb1;
    }

    /**
     * @param vb1 セットする vb1
     */
    public void setVb1(String vb1) {
        this.vb1 = vb1;
    }

    /**
     * @return vb2
     */
    public String getVb2() {
        return vb2;
    }

    /**
     * @param vb2 セットする vb2
     */
    public void setVb2(String vb2) {
        this.vb2 = vb2;
    }

    /**
     * @return vc
     */
    public String getVc() {
        return vc;
    }

    /**
     * @param vc セットする vc
     */
    public void setVc(String vc) {
        this.vc = vc;
    }

    /**
     * @return fe
     */
    public String getFe() {
        return fe;
    }

    /**
     * @param fe セットする fe
     */
    public void setFe(String fe) {
        this.fe = fe;
    }

    /**
     * @return ca
     */
    public String getCa() {
        return ca;
    }

    /**
     * @param ca セットする ca
     */
    public void setCa(String ca) {
        this.ca = ca;
    }

    /**
     * @return fib
     */
    public String getFib() {
        return fib;
    }

    /**
     * @param fib セットする fib
     */
    public void setFib(String fib) {
        this.fib = fib;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt セットする salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return foodImgFile
     */
    public MultipartFile getFoodImgFile() {
        return foodImgFile;
    }

    /**
     * @param foodImgFile セットする foodImgFile
     */
    public void setFoodImgFile(MultipartFile foodImgFile) {
        this.foodImgFile = foodImgFile;
    }

    /**
     * @return foodImgList
     */
    public List<MultipartFile> getFoodImgList() {
        return foodImgList;
    }

    /**
     * @param foodImgList セットする foodImgList
     */
    public void setFoodImgList(List<MultipartFile> foodImgList) {
        this.foodImgList = foodImgList;
    }

    /**
     * @return foodList
     */
    public List<FoodEntity> getFoodList() {
        return foodList;
    }

    /**
     * @param foodList セットする foodList
     */
    public void setFoodList(List<FoodEntity> foodList) {
        this.foodList = foodList;
    }

}
