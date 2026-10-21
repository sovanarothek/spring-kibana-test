package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class DemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        logger.info("Home endpoint was hit successfully!");
        return "Hello from Termux Spring Boot!";
    }

    @GetMapping("/test-log")
    public String testLog() {
        logger.warn("Warning test log generated for Kibana simulation.");
        return "Log triggered!";
    }
}
