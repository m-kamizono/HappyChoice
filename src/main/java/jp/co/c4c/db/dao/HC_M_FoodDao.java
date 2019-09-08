package jp.co.c4c.db.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.c4c.db.dto.HC_M_FoodDto;
import jp.sf.amateras.mirage.ClasspathSqlResource;
import jp.sf.amateras.mirage.SqlManager;
import jp.sf.amateras.mirage.SqlResource;

/**
 * HC_M_FoodDaoクラス
 *
 */
@Component
public class HC_M_FoodDao {

    @Autowired
    public SqlManager sqlManager;

    public List<HC_M_FoodDto> selectFoodByCond(String foodType, String[] searchWords) {
        final String template = "SEARCH_WORDS collate utf8_unicode_ci like concat('%[', '#DATA#', ']%') and" + "\n" + "";
        StringBuffer searchWordCond = new StringBuffer();
        if (searchWords != null) {
            for (String searchWord : searchWords) {
                searchWordCond.append(template.replace("#DATA#", searchWord+""));
            }
        }

        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_selectFoodByCond.sql");
        Map<String, Object> param = new HashMap<>();
        {
            param.put("foodType", foodType);
            param.put("searchWordCond", searchWordCond.toString());
        }
        return sqlManager.getResultList(HC_M_FoodDto.class, sqlSrc, param);
    }

}
