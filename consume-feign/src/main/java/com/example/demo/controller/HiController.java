package com.example.demo.controller;

import com.example.demo.service.HiSend;
import com.example.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 13624 on 2018/7/1.
 */
@RestController
public class HiController {

    @Autowired
    HiSend hiSend;

    @RequestMapping(value = "/hiFeign", method = RequestMethod.GET)
    public String sayHi(String name) {
        System.out.println("-------------"+name);
        return hiSend.sayHiFromClientOne(name);
    }

    @Autowired
    HiService hiService;

    @RequestMapping("/hiRestTemplate")
    public String hi(String name) {
        System.out.println("-------------"+name);
        return hiService.hi(name);
    }

}