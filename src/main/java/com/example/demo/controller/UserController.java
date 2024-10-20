package com.example.sampleapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // GET 방식으로 사번을 반환하는 API
    @GetMapping("/api/v1/user")
    public String getUserId(@RequestParam(value = "employeeId", defaultValue = "0000") String employeeId) {
        return "사번: " + employeeId;
    }
}
