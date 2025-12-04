package com.example.sptingbootmybatisdemo.Mapper;

import com.example.sptingbootmybatisdemo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UserMapper {


//    @Select("select * from user")
    public List<User> findAll();

    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);

    @Insert("insert into user(username,name,age,gender) values(#{username},#{name},#{age},#{gender})")
    public void addUser(User user);

    @Update("update user set username=#{username},name=#{name},age=#{age},gender=#{gender} where id=#{id}")
    public void updateUser(User user);

}
