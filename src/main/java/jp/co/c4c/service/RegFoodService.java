package jp.co.c4c.service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import jp.co.c4c.db.dao.HC_M_FoodDao;
import jp.co.c4c.db.dto.HC_M_FoodDto;
import jp.co.c4c.service.entity.FoodEntity;
import jp.co.c4c.util.CommonUtil;

@Component
public class RegFoodService {

    @Autowired
    private HC_M_FoodDao dao;
    @Autowired
    CommonUtil cmn;

    @Transactional
    public void insert(HC_M_FoodDto dto) {
        dao.insert(dto);
    }

    @Transactional
    public  List<FoodEntity> getFoodList() {
        List<HC_M_FoodDto> foodList = dao.selectAll();

        return foodList.stream().map( food -> {
            FoodEntity ety = new FoodEntity();
            ety.setFoodId( food.getFoodId());
            ety.setFoodName( food.getFoodName());
            ety.setFoodImg(cmn.convByteToString( food.getFoodImg()));
            return ety;
        }).collect(Collectors.toList());
    }

    @Transactional
    public int change(int foodId, MultipartFile file) {
        //画像ストリームの取得
        try {
            return dao.updateFoodImg(foodId, file.getBytes());
        } catch(IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Transactional
    public int allChange(List<MultipartFile> foodImgList) {
        int count = 0;
        try {
            for (MultipartFile foodImg : foodImgList) {
                count += dao.updateFoodImg(convFileName(foodImg.getOriginalFilename()), foodImg.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return count;
        }
        return count;
    }

    private int convFileName(String fileName) {
        if (StringUtils.isEmpty(fileName)) return 0;
        return Integer.valueOf(fileName.split("_")[0]);
    }

}
