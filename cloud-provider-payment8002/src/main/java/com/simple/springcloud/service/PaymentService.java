package com.simple.springcloud.service;

import com.simple.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王旻爽
 * 2021/2/5
 * @ClassName PaymentService.java
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
