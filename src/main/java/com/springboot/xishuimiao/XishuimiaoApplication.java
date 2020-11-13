package com.springboot.xishuimiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.xishuimiao.mapper")
public class XishuimiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XishuimiaoApplication.class, args);
    }

}
