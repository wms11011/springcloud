package com.simple.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author 王旻爽
 * 2021/2/6
 * @ClassName LoadBalance.java
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
