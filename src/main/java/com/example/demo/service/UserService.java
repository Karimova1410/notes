package com.example.demo.service;

import com.example.demo.dto.user.UserRequest;
import com.example.demo.dto.user.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse getById(Long id);

    void addUser(UserRequest userRequest);

    void deleteById(Long id);

    void updateById(Long id, UserRequest userRequest);

    List<UserResponse> getAll();
}