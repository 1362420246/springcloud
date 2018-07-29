package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 13624 on 2018/7/1.
 */
@Service
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    // http://服务提供者的serviceId/url
    @HystrixCommand(fallbackMethod = "error")
    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }

    public String error(String name) {
        return "异常!";
    }

}
