package com.imooc.order.VO;

import lombok.Data;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 20:12
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;
}
