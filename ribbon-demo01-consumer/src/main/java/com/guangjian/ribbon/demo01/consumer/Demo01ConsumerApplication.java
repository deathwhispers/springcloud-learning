package com.guangjian.ribbon.demo01.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yanggj
 * @Description: 启动类
 * @Date: 2021/11/4 17:39
 * @Version: 1.0.0
 */
@SpringBootApplication
public class Demo01ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
