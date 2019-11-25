package com.example.demo.controller;

import com.example.demo.service.TestFeignService;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 13624 on 2018/7/1.
 */
@RestController
public class TestFeignController {

    @Resource
    private TestFeignService testFeignService ;

    @GetMapping("/getHi")
    public  String getHi(){
        System.out.println(Thread.currentThread().getName());
        return testFeignService.getHi("qubokakaka");
    };


}



























