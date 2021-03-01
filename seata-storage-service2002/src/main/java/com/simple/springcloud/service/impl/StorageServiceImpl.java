package com.simple.springcloud.service.impl;

import com.simple.springcloud.dao.StorageDao;
import com.simple.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName StorageServiceImpl.java
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("调用库存微服务开始");
        storageDao.decrease(productId, count);
        log.info("调用库存微服务结束");
    }
}
