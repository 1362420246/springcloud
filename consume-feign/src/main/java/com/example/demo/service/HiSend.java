package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 13624 on 2018/7/1.
 */
//通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口，还可以使用url参数指定一个URL  fallback  出现错误回调类
@FeignClient(value = "eureka-client", fallback = HiSendImpl.class)
public interface HiSend {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);//添加参数name 相当于/hi?name=xxx

}
