package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 13624 on 2018/6/30.
 */
@Service
public class ConsumeService {

    @Autowired
    private RestTemplate restTemplate ;

    public  String getA(){
        String kaka = restTemplate.getForObject("http://eureka-client/hi?name={name}", String.class, "kaka");
        System.out.println(kaka);
        return  kaka ;
    }



}

















