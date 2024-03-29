package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 20:15
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
