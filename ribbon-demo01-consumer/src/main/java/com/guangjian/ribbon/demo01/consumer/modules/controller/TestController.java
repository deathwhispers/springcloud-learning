package com.guangjian.ribbon.demo01.consumer.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yanggj
 * @Description: test
 * @Date: 2021/11/5 17:03
 * @Version: 1.0.0
 */
@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello")
    public String hello(String name) {
        // 获得服务 `demo-provider` 的一个实例
        ServiceInstance instance = loadBalancerClient.choose("demo-provider");
        // 发起调用
        String targetUrl = instance.getUri() + "/echo?name=" + name;
        String response = restTemplate.getForObject(targetUrl, String.class);
        // 返回结果
        return "consumer:" + response;
    }

    @GetMapping("/hello02")
    public String hello02(String name) {
        // 直接使用 RestTemplate 调用服务 `demo-provider`
        String targetUrl = "http://demo-provider/echo?name=" + name;
        String response = restTemplate.getForObject(targetUrl, String.class);
        // 返回结果
        return "consumer:" + response;
    }

}
