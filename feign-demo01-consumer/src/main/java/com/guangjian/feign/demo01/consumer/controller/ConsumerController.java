package com.guangjian.feign.demo01.consumer.controller;

import com.guangjian.feign.demo01.consumer.feign.DemoProviderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yanggj
 * @Description: test
 * @Date: 2021/11/5 17:03
 * @Version: 1.0.0
 */
@RestController
public class ConsumerController {

    @Resource
    private DemoProviderFeignClient demoProviderFeignClient;

    @GetMapping("/test")
    public String test(String name) {
        // 获得服务 demo01-provider 的一个实例
        String resp = demoProviderFeignClient.hello(name);
        // 返回结果
        return "consumer response: " + resp;
    }

}
