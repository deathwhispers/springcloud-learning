package com.guangjian.userconsumerdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yanggj
 * @date 2021/4/8
 */
@Configuration
public class RestConfig {

    // 负载均衡器
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
