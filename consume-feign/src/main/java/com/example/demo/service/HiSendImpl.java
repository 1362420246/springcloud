package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by 13624 on 2018/7/1.
 */

@Component
public class HiSendImpl implements HiSend {

    @Override
    public String sayHiFromClientOne(String name) {
        return "上级服务连接异常，熔断！";
    }

}
