package com.twowheelmadness.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.twowheelmadness")
@EntityScan(basePackages = "com.twowheelmadness.database.models")
@EnableJpaRepositories(basePackages = "com.twowheelmadness.database")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}