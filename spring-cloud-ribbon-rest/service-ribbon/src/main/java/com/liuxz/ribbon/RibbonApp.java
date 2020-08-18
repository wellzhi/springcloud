package com.liuxz.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * 在使用Spring Cloud feign使用中在使用服务发现的时候提到了两种注解，
 * 一种为@EnableDiscoveryClient,一种为@EnableEurekaClient,用法上基本一致。
 * spring cloud中discovery service有许多种实现（eureka、consul、zookeeper等等），
 *
 * @EnableDiscoveryClient基于spring-cloud-commons,
 * @EnableEurekaClient基于spring-cloud-netflix。 其实用更简单的话来说，就是
 * 如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，
 * 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class RibbonApp {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApp.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
