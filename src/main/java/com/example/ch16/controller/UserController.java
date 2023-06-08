package com.example.ch16.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // 누구나 접속 가능한
    @GetMapping("/get")
    public String getTest(){
        return "Get Test";
    }

    //user만 접속 가능한
    @PostMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String getUserTest(){
        return "Get UserTest";
    }

    // 어드민 사용자만
    @PostMapping("/admin")
    public String adminTest(){
        return "Admin Test";
    }


}
