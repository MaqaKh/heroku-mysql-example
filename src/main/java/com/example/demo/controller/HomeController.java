package com.example.demo.controller;

import com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    Service service;

    @GetMapping("/")
    public String trigegr(){


        System.out.println("current thread name:" + Thread.currentThread().getName());
        return "aaaa";
    }

    @GetMapping("/bbb")
    public String trigegr2(){
        System.out.println("bbb thread:" + Thread.currentThread().getName());
        return "bbb";
    }
}
