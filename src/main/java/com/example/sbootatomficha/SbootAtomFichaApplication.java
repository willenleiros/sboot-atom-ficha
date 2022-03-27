package com.example.sbootatomficha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SbootAtomFichaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootAtomFichaApplication.class, args);
    }

}
