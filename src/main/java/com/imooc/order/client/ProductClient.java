package com.imooc.order.client;

import com.imooc.order.dataobject.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 23:43
 */

@FeignClient(name = "product") //访问product应用
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();

    //@RequestBody 注解必须用 @PostMapping 而不能用@GetMapping（报错405)
    //@GetMapping的使用场景：无参数传入，或者@RequestParam，或者@PathVariable
    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);
}
