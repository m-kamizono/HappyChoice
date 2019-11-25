package jp.co.c4c.controller.form;

import java.util.List;

/**
 * TOP画面 Formクラス
 */
public class TopForm {

    /** キャラクターID */
    private String characterId;
    /** 検索候補文言リスト */
    private List<String> suggestWordList;
    /** 検索値結果フラグ */
    private boolean emptyResultFlg;


    /**
     * キャラクターID
     * @return キャラクターID
     */
    public String getCharacterId() {
        return characterId;
    }
    /**
     * キャラクターID
     * @param characterId キャラクターID
     */
    public void setCharacterId(String characterId) {
        this.characterId = characterId;
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
