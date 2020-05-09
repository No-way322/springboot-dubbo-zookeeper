package com.zx.provider.service.impl;

import com.zx.common.domin.User;
import com.zx.common.service.UserService;
import com.zx.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author Noway
 * @Date 2020/5/8 16:52
 * @Version 1.0
 * @Declare .....
 */
@Service
public class UserImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(1l);
    }
}
