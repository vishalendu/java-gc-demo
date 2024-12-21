package com.javaperf.gcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GcTestApplication {


    public static void main(String[] args) {
        SpringApplication.run(GcTestApplication.class, args);
    }

}
