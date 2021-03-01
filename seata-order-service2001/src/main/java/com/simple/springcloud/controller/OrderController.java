package com.simple.springcloud.controller;

import com.simple.springcloud.domain.CommonResult;
import com.simple.springcloud.domain.Order;
import com.simple.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName OrderController.java
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }


}
