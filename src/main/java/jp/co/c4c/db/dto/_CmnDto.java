package jp.co.c4c.db.dto;

/**
 * 共通 DTOクラス
 * @version 18.11.15
 */
public abstract class _CmnDto {

    /** ASC/DESC */
    public enum AscDesc {
        ASC(), Desc(), ;
        AscDesc() { }
    }

    /** テーブル名 */
    public static String TBL = null;
    /** PKフィールド */
    public static String[] PK_FLDs = null;
    /** UKフィールド */
    public static String[] UK_FLDs = null;
    /** 並び順フィールド */
    public static String[] ORDER_FLDs = null;
    /** 並び順ASC/DESC */
    public static AscDesc[] ORDER_ADs = null;

}
