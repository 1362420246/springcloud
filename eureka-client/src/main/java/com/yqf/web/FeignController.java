package com.yqf.web;

import com.qbk.api.FeignApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: quboka
 * @Date: 2018/10/24 22:25
 * @Description:
 */
@RestController
public class FeignController implements FeignApi {

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String getFegin(@PathVariable("id")String id ){
        System.out.println("生产者："+id);
        return id;
    }

    @Override
    public String testFegin(@PathVariable("id")String id) {
        System.out.println("生产者："+id);
        return id;
    }
}
