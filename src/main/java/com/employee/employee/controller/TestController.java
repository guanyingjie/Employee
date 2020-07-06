package com.employee.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class TestController {

    @GetMapping("/api/test/helloWorld")
    public String helloWorld(){
        return "hello world!";
    }


}
