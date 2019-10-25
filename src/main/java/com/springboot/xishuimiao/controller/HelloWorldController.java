package com.springboot.xishuimiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gzw
 * @description helloWorld
 * @date 2019/10/24
 */
@RestController(value = "hello")
public class HelloWorldController {

    @RequestMapping("/world")
    @ResponseBody
    public String helloWorld(){
        return "hello world";
    }
}
