package com.example.demo.mapper.impl;

import com.example.demo.dto.user.UserResponse;
import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Component;



@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponse toDto(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setAge(user.getAge());
        userResponse.setName(user.getName());
        userResponse.setPosition(user.getPosition());


        return userResponse;
    }
}