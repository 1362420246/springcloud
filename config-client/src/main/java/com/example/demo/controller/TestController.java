package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 13624 on 2018/7/1.
 */
@RestController
public class TestController {

    @Value("${qbk}")
    private String qbk;

    @GetMapping("/getUser")
    public String getUser() {
        System.out.println(qbk);
        return qbk;
    }


}
