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
import jp.sf.amateras.mirage.StringSqlResource;

/**
 * HC_M_FoodDaoクラス
 *
 */
@Component
public class HC_M_FoodDao {

    @Autowired
    public SqlManager sqlManager;

    public HC_M_FoodDto selectFoodByFoodId(int foodId) {

        final SqlResource sqlSrc = new StringSqlResource("select * from "+HC_M_FoodDto.TBL+" where FOOD_ID=/*foodId*/;");
        Map<String, Object> param = new HashMap<>();
        {
            param.put("foodId", foodId);
        }
        return sqlManager.getSingleResult(HC_M_FoodDto.class, sqlSrc, param);
    }

    public List<HC_M_FoodDto> selectFoodListByCond(String foodType, String[] searchWords) {

        StringBuffer searchWordCond = new StringBuffer();
        if (searchWords != null) {
            final String template = "SEARCH_WORDS collate utf8_unicode_ci like concat('%[', '#DATA#', ']%') and" + "\n" + "";
            for (String searchWord : searchWords) {
                searchWordCond.append(template.replace("#DATA#", searchWord+""));
            }
        }

        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_selectFoodListByCond.sql");
        Map<String, Object> param = new HashMap<>();
        {
            param.put("foodType", foodType);
            param.put("searchWordCond", searchWordCond.toString());
        }
        return sqlManager.getResultList(HC_M_FoodDto.class, sqlSrc, param);
    }

    public List<HC_M_FoodDto> selectRecomFoodListByFoodId(int foodId) {

        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_selectRecomFoodListByFoodId.sql");
        Map<String, Object> param = new HashMap<>();
        {
            param.put("foodId", foodId);
        }
        return sqlManager.getResultList(HC_M_FoodDto.class, sqlSrc, param);
    }

    public List<HC_M_FoodDto> selectFoodName() {
        final SqlResource sqlSrc = new StringSqlResource("select FOOD_NAME, FOOD_NAME_KANA from "+HC_M_FoodDto.TBL+ ";");
        return sqlManager.getResultList(HC_M_FoodDto.class, sqlSrc);
    }

}
