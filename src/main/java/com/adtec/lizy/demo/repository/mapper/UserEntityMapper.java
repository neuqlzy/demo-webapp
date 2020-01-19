package com.adtec.lizy.demo.repository.mapper;

import com.adtec.lizy.demo.repository.entity.UserEntity;

public interface UserEntityMapper {
    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(String userId);
}