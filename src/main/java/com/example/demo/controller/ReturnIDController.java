package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class ReturnIDController {

    // /api/v1/user로 GET 요청이 오면 "82036602"를 리턴
    @GetMapping
    public String getUserId() {
        return "82036602";
    }
}