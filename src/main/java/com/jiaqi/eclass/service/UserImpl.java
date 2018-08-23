package com.jiaqi.eclass.service;

import com.jiaqi.eclass.entity.User;
import com.jiaqi.eclass.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
}
