package com.example.demo.feign;

import com.qbk.api.FeignApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: quboka
 * @Date: 2018/10/24 22:33
 * @Description:
 */
@FeignClient(value = "eureka-client",fallback = FeignServiceImpl.class)
public interface FeignService extends FeignApi {
}
