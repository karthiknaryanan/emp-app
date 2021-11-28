package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
     @Bean
     public Employee employeeBean() {
        return new Employee();
     }
}