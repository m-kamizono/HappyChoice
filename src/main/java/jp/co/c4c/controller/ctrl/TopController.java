package jp.co.c4c.controller.ctrl;

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
        return "/hc_top";
    }

}
