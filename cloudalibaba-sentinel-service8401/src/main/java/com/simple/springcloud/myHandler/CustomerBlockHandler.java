package com.simple.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.simple.springcloud.entities.CommonResult;

/**
 * @author 王旻爽
 * 2021/2/23
 * @ClassName CustomerBlockHandler.java
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}
