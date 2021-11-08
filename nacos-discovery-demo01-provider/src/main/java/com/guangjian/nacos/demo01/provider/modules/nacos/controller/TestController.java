package com.guangjian.nacos.demo01.provider.modules.nacos.controller;

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

    @GetMapping("/test")
    public String test(String name) {
        return "provider:" + name;
    }

}
