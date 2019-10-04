package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 18:29
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

}
