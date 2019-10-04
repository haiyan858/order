package com.imooc.order.dto;

import com.imooc.order.dataobject.OrderDetail;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

/**
 * 数据传输对象
 * OrderMaster 和 OrderDetail 关联起来，一对多的关系
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 19:35
 */
@Data
public class OrderDTO {

    /**订单id**/
    private String orderId;

    /**买家名字**/
    private String buyerName;

    /**买家手机号**/
    private String buyerPhone;

    /**买家地址**/
    private String buyerAddress;

    /**买家微信Openid**/
    private String buyerOpenid;

    /**订单总金额**/
    private BigDecimal orderAmount;

    /**订单状态，默认为0 新下单**/
    private Integer orderStatus;

    /**支付状态，默认为0未支付**/
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;

}
