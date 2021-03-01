package com.simple.springcloud.lb;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 王旻爽
 * 2021/2/6
 * @ClassName Test.java
 */
public class Test {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (int i = 0; i < 20; i++) {
            int current = atomicInteger.get();
            System.out.println(current);
            int j = atomicInteger.incrementAndGet();
            System.out.println(j);
        }
    }
}
