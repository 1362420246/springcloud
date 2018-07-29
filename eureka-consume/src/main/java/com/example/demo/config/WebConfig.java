package com.example.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 13624 on 2018/6/30.
 */
@Configuration
public class WebConfig {

    @Bean
    @LoadBalanced//负载均衡注解
    RestTemplate restTemplate(){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);//单位为ms
        requestFactory.setReadTimeout(5000);//单位为ms
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        //restTemplate.setRequestFactory(requestFactory);
        return restTemplate;
    }


}
