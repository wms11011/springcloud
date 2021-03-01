package com.simple.springcloud.dao;

import com.simple.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName OrderDao.java
 */
@Mapper
public interface OrderDao {
    // 1 新建订单
    void create(Order order);

    // 2 修改订单状态  从0改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);



}
