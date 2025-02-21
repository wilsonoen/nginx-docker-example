package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class HomeController {

    @Value("${APP_NAME:Default App}")
    private String appName;


    @GetMapping("/")
    public String home() {
        return appName;
    }
}

