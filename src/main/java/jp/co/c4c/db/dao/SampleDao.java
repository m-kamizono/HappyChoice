package jp.co.c4c.db.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.c4c.db.dto.SampleDto;
import jp.sf.amateras.mirage.SqlManager;
import jp.sf.amateras.mirage.SqlResource;
import jp.sf.amateras.mirage.StringSqlResource;

/**
 * sampleクラス
 *
 */
@Component
public class SampleDao {

    @Autowired
    public SqlManager sqlManager;

    public List<SampleDto> selectAll() {
        final SqlResource sqlSrc = new StringSqlResource("select * from "+SampleDto.TBL);
        return sqlManager.getResultList(SampleDto.class, sqlSrc, sqlSrc);
    }

}
