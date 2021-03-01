package com.simple.springcloud.service.impl;

import com.simple.springcloud.dao.OrderDao;
import com.simple.springcloud.domain.Order;
import com.simple.springcloud.service.AccountService;
import com.simple.springcloud.service.OrderService;
import com.simple.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName OrderServiceImpl.java
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("----->开始新建订单");
        // 1 新建订单
        orderDao.create(order);

        log.info("----->订单微服务开始调用库存,做扣减count");
        // 2 减库存
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存,做扣减end");

        log.info("----->订单微服务开始调用账户,做扣减money");
        // 3 减余额
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户,做扣减end");

        // 4 修改订单状态,从0到1,1代表已经完成
        log.info("----->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("----->修改订单状态结束");

        log.info("----->successfully O(∩_∩)O哈哈~");
    }
}
