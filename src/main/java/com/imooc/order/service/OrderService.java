package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 19:34
 */
public interface OrderService {
    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
