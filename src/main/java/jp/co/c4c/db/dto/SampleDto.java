package jp.co.c4c.db.dto;

/**
 * Sample Dtoクラス
 *
 */
public class SampleDto extends _CmnDto {

	public static final String TBL = "sample";

    public SampleDto() {
        _CmnDto.TBL = TBL;
        _CmnDto.PK_FLDs = PK_FLDs;
        _CmnDto.UK_FLDs = UK_FLDs;
        _CmnDto.ORDER_FLDs = ORDER_FLDs;
        _CmnDto.ORDER_ADs = ORDER_ADs;
    }

    /** ID */
    private int id;
	/** 名前 */
    private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
