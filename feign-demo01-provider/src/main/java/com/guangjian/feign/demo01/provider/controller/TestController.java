package com.guangjian.feign.demo01.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yanggj
 * @Description: test
 * @Date: 2021/11/5 17:03
 * @Version: 1.0.0
 */
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String test(String name) {


        return "provider:" + name;
    }

}
