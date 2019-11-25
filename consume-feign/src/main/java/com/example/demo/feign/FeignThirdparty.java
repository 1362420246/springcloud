package com.example.demo.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author ：quboka
 * @description： 调用第三方接口
 * @date ：2019/11/25 18:45
 */
@FeignClient(name = "thirdparty", url = "http://localhost:8762")
public interface FeignThirdparty {

    @PostMapping("/api/post")
    Map<String,Object> postThirdparty(@RequestParam String id);

    @PostMapping("/api/postbody")
    String postbodyThirdparty(@RequestBody Map<String,Object> paras);
}
