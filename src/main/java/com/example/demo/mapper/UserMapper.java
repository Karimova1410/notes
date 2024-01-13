package com.example.demo.mapper;

import com.example.demo.dto.user.UserResponse;
import com.example.demo.entities.User;

import java.util.List;


public interface UserMapper {
    UserResponse toDto(User user);
    List<UserResponse> toDtos(List<User> all);
}
