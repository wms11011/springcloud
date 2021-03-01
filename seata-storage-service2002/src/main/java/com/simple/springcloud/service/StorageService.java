package com.simple.springcloud.service;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName StorageService.java
 */
public interface StorageService {
    void decrease(Long productId,Integer count);
}
