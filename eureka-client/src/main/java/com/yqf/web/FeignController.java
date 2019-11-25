package com.yqf.web;

import com.qbk.api.FeignApi;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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

    @PostMapping("/post")
    public Map<String,String> post(String id){
        System.out.println(id);
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        return map;
    }

    @PostMapping("/postbody")
    public Map<String,String> postbody(@RequestBody Map<String,Object> paras){
        System.out.println(paras);
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        return map;
    }
}
