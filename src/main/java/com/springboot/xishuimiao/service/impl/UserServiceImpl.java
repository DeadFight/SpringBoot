package com.springboot.xishuimiao.service.impl;

import com.springboot.xishuimiao.entity.User;
import com.springboot.xishuimiao.mapper.UserMapper;
import com.springboot.xishuimiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User add(User record) {
        int number = userMapper.insert(record);
        return number>0 ? record : null;
    }

    @Override
    public Integer addList(List<User> recordList) {
        return null;
    }

    @Override
    public Boolean modify(User record) {
        return null;
    }

    @Override
    public Boolean remove(String id) {
        return null;
    }

    @Override
    public Boolean batchRemove(String[] ids) {
        return null;
    }

    @Override
    public User getById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public List<User> query(User queryBean) {
        return null;
    }
}