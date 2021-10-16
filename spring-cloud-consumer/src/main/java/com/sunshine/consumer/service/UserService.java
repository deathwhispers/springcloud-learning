package com.sunshine.consumer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunshine.common.utils.PageUtils;
import com.sunshine.consumer.domain.User;

import java.util.Map;

/**
 * @author Yanggj
 * @date 2021/4/8 23:29
 */
public interface UserService extends IService<User> {

    PageUtils queryPage(Map<String, Object> params);
}
