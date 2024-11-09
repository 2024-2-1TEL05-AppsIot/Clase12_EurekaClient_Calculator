package com.example.eurekaclientcalculator_clase12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClientCalculatorClase12Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCalculatorClase12Application.class, args);
    }

}
