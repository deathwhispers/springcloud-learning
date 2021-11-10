package com.guangjian.provider.serice.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guangjian.provider.dao.OrderDao;
import com.guangjian.provider.domain.Order;
import com.guangjian.provider.serice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yanggj
 * @date 2021/4/8 23:18
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> findOrderByUserId(Integer userId) {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        return baseMapper.selectList(queryWrapper);
    }

}
