package com.imooc.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 23:43
 */

@FeignClient(name = "product") //访问product应用
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();

}
