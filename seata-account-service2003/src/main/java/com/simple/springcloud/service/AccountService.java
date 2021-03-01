package com.simple.springcloud.service;

import java.math.BigDecimal;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName AccountService.java
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
