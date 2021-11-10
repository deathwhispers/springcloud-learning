package com.guangjian.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guangjian.provider.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Yanggj
 * @date 2021/4/8 23:19
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {

}
