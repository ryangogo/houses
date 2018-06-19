package com.ryan.house.biz.service.impl;

import com.ryan.house.biz.mapper.UserMapper;
import com.ryan.house.biz.pojo.User;
import com.ryan.house.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/6/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAll();
        return users;
    }
}
