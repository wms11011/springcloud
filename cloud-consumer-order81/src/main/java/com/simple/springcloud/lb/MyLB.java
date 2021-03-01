package com.simple.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 王旻爽
 * 2021/2/6
 * @ClassName MyLB.java
 */
@Component
public class MyLB implements LoadBalance{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = atomicInteger.incrementAndGet();
        } while (!this.atomicInteger.compareAndSet(current,next));
        return next;
    }



    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
