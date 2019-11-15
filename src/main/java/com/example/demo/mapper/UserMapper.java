package com.example.demo.mapper;

//public interface UserMapper extends BaseMapper<User> {
//
//}

import com.example.demo.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
