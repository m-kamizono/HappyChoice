package jp.co.c4c.controller.ctrl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.c4c.controller.form.TopForm;
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
        Random random = new Random();
        // 現在3種類のキャラクターIDをランダム発行 3桁数字に成型
        String charaId = String.format("%03d",random.nextInt(3)+1);
        form.setCharacterId(charaId);
        form.setSuggestWordList(topService.choiceFoodNameKana());

        return "/hc_top";
    }

    @RequestMapping(value="modal")
    public String modalOpen(Model model, TopForm form) {
        form.setEmptyResultFlg(true);
        return "/hc_top";
    }

}
