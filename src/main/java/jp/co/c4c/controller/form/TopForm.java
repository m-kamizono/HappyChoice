package jp.co.c4c.controller.form;

import java.util.List;

/**
 * TOP画面 Formクラス
 */
public class TopForm {

    /** キャラクター番号 */
    private String characterNum;
    // TODO: 仮の名前 検索候補を表示する文言リスト
    /** 検索候補文言リスト */
    private List<String> suggestWordList;
    /** 検索値結果フラグ */
    private boolean emptyResultFlg;


    /**
     * キャラクター番号
     * @return キャラクター番号
     */
    public String getCharacterNum() {
        return characterNum;
    }
    /**
     * キャラクター番号
     * @param characterNum キャラクター番号
     */
    public void setCharacterNum(String characterNum) {
        this.characterNum = characterNum;
    }

    /**
     * 検索候補文言リスト
     * @return 検索候補文言リスト
     */
    public List<String> getSuggestWordList() {
        return suggestWordList;
    }
    /**
     * 検索候補文言リスト
     * @param suggestWordList 検索候補文言リスト
     */
    public void setSuggestWordList(List<String> suggestWordList) {
        this.suggestWordList = suggestWordList;
    }
    /**
     * 検索値結果フラグ
     * @return 検索値結果フラグ
     */
    public boolean isEmptyResultFlg() {
        return emptyResultFlg;
    }
    /**
     * 検索値結果フラグ
     * @param emptyResultFlg 検索値結果フラグ
     */
    public void setEmptyResultFlg(boolean emptyResultFlg) {
        this.emptyResultFlg = emptyResultFlg;
    }

}
