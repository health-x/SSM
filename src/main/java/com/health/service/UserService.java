package com.health.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void regist(){
        System.out.println("service层 regist方法被调用");
    }
}
