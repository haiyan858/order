package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 18:30
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
