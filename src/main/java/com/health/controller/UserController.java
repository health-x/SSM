package com.health.controller;

import com.health.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    public UserController() {
        System.out.println("userController被调用");
        System.out.println(userService);
    }
}
