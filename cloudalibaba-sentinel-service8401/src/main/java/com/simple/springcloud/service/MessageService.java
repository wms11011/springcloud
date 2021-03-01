package com.simple.springcloud.service;

/**
 * @author 王旻爽
 * 2021/2/22
 * @ClassName MessageService.java
 */
public interface MessageService {
    public String message();

    public String serviceE() throws InterruptedException;
}
