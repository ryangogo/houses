package com.ryan.house.biz.mapper;

import com.ryan.house.biz.pojo.User;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> selectAll();

}