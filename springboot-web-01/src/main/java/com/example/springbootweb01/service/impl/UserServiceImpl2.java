package com.example.springbootweb01.service.impl;

import com.example.springbootweb01.dao.UserDao;
import com.example.springbootweb01.poji.User;
import com.example.springbootweb01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class UserServiceImpl2 implements UserService {

//    @Autowired
//    private UserDao userDao;
//
    //构造函数注入
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl2(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {

        List<String> lines = userDao.findAll();

        List<User> userList = lines.stream().map(line -> {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String username = split[1];
            String password = split[2];
            String name = split[3];
            Integer age = Integer.parseInt(split[4]);
            LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id+200, username, password, name, age, updateTime);
        }).toList();

        return userList;
    }
}
