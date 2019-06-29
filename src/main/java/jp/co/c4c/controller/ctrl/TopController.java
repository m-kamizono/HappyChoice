package jp.co.c4c.controller.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.c4c.controller.form.CmnForm;
import jp.co.c4c.controller.form.TopForm;
import jp.co.c4c.db.dto.HC_M_FoodDto;
import jp.co.c4c.service.TopService;
import jp.co.c4c.util.CommonUtil;

@Controller
@RequestMapping("/")
public class TopController {

	@Autowired
	TopService topService;
    @Autowired
    CommonUtil cmn;

	/**
	 * 初期表示
	 * @param model
	 * @param form
	 * @return
	 */
    @RequestMapping
    public String init(Model model, TopForm form) {
        return "/hc_top";
    }

    /**
     * 料理候補取得
     * @param model
     * @param form
     * @return
     */
    @RequestMapping(value = "/selectFood", method = RequestMethod.POST)
    public String selectFood(Model model, CmnForm form) {
    	// バリデーションチェック
    	// 食品タイプ(数値チェック) TODO:enum作って比較でもよいかも
    	if (!cmn.isNumber(form.getFoodType())) {
            return "/hc_top";
    	}

    	// 食品タイプを数値に変換
    	int foodType = Integer.parseInt(form.getFoodType());
    	// 食品タイプを引数にを呼び出す
    	List<HC_M_FoodDto> foodList = topService.selectFood(foodType, form.getSearchWord());

    	 // 取得した食品リストが0件だった場合、ダイアログ表示　TODO
    	if (CollectionUtils.isEmpty(foodList)) {
    		return "/hc_top";
    	}

    	// 取得した食品リストをformにセット
    	form.setFoodChcList(foodList);

        return "/selectFood";
    }

}
