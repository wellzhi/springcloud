package com.liuxz.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        // EUREKA-CLIENT:被调用微服务application.name
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }


}
