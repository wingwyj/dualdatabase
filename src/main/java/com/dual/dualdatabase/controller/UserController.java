package com.dual.dualdatabase.controller;

import com.dual.dualdatabase.model.User;
import com.dual.dualdatabase.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUserInfo")
    public User getUserInfoById() {
        return userService.getUserInfoById(50);
    }
}
