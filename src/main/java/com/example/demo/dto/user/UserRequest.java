package com.example.demo.dto.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private  String email;
    private String position;

}