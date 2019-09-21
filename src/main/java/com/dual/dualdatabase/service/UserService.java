package com.dual.dualdatabase.service;

import com.dual.dualdatabase.mapper.dbOne.UserMapper;
import com.dual.dualdatabase.mapper.dbTwo.DepartmentMapper;
import com.dual.dualdatabase.model.Department;
import com.dual.dualdatabase.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapperOne;

    public User getUserInfoById(Integer id) {
       return userMapperOne.selectByPrimaryKey(id);
    }
}
