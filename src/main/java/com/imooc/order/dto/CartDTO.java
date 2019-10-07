package com.imooc.order.dto;

import lombok.Data;

/**
 * 购物车对象
 * @Author cuihaiyan
 * @Create_Time 2019-10-07 20:53
 */
@Data
public class CartDTO {
    /**商品ID*/
    private String productId;
    /**购买数量*/
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
