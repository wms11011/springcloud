package com.simple.springcloud.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.simple.springcloud.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author 王旻爽
 * 2021/2/22
 * @ClassName MessageServiceImpl.java
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Override
    @SentinelResource(value = "message")
    public String message() {
        return "Success!!";
    }

    @Override
    @SentinelResource(value = "serviceE")
    public String serviceE() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return "*********** invoke serviceE *****";
    }
}
