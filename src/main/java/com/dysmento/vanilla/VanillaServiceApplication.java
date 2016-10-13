package com.dysmento.vanilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class VanillaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VanillaServiceApplication.class, args);
    }
}
