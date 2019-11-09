package com.yqf.web;

import com.qbk.api.FeignApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: quboka
 * @Date: 2018/10/24 22:25
 * @Description:
 */
@RestController
public class FeignController implements FeignApi {

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String getFegin(@PathVariable("id")String id , HttpServletRequest request){
        final String name = request.getHeader("name");
        System.out.println("header:" + name);
        System.out.println("生产者："+id);
        return id;
    }

    @Override
    public String testFegin(@PathVariable("id")String id) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        final String name = request.getHeader("name");
        System.out.println("header:" + name);
        System.out.println("生产者："+id);
        return id;
    }
}
