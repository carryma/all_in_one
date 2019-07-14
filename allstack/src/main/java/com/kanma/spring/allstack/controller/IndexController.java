package com.kanma.spring.allstack.controller;

import com.kanma.spring.allstack.entity.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author ：Ma Kang
 * @ Date   ：Created on 2019/7/14 18:39
 */

@RestController
public class IndexController {

    @GetMapping("user/info")
    public UserInfo index() {

        UserInfo userInfo = new UserInfo();
        userInfo.setName("mk");
        userInfo.setTel("17625759149");
        userInfo.setHobby("唱, 跳, rap, 篮球, Music...");
        userInfo.setAddress("上海携程计算机有限公司");

        return userInfo;
    }

}