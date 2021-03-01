package com.simple.springcloud;

import com.simple.Rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 王旻爽
 * 2021/2/5
 * @ClassName OrderMain81.java
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain81 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain81.class, args);
    }
}
