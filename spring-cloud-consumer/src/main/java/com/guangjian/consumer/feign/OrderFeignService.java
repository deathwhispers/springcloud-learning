package com.guangjian.consumer.feign;

import com.guangjian.common.utils.MyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yanggj
 * @date 2021/7/17 17:21
 */

@FeignClient(value = "mall-order", path = "/order")
public interface OrderFeignService {

    @RequestMapping("/findOrderByUserId/{userId}")
    public MyResponse findOrderByUserId(@PathVariable("userId") Integer userId);
}
