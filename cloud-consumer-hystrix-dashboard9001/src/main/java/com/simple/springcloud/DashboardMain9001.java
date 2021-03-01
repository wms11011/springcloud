package com.simple.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 王旻爽
 * 2021/2/9
 * @ClassName DashboardMain9001.java
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(DashboardMain9001.class,args);
    }

}
