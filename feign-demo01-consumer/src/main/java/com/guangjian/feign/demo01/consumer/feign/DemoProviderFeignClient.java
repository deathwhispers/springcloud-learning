package com.guangjian.feign.demo01.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yanggj
 * @Date: 2021/12/13 22:47
 * @Version: 1.0.0
 */
// @FeignClient声明为Feign客户端，其中name为Feign客户端的名字，也可以是Ribbon客户端的名字，也可以是注册中心的服务的名字
@FeignClient(name = "demo-provider")
public interface DemoProviderFeignClient {

    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
