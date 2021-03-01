package com.simple.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王旻爽
 * 2021/2/7
 * @ClassName FeignConfig.java
 */
@Configuration
public class FeignConfig {


    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
