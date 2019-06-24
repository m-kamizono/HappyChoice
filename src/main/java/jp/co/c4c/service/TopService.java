package jp.co.c4c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.SampleDao;
import jp.co.c4c.db.dto.SampleDto;

@Component
public class TopService {

    @Autowired
    private SampleDao sampleDao;

    @Transactional
    public List<SampleDto> findAll() {
        List<SampleDto> selectAllList = sampleDao.selectAll();
        return selectAllList;
    }

}
