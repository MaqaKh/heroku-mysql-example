package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HomeController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String trigger() {
        User user = new User("john");
        userRepository.save(user);
        return user.id;
    }

    @GetMapping("/{id}")
    public User trigger(@PathVariable("id") String id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            return user.get();
        }
        return null;
    }

    @GetMapping("/bbb")
    public String trigegr2() {
        System.out.println("bbb thread:" + Thread.currentThread().getName());
        return "bbb";
    }
}
