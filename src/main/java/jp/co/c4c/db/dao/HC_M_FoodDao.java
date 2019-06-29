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
 * sampleクラス
 *
 */
@Component
public class HC_M_FoodDao {

    @Autowired
    public SqlManager sqlManager;

    public List<HC_M_FoodDto> selectFoodByCond(int foodType, String searchWord) {
        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_selectFoodByCond.sql");
        Map<String, Object> paraMap = new HashMap<>();
        paraMap.put("foodType", foodType);
        paraMap.put("searchWord", searchWord);
        return sqlManager.getResultList(HC_M_FoodDto.class, sqlSrc, paraMap);
    }

}
