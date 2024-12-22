package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootK8sDemoApplication.class, args);
    }

    @GetMapping("/message")
    public String welcome() {
        return "Congratulations! You have successfully deployed your application to Kubernetes!";
    }

    @GetMapping("/")
    public String home() {
        return "Home! Congratulations! You have successfully deployed your application to Kubernetes!";
    }
}
