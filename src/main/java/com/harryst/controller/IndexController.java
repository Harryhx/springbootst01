package com.harryst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by harryhx on 2019/11/14.
 */
@Controller
@RequestMapping("/user")
public class IndexController {
    /**
     * 初始化登录页面
     * @return
     */
    @RequestMapping("/login_view")
    public String login_view(){
        return "login";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
