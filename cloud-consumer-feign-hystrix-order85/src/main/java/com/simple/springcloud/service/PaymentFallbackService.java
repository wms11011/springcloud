package com.simple.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 王旻爽
 * 2021/2/8
 * @ClassName PaymentFallbackService.java
 */
@Component
public class PaymentFallbackService implements PaymentFeignService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back,fall back";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall back,fall back";
    }
}
