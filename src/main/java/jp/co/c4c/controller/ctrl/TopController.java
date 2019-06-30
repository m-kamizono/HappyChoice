package jp.co.c4c.controller.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.c4c.controller.form.TopForm;
import jp.co.c4c.db.dto.SampleDto;
import jp.co.c4c.service.TopService;

@Controller
@RequestMapping("/")
public class TopController {

	@Autowired
	TopService topService;

    @RequestMapping
    public String init(Model model, TopForm form) {

        return "/hc_top";
    }

    @RequestMapping(value = "/foodcChoice", method = RequestMethod.POST)
    public String foodchoice(Model model, TopForm form) {

        return "/hc_top";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(Model model, TopForm form) {
    	List<SampleDto> list = topService.findAll();


    	form.setName(list.get(0).getName());
        return "/top";
    }

}
