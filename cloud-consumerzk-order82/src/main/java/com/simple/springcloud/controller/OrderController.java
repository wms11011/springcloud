package com.simple.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 王旻爽
 * 2021/2/6
 * @ClassName OrderController.java
 */
@RestController
public class OrderController {
    public static final String INVOke_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        String result = restTemplate.getForObject(INVOke_URL+"/payment/zk",String.class);
        return result;
    }

}
