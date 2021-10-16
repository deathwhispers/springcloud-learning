package com.sunshine.provider.rest;

import com.sunshine.common.utils.MyResponse;
import com.sunshine.provider.serice.OrderService;
import com.sunshine.provider.domain.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 订单服务
 *
 * @author Yanggj
 * @date 2021/4/8 23:10
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @GetMapping("/{userId}")
    public MyResponse findOrderByUserId(@PathVariable("userId") Integer userId) {
        logger.debug("查看 userId {} 的订单信息", userId);
        List<Order> list = orderService.findOrderByUserId(userId);
        return MyResponse.ok().put("orders", list);
    }

    /**
     * 新增
     */
    @GetMapping("/save")
    public MyResponse save(@RequestBody Order order){
        orderService.save(order);
        return MyResponse.ok();
    }

    /**
     * 修改
     */
    @GetMapping("/update")
    public MyResponse update(@RequestBody Order order){
        orderService.updateById(order);
        return MyResponse.ok();
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    public MyResponse delete(@RequestBody Integer[] ids){
        orderService.removeByIds(Arrays.asList(ids));
        return MyResponse.ok();
    }


}
