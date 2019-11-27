package jp.co.c4c.db.dto;

import java.util.Date;

/**
 * HappyChoice食品 Dtoクラス
 */

public class HC_M_FoodDto {

    public static final String TBL = "HC_M_Food";

    /** 食品ID */
    private int foodId;
    /** 食品名 */
    private String foodName;
    /** 食品名かな */
    private String foodNameKana;
    /** 食品検索ワード */
    private String searchWords;
    /** 和洋中(10:和食 20:洋食 30:中華) */
    private int wycType;
    /** 主菜フラグ */
    private int maindishFlg;
    /** 食品タイプ(10:ごはん・パン 20:麺 30:肉 40:魚 50:野菜 60:汁物 70:その他) */
    private String foodType;
    /** 炭水化物 */
    private int carbo;
    /** タンパク質 */
    private int prot;
    /** 脂質 */
    private int fat;
    /** ビタミンA */
    private int va;
    /** ビタミンB1 */
    private int vb1;
    /** ビタミンB2 */
    private int vb2;
    /** ビタミンC */
    private int vc;
    /** 鉄 */
    private int fe;
    /** カルシウム */
    private int ca;
    /** 食物繊維 */
    private int fib;
    /** 食塩相当量 */
    private int salt;
    /** 画像データ */
    private byte[] foodImg;
    /** 削除フラグ */
    private int delFlg;
    /** データ作成日時 */
    private Date createAt;
    /** データ更新日時 */
    private Date updateAt;

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
     * @param foodName 食品名かな
     */
    public void setFoodNameKana(String foodNameKana) {
        this.foodNameKana = foodNameKana;
    }
    /**
     * 食品検索ワードを取得する
     * @return 食品検索ワード
     */
    public String getSearchWords() {
        return searchWords;
    }
    /**
     * 食品検索ワードを設定する
     * @param searchWords 食品検索ワード
     */
    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }
    /**
     * 和洋中(10:和食 20:洋食 30:中華)を取得する
     * @return 和洋中(10:和食 20:洋食 30:中華)
     */
    public int getWycType() {
        return wycType;
    }
    /**
     * 和洋中(10:和食 20:洋食 30:中華)を設定する
     * @param wycType 和洋中(10:和食 20:洋食 30:中華)
     */
    public void setWycType(int wycType) {
        this.wycType = wycType;
    }
    /**
     * 主菜フラグを取得する
     * @return 主菜フラグ
     */
    public int getMaindishFlg() {
        return maindishFlg;
    }
    /**
     * 主菜フラグを設定する
     * @param maindishFlg 主菜フラグ
     */
    public void setMaindishFlg(int maindishFlg) {
        this.maindishFlg = maindishFlg;
    }
    /**
     * 食品タイプ(10:ごはん・パン 20:麺 30:肉 40:魚 50:野菜 60:汁物 70:その他)を取得する
     * @return 食品タイプ(10:ごはん・パン 20:麺 30:肉 40:魚 50:野菜 60:汁物 70:その他)
     */
    public String getFoodType() {
        return foodType;
    }
    /**
     * 食品タイプ(10:ごはん・パン 20:麺 30:肉 40:魚 50:野菜 60:汁物 70:その他)を設定する
     * @param foodType 食品タイプ(10:ごはん・パン 20:麺 30:肉 40:魚 50:野菜 60:汁物 70:その他)
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    /**
     * 炭水化物を取得する
     * @return 炭水化物
     */
    public int getCarbo() {
        return carbo;
    }
    /**
     * 炭水化物を設定する
     * @param carbo 炭水化物
     */
    public void setCarbo(int carbo) {
        this.carbo = carbo;
    }
    /**
     * タンパク質を取得する
     * @return タンパク質
     */
    public int getProt() {
        return prot;
    }
    /**
     * タンパク質を設定する
     * @param prot タンパク質
     */
    public void setProt(int prot) {
        this.prot = prot;
    }
    /**
     * 脂質を取得する
     * @return 脂質
     */
    public int getFat() {
        return fat;
    }
    /**
     * 脂質を設定する
     * @param fat 脂質
     */
    public void setFat(int fat) {
        this.fat = fat;
    }
    /**
     * ビタミンAを取得する
     * @return ビタミンA
     */
    public int getVa() {
        return va;
    }
    /**
     * ビタミンAを設定する
     * @param va ビタミンA
     */
    public void setVa(int va) {
        this.va = va;
    }
    /**
     * ビタミンB1を取得する
     * @return ビタミンB1
     */
    public int getVb1() {
        return vb1;
    }
    /**
     * ビタミンB1を設定する
     * @param vb1 ビタミンB1
     */
    public void setVb1(int vb1) {
        this.vb1 = vb1;
    }
    /**
     * ビタミンB2を取得する
     * @return ビタミンB2
     */
    public int getVb2() {
        return vb2;
    }
    /**
     * ビタミンB2を設定する
     * @param vb2 ビタミンB2
     */
    public void setVb2(int vb2) {
        this.vb2 = vb2;
    }
    /**
     * ビタミンCを取得する
     * @return ビタミンC
     */
    public int getVc() {
        return vc;
    }
    /**
     * ビタミンCを設定する
     * @param vc ビタミンC
     */
    public void setVc(int vc) {
        this.vc = vc;
    }
    /**
     * 鉄を取得する
     * @return 鉄
     */
    public int getFe() {
        return fe;
    }
    /**
     * 鉄を設定する
     * @param fe 鉄
     */
    public void setFe(int fe) {
        this.fe = fe;
    }
    /**
     * カルシウムを取得する
     * @return カルシウム
     */
    public int getCa() {
        return ca;
    }
    /**
     * カルシウムを設定する
     * @param ca カルシウム
     */
    public void setCa(int ca) {
        this.ca = ca;
    }
    /**
     * 食物繊維を取得する
     * @return 食物繊維
     */
    public int getFib() {
        return fib;
    }
    /**
     * 食物繊維を設定する
     * @param fib 食物繊維
     */
    public void setFib(int fib) {
        this.fib = fib;
    }
    /**
     * 食塩相当量を取得する
     * @return 食塩相当量
     */
    public int getSalt() {
        return salt;
    }
    /**
     * 食塩相当量を設定する
     * @param salt 食塩相当量
     */
    public void setSalt(int salt) {
        this.salt = salt;
    }
    /**
     * 画像データを取得する
     * @return 画像データ
     */
    public byte[] getFoodImg() {
        return foodImg;
    }
    /**
     * 画像データを設定する
     * @param imgData 画像データ
     */
    public void setFoodImg(byte[] foodImg) {
        this.foodImg = foodImg;
    }
    /**
     * 削除フラグを取得する
     * @return 削除フラグ
     */
    public int getDelFlg() {
        return delFlg;
    }
    /**
     * 削除フラグを設定する
     * @param delFlg 削除フラグ
     */
    public void setDelFlg(int delFlg) {
        this.delFlg = delFlg;
    }
    /**
     * データ作成日時を取得する
     * @return データ作成日時
     */
    public Date getCreateAt() {
        return createAt;
    }
    /**
     * データ作成日時を設定する
     * @param createAt データ作成日時
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    /**
     * データ更新日時を取得する
     * @return データ更新日時
     */
    public Date getUpdateAt() {
        return updateAt;
    }
    /**
     * データ更新日時を設定する
     * @param updateAt データ更新日時
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

}
