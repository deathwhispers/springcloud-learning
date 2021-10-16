package com.sunshine.consumer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.common.utils.PageUtils;
import com.sunshine.common.utils.Query;
import com.sunshine.consumer.dao.UserDao;
import com.sunshine.consumer.domain.User;
import com.sunshine.consumer.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Yanggj
 * @date 2021/4/8 23:33
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<User> page = this.page(
                new Query<User>().getPage(params),
                new QueryWrapper<User>()
        );
        return new PageUtils(page);
    }
}
