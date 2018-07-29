package com.example.demo.controller;

import com.example.demo.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 13624 on 2018/6/30.
 */
@RestController
public class ConsumeController {

    @Autowired
    private ConsumeService consumeService ;

    @Value("${server.port}")
    String port;

    @GetMapping("/get")
    public String get(){
        System.out.println("服务正在调用");
        return consumeService.getA();
    }
    @GetMapping("/hi")
    public String home() {
        return "hi ,i am from port:" +port;
    }
}





























