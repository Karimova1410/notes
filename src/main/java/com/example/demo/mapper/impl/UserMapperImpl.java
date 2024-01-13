package com.example.demo.mapper.impl;

import com.example.demo.dto.user.UserResponse;
import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponse toDto(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setName(user.getName());
        userResponse.setPosition(user.getPosition());


        return userResponse;
    }

    @Override
    public List<UserResponse> toDtos(List<User> all) {
        List<UserResponse> userResponses = new ArrayList<>();
        for(User user: all){
            userResponses.add(toDto(user));
        }
        return userResponses;
    }
}