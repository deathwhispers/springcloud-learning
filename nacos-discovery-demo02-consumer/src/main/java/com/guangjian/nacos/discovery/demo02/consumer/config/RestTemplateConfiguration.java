package com.guangjian.nacos.discovery.demo02.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yanggj
 * @Description: rest配置
 * @Date: 2021/11/5 17:48
 * @Version: 1.0.0
 */
@Configuration
public class RestTemplateConfiguration {
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
