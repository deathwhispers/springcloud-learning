package com.guangjian.consumer.rest;

import com.guangjian.common.utils.MyResponse;
import com.guangjian.consumer.service.UserService;
import com.guangjian.consumer.feign.OrderFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yanggj
 * @date 2021/4/8 23:28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderFeignService orderFeignService;

    @RequestMapping(value = "/{userId}")
    public MyResponse findOrderByUserId(@PathVariable("userId") Integer userId) {
        logger.debug("根据 userId: {} 查询订单信息", userId);
        // RestTemplate调用
//        String url = "http://localhost:8020/order/"+id;
//        R result = restTemplate.getForObject(url,R.class);

        //模拟ribbon实现
        //String url = getUri("order-provider")+"/order/"+userId;
        // 添加@LoadBalanced
        String url = "http://order-provider/order/" + userId;
        //String url = "http://localhost:8842/order/" + userId;
        //MyResponse result = restTemplate.getForObject(url, MyResponse.class);

        //feign调用
        MyResponse result = orderFeignService.findOrderByUserId(userId);

        return result;
    }


}
