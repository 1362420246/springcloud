package com.example.demo.controller;

import com.example.demo.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: quboka
 * @Date: 2018/10/24 22:32
 * @Description:
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/{id}")
    public String testFegin(@PathVariable("id")String id) {
        System.out.println("消费者："+id);
        System.out.println(Thread.currentThread().getName());
        return feignService.testFegin(id);
    }

}
