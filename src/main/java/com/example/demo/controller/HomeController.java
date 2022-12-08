package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String trigegr() {
        User user = new User("john");
        userRepository.save(user);
        return user.id;
    }

    @GetMapping("/bbb")
    public String trigegr2() {
        System.out.println("bbb thread:" + Thread.currentThread().getName());
        return "bbb";
    }
}
