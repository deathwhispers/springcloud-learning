package com.guangjian.nacos.discovery.demo01.consumer.controller;

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
    private DiscoveryClient discoveryClient;
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test(String name) {
        // 获得服务 demo01-provider 的一个实例
        ServiceInstance instance;
        if (true) {
            // 获取服务 demo01-provider 对应的实例列表
            List<ServiceInstance> instances = discoveryClient.getInstances("demo01-provider");
            // 选择第一个
            instance = instances.size() > 0 ? instances.get(0) : null;
        } else {
            // 通过负载均衡客户端获取实例对象
            instance = loadBalancerClient.choose("demo01-provider");
        }
        // 发起调用
        if (instance == null) {
            throw new IllegalStateException("未获取到实例");
        }
        String targetUrl = instance.getUri() + "/test?name=" + name;
        String response = restTemplate.getForObject(targetUrl, String.class);
        // 返回结果
        return "consumer:" + response;
    }

}
