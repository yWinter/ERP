package com.lanou.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 17/12/5.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/index")
    public String mainPage(){
        return "index";
    }

    @RequestMapping(value = "/index_v148b2")
    public String welcomePage(){
        return "index_v148b2";
    }

}
