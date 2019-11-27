package jp.co.c4c.controller.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.c4c.controller.form.FoodRecomForm;
import jp.co.c4c.service.FoodRecomService;

@Controller
@RequestMapping("/foodrecom")
public class FoodRecomController {

    @Autowired
    FoodRecomService foodRecomService;

    /**
     * おすすめ料理取得
     * @param model
     * @param form
     * @return
     */
    @RequestMapping(method={RequestMethod.POST})
    public String init(Model model, FoodRecomForm form) {
        // 選択された食品データをformに詰める
        form.setSelectedFoodEty(foodRecomService.choiceSelectedFoodEty(form.getFoodId()));
        // おすすめの食品データをformに詰める
        form.setRecomFoodEtyList(foodRecomService.choiceRecomFoodEtyList(form.getFoodId()));

        return "/hc_foodrecom";
    }

}
