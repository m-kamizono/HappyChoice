package jp.co.c4c.controller.form;

import java.util.List;

/**
 * TOP画面 Formクラス
 */
public class TopForm {

    // TODO: 仮の名前 検索候補を表示する文言リスト
    /** 検索候補文言リスト */
    private List<String> suggestWordList;

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
