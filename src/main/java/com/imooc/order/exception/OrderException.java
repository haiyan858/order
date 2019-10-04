package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 20:14
 */
public class OrderException extends RuntimeException {
    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
