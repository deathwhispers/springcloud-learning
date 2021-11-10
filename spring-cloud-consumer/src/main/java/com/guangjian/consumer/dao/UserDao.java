package com.guangjian.consumer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guangjian.consumer.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Yanggj
 * @date 2021/4/12 23:36
 */
@Mapper
public interface UserDao  extends BaseMapper<User> {
}
