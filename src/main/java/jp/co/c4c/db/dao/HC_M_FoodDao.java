package jp.co.c4c.db.dao;

import java.util.Calendar;
import java.util.Date;
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

    public List<HC_M_FoodDto> selectFoodByCond(String foodType, String[] searchWords) {
        StringBuffer searchWordCond = new StringBuffer();
        if (searchWords != null) {
            final String template = "SEARCH_WORDS collate utf8_unicode_ci like concat('%[', '#DATA#', ']%') and" + "\n" + "";
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

    public int insert (HC_M_FoodDto dto) {
        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_insert.sql");
        Map<String, Object> param = new HashMap<>();
        {
            param.put("dto", dto);
        }
        return sqlManager.executeUpdate(sqlSrc, param);
    }

    public List<HC_M_FoodDto> selectAll() {
        String sql = "select * from hc_m_food where DEL_FLG=0  order by FOOD_ID asc";
        final SqlResource sqlSrc = new StringSqlResource(sql);
        return sqlManager.getResultList(HC_M_FoodDto.class, sqlSrc);
    }

    public int updateFoodImg(int foodId, byte[] file) {
        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_updateFoodImg.sql");
        Map<String, Object> param = new HashMap<>();
        Date now = Calendar.getInstance().getTime();
        {
            param.put("file", file);
            param.put("updateAt", now);
            param.put("foodId", foodId);
        }
        return sqlManager.executeUpdate(sqlSrc, param);
    }

//    public int updateAllFoodImg(Map<Integer, MultipartFile> map) throws IOException {
//        StringBuffer imgCond = new StringBuffer();
//        List<Integer> foodIdList = new ArrayList<Integer>();
//        if (!ObjectUtils.isEmpty(map)) {
//            final String template = "WHEN #ID# THEN '#DATA#'" +  "\n" + "";
//            for (Map.Entry<Integer, MultipartFile> entry : map.entrySet()) {
//                imgCond.append(template.replace("#ID#", entry.getKey()+"").replace("#DATA#", entry.getValue().getBytes() +""));
//                foodIdList.add(entry.getKey());
//            }
//        }
//
//        final SqlResource sqlSrc = new ClasspathSqlResource("sql/" + "HC_M_FoodDao_updateAllFoodImg.sql");
//        Map<String, Object> param = new HashMap<>();
//        Date now = Calendar.getInstance().getTime();
//        {
//            param.put("imgCond", imgCond.toString());
//            param.put("foodIdList", foodIdList);
//            param.put("updateAt", now);
//        }
//        return sqlManager.executeUpdate(sqlSrc, param);
//    }

}
