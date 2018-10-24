package com.yqf.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yqf on 2017/6/9.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println(name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hi "+name+",i am from port:" +port;
    }

}
