package jp.co.c4c.util;

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
}
