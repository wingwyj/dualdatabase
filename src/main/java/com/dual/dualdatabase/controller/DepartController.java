package com.dual.dualdatabase.controller;

import com.dual.dualdatabase.model.Department;
import com.dual.dualdatabase.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dept")
public class DepartController {
    @Resource
    private DeptService deptService;

    @GetMapping("/getDeptInfo")
    public Department getDeptInfoById() {
        return deptService.getDeptInfoById(1);
    }
}
