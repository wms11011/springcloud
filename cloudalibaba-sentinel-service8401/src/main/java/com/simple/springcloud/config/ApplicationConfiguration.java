package com.simple.springcloud.config;
import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王旻爽
 * 2021/2/22
 * @ClassName ApplicationConfiguration.java
 */
@Configuration
public class ApplicationConfiguration {
//    @Bean
//    public FilterRegistrationBean sentinelFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new CommonFilter());
//        registration.addUrlPatterns("/*");
//        // 入口资源关闭聚合
//        registration.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");
//        registration.setName("sentinelFilter");
//        registration.setOrder(1);
//        return registration;
//    }
}
