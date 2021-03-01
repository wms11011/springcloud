package com.simple.springcloud.dao;

import com.simple.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王旻爽
 * 2021/2/5
 * @ClassName PaymentDao.java
 */
@Mapper
public interface PaymentDao {

    public Integer create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
