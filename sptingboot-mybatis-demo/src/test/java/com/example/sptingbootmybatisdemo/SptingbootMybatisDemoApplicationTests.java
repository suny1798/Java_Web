package com.example.sptingbootmybatisdemo;

import com.example.sptingbootmybatisdemo.Mapper.UserMapper;
import com.example.sptingbootmybatisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SptingbootMybatisDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);

    }

    @Test
    public void testDeleteUser(){
        userMapper.deleteUser(1);
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(6);
        user.setUsername("tdw");
        user.setName("tdw");
        user.setAge(18);
        user.setGender("女");
        userMapper.addUser(user);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(6);
        user.setUsername("qw");
        user.setName("千问");
        user.setAge(18);
        user.setGender("男");
        userMapper.updateUser(user);
    }

}
