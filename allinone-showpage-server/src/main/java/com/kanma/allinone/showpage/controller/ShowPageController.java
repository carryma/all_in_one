package com.kanma.allinone.showpage.controller;

import com.kanma.allinone.showpage.entity.ResponseModel;
import com.kanma.allinone.showpage.entity.SupplierInfoView;
import com.kanma.allinone.showpage.entity.ViewRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Author ：MaKang
 * @ Date   ：Created in 2018/12/9 17:38
 */
@Controller
public class ShowPageController {
    private static final Logger logger = LoggerFactory.getLogger(ShowPageController.class);

    @RequestMapping(value = "/getMessage", method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel showMsg(@RequestBody ViewRequest request) {
        ResponseModel responseModel = new ResponseModel();
        List<String> message = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            message.add("模态弹出窗主体内容");
        }
        responseModel.setMessages(message);
        if (request != null) {
            return responseModel;
        }
        return responseModel;
    }

    @RequestMapping(value = "/getMessage2", method = RequestMethod.POST)
    @ResponseBody
    public String showMsgNew(@RequestBody ViewRequest request) {
        ResponseModel responseModel = new ResponseModel();
        List<String> message = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            message.add("模态弹出窗主体内容");
        }
        responseModel.setMessages(message);
        if (request != null) {
            return "哈哈";
        }
        return "呵呵";
    }

    @ResponseBody
    @RequestMapping(value = "/getSupplierList", method = RequestMethod.GET)
    public List<SupplierInfoView> getSupplierInfo(HttpServletRequest request) {
        List<SupplierInfoView> list = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            SupplierInfoView pojo = new SupplierInfoView();
            pojo.setSupplierId(i);
            pojo.setSupplierName("测试供应商-" + i);

            list.add(pojo);
        }
        return list;

    }


}
