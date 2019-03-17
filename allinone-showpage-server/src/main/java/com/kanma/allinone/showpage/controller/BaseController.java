package com.kanma.allinone.showpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ Desc   ：BaseController
 * @ Author ：MaKang
 * @ Date   ：Created on 2018/12/9 17:32
 */
@Controller
public class BaseController {
    @GetMapping("/index")
    public String index() {
        return "msgbox";
    }
}
