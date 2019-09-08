package jp.co.c4c.controller.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.c4c.controller.form.FoodListForm;
import jp.co.c4c.service.FoodListService;
import jp.co.c4c.service.entity.FoodEntity;
import jp.co.c4c.util.CommonUtil;

@Controller
@RequestMapping("/foodlist")
public class FoodListController {

    @Autowired
    FoodListService foodListService;
    @Autowired
    CommonUtil cmn;

    /**
     * 料理候補取得
     * @param model
     * @param form
     * @return
     */
    @RequestMapping(method={RequestMethod.POST})
    public String init(Model model, FoodListForm form) {
        // 食品タイプと検索ワードを引数に食品リストをとってくる
        List<FoodEntity> foodList = foodListService.choiceFoodList(form.getFoodType(), form.getSearchWord());

        // 取得した食品リストが0件だった場合、ダイアログ表示　TODO:TopControllerを呼び出す
        if (CollectionUtils.isEmpty(foodList)) {
            return "/hc_top";
        }

        // 取得した食品リストをformにセット
        form.setFoodList(foodList);

        return "/hc_foodlist";
    }

}
