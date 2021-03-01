package com.simple.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName MyBatisConfig.java
 */
@Configuration
@MapperScan({"com.simple.springcloud.dao"})
public class MyBatisConfig {
}
