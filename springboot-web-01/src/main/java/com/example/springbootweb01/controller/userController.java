package com.example.springbootweb01.controller;

import com.example.springbootweb01.poji.User;
import com.example.springbootweb01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;


@RestController
public class userController {

    // 注入
    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

    //构造函数注入
//    private final UserService userService;
//
//    @Autowired
//    public userController(UserService userService) {
//        this.userService = userService;
//    }


    @RequestMapping("/list")
    public List<User> list() throws FileNotFoundException {
        List<User> userList = userService.findAll();

        return userList;
    }
}
