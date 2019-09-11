package jp.co.c4c.util;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
     * byte[]の画像データをStringに変換
     * @param data
     * @return img
     */
    @Transactional
    public String convByteToString(byte[] data) {
        if (data == null) { return null; }

        // TODO: DBに保存されたデータで画像表示されるか確かめる
        String dataString = new String(data);
        return dataString;
    }

}
