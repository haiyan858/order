package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;


/**
* @Author cuihaiyan
* @Create_Time 2019-10-04 18:26
*/
@Data
@Entity
public class OrderDetail {

    /**订单详情id**/
    @Id
    private String detailId;

    /**订单id**/
    private String orderId;

    /**商品id**/
    private String productId;

    /**商品名称**/
    private String productName;

    /**商品单价**/
    private BigDecimal productPrice;

    /**商品数量**/
    private Integer productQuantity;

    /**商品小图**/
    private String productIcon;

    /**创建时间**/
    private Date createTime;

    /**更新时间**/
    private Date updateTime;
}
