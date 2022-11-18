package com.springboot.rot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableSimbot
@SpringBootApplication
public class RotApplication {

    public static void main(String[] args) {
        SpringApplication.run(RotApplication.class, args);
    }

}
