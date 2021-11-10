package com.guangjian.userconsumerdemo.controller;


import com.guangjian.common.utils.MyResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("user")
public class UserController {
    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public MyResponse findOrderById(@PathVariable("id")Integer id ){
        String url = "http://mall-order/order/findOrderByUserId/"+id;
        MyResponse result = restTemplate.getForObject(url, MyResponse.class);

        return result;
    }

}
