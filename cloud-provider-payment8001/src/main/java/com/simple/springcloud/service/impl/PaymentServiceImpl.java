package com.simple.springcloud.service.impl;

import com.simple.springcloud.service.PaymentService;
import com.simple.springcloud.dao.PaymentDao;
import com.simple.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王旻爽
 * 2021/2/5
 * @ClassName PaymentServiceImpl.java
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
