package com.springboot.xishuimiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author gzw
 * @description helloWorld
 * @date 2019/10/25
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}
