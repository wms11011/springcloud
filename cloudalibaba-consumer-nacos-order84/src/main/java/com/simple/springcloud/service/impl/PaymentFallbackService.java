package com.simple.springcloud.service.impl;

import com.simple.springcloud.entities.CommonResult;
import com.simple.springcloud.entities.Payment;
import com.simple.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author 王旻爽
 * 2021/2/23
 * @ClassName PaymentFallbackService.java
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
