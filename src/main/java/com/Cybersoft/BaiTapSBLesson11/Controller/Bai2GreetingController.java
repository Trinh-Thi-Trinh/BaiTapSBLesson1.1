package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Service.Bai2GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bai2GreetingController {

    private final Bai2GreetingService greetingService;

    public Bai2GreetingController(Bai2GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return greetingService.sayHello(name);
    }
}
