package com.example.demo.entities;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


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


    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    List<Note> userNotes;


}
