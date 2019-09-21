package com.dual.dualdatabase.service;

import com.dual.dualdatabase.mapper.dbTwo.DepartmentMapper;
import com.dual.dualdatabase.model.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptService {
    @Resource
    private DepartmentMapper departmentMapper;

    public Department getDeptInfoById(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }
}
