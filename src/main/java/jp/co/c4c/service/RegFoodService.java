package jp.co.c4c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.db.dto.HC_M_FoodDto;

@Component
public class RegFoodService {

    @Autowired
    private HC_M_FoodDao dao;

    @Transactional
    public void insert(HC_M_FoodDto dto) {
//        dao.insert(dto);
    }

}
