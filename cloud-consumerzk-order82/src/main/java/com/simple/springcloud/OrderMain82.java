package com.simple.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 王旻爽
 * 2021/2/6
 * @ClassName OrderMain82.java
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class,args);
    }
}
