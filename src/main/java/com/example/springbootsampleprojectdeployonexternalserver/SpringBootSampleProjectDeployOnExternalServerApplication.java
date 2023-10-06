package com.example.springbootsampleprojectdeployonexternalserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSampleProjectDeployOnExternalServerApplication {

    @GetMapping("/hello")
    public String display(){
        return "Welcome to EnggAdda";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleProjectDeployOnExternalServerApplication.class, args);
    }

}
