package com.dual.dualdatabase;

import com.dual.dualdatabase.model.User;
import com.dual.dualdatabase.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DualdatabaseApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void userTest() {
        User user = userService.getUserInfoById(50);
        System.out.println(user.toString());
    }

}
