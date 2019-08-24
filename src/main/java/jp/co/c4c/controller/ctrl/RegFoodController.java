package jp.co.c4c.controller.ctrl;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.c4c.controller.form.FoodForm;
import jp.co.c4c.db.dto.HC_M_FoodDto;
import jp.co.c4c.service.RegFoodService;

@Controller
@RequestMapping("/food")
public class RegFoodController {

    @Autowired
    RegFoodService service;

    /**
     * 初期表示
     * @param model
     * @param form
     * @return
     */
    @RequestMapping
    public String init(Model model) {
        return "/reg_food";
    }

    /**
     * 登録
     * @param model
     * @param form
     * @return
     * @throws IOException
     */
    @RequestMapping("/regFood")
    public String regFood(Model model, FoodForm form) {
        // insert
        try {
            Date now = Calendar.getInstance().getTime();
            HC_M_FoodDto dto = new HC_M_FoodDto();
            dto.setFoodName(form.getFoodName());
            dto.setSearchWords(form.getSearchWords());
            dto.setWycType(Integer.parseInt(form.getWycType()));
            dto.setMaindishFlg(Integer.parseInt(form.getMaindishFlg()));
            dto.setFoodType(form.getFoodType());
            dto.setCarbo(Integer.parseInt(form.getCarbo()));
            dto.setProt(Integer.parseInt(form.getProt()));
            dto.setFat(Integer.parseInt(form.getFat()));
            dto.setVa(Integer.parseInt(form.getVa()));
            dto.setVb1(Integer.parseInt(form.getVb1()));
            dto.setVb2(Integer.parseInt(form.getVb2()));
            dto.setVc(Integer.parseInt(form.getVc()));
            dto.setFe(Integer.parseInt(form.getFe()));
            dto.setCa(Integer.parseInt(form.getCa()));
            dto.setFib(Integer.parseInt(form.getFib()));
            dto.setSalt(Integer.parseInt(form.getSalt()));
            dto.setFoodImg(form.getFoodImg().getBytes());
            dto.setDelFlg(0);
            dto.setCreateAt(now);
            dto.setUpdateAt(now);
            service.insert(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/reg_food";
    }

}
