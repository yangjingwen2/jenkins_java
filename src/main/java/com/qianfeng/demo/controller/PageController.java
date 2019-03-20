package com.qianfeng.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("hello.html")
    public String forwardHelloPage(){
        return "hello.html";
    }
}
