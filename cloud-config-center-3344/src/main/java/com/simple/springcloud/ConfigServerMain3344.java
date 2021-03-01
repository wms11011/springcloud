package com.simple.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 王旻爽
 * 2021/2/9
 * @ClassName ConfigServerMain3344.java
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMain3344.class,args);
    }

}
