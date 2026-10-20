package com.Cybersoft.BaiTapSBLesson11.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bai1Controller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }
}
