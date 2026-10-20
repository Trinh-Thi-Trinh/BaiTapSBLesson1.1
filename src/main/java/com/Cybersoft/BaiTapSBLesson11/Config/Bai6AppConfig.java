package com.Cybersoft.BaiTapSBLesson11.Config;

import com.Cybersoft.BaiTapSBLesson11.Service.Bai6GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bai6AppConfig {

    @Bean
    public Bai6GreetingService bai6GreetingService() {
        return new Bai6GreetingService();
    }
}