package jp.co.c4c.util;

import java.util.Base64;

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

        // 画像ファイルをBase64 String に変換する
        String dataString = Base64.getEncoder().encodeToString(data);
        return dataString;
    }

}
