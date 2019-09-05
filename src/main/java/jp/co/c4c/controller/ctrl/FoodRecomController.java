package jp.co.c4c.controller.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.c4c.controller.form.FoodRecomForm;
import jp.co.c4c.util.CommonUtil;

@Controller
@RequestMapping("/foodrecom")
public class FoodRecomController {

    // TODO: FoodRecomService に変更する
//    @Autowired
//    FoodListService foodListService;
    @Autowired
    CommonUtil cmn;

    // TODO: 必要なコメントを追加する
    /**
     *
     * @param model
     * @param form
     * @return
     */
    @RequestMapping(method={RequestMethod.POST})
    public String init(Model model, FoodRecomForm form) {

        // TODO: 仮でTOP画面を返す return hc_foodrecom
        return "/hc_top";
    }

}
