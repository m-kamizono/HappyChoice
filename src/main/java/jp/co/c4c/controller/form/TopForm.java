package jp.co.c4c.controller.form;

import java.util.List;

/**
 * TOP画面 Formクラス
 */
public class TopForm {

    /** キャラクターID */
    private String characterId;
    // TODO: 仮の名前 検索候補を表示する文言リスト
    /** 検索候補文言リスト */
    private List<String> suggestWordList;

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

}
