package com.example.demo.service;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 13624 on 2018/7/1.
 */
@FeignClient(name = "eureka-client")
public interface TestFeignService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String getHi(@RequestParam("name")String name);

}

