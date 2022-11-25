package com.example.resumecreate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ResumeCreateApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResumeCreateApplication.class, args);
    }

}
