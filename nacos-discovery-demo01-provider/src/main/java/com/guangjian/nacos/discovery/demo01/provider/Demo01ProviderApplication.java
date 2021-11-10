package com.guangjian.nacos.discovery.demo01.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yanggj
 * @Description: 启动类
 * @Date: 2021/11/4 17:39
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Demo01ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ProviderApplication.class, args);
    }

}
