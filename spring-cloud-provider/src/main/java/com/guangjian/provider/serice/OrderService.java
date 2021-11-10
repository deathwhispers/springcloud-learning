package com.guangjian.provider.serice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guangjian.provider.domain.Order;

import java.util.List;

/**
 * @author Yanggj
 * @date 2021/4/8 23:17
 */
public interface OrderService extends IService<Order> {
    List<Order>  findOrderByUserId(Integer userId);

}
