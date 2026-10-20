package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Service.Bai6GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bai6GreetingController {

    private final Bai6GreetingService greetingService;

    public Bai6GreetingController(Bai6GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/bai6/greeting")
    public String bai6Greeting() {
        return greetingService.sayHello();
    }
}