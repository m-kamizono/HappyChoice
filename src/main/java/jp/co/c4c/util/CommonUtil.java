package jp.co.c4c.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {

    /**
     * 数値チェック
     * @param num
     * @return　数値：true、数値以外:false
     */
    public boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
            } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 全角カタカナを全角ひらがなへ変換
     * @param s
     * @return
     */
    public String convKataToHira(String s) {
        // 文字列が空の場合、nullを返す
        if (StringUtils.isEmpty(s)) return null;
        
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'ァ' && c <= 'ン') {
                sb.setCharAt(i, (char)(c - 'ァ' + 'ぁ'));
            } else if (c == 'ヵ') {
                sb.setCharAt(i, 'か');
            } else if (c == 'ヶ') {
                sb.setCharAt(i, 'け');
            } else if (c == 'ヴ') {
                sb.setCharAt(i, 'う');
                sb.insert(i + 1, '゛');
                i++;
            }
        }
        return sb.toString();
    }

}
