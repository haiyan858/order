package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 18:56
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
