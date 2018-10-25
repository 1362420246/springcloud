package com.example.demo.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: quboka
 * @Date: 2018/10/25 09:39
 * @Description:
 */
@Component
public class FeignServiceImpl implements FeignService {

    /**
     *  因为实现了FeignService接口的父接口，已经存在@RequestMapping路径，为了避免和消费者路径重复 需要重新写@RequestMapping
     */
    @RequestMapping("/hystrix")
    @ResponseBody
    @Override
    public String testFegin(String id) {
        System.out.println("熔断"+id);
        return "异常";
    }
}
