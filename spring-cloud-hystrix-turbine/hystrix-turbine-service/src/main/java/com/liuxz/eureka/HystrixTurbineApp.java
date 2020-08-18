package com.liuxz.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix  //开启Hystrix
@EnableHystrixDashboard  //开启HystrixDashboard
@EnableCircuitBreaker
@EnableTurbine
public class HystrixTurbineApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApp.class, args);
    }
}
