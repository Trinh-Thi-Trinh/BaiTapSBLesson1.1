package com.Cybersoft.BaiTapSBLesson11.Service;

import org.springframework.stereotype.Service;

@Service
public class Bai2GreetingService {
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
