package com.example.demo.entities;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "users_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private  String email;
    private String position;


}
