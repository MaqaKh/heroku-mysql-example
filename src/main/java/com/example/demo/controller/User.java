package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


@Entity
public class User {
    @Id
    String id;

    String name;


    public User(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public User() {

    }
}
