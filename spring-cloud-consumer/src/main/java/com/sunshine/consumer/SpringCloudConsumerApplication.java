package com.sunshine.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 排除掉数据库连接,否则如果不连接数据库,项目无法启动
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
// 允许服务发现，才可以注册到nacos注册中心
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }

}