package com.example.demo.config;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * feign拦截器
 */
@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
       return requestTemplate -> {
           System.out.println(Thread.currentThread().getName());
           ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
           HttpServletRequest request = attributes.getRequest();
           Enumeration<String> headerNames = request.getHeaderNames();
           if (headerNames != null) {
               while (headerNames.hasMoreElements()) {
                   String name = headerNames.nextElement();
                   String values = request.getHeader(name);
                   //转发请求头参数
                   requestTemplate.header(name, values);
               }
           }

       };
    }
}
