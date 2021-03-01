package com.simple.springcloud.controller;

import com.simple.springcloud.domain.CommonResult;
import com.simple.springcloud.domain.Storage;
import com.simple.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 王旻爽
 * 2021/2/24
 * @ClassName StorageController.java
 */
@Slf4j
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"库存调用成功");
    }
}
