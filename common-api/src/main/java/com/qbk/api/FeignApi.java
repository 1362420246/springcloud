package com.qbk.api;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: quboka
 * @Date: 2018/10/24 22:18
 * @Description:
 */
@RequestMapping("/api")
public interface FeignApi {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String testFegin(@PathVariable("id")String id );



}
