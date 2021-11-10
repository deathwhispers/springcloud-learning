package com.guangjian.consumer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guangjian.common.utils.PageUtils;
import com.guangjian.common.utils.Query;
import com.guangjian.consumer.service.UserService;
import com.guangjian.consumer.dao.UserDao;
import com.guangjian.consumer.domain.User;
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
