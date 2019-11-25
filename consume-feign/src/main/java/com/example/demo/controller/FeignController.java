package com.example.demo.controller;

import com.example.demo.feign.FeignService;
import com.example.demo.feign.FeignThirdparty;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    /**
     * 测试熔断
     */
    @RequestMapping("/{id}")
    public String testFegin(@PathVariable("id")String id) {
        System.out.println("消费者："+id);
        System.out.println(Thread.currentThread().getName());
        return feignService.testFegin(id);
    }

    @Autowired
    private FeignThirdparty feignThirdparty;

    /**
     * 测试调用第三方接口
     */
    @GetMapping("/thirdparty")
    public String thirdparty(){
        Map<String,Object> result = feignThirdparty.postThirdparty("1");
        System.out.println(result);

        Map<String,Object> paras = new HashMap<>();
        paras.put("name","kk");
        return  feignThirdparty.postbodyThirdparty(paras);
    }

}
