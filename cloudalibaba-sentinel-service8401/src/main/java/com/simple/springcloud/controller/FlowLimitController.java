package com.simple.springcloud.controller;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.simple.springcloud.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author 王旻爽
 * 2021/2/22
 * @ClassName FlowLimitController.java
 */
@RestController
@Slf4j
public class FlowLimitController {

    @Resource
    private MessageService messageService;

    @GetMapping("/testA")
    public String testA() {
        log.info(Thread.currentThread().getName()+"\t"+"testA");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

    @GetMapping("/testC")
    public String testC() {
        return "testC" + messageService.message();
    }

    @GetMapping("/testD")
    public String testD() {
        return "testD" + messageService.message();
    }

    @GetMapping("/testE")
    public String testE() throws InterruptedException {
        return "testE" + messageService.serviceE();
    }

    @GetMapping("/testF")
    public String testF() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        log.info("test RT");
        return "test RT";
    }

    @GetMapping("/testG/get/{param}")
    public String testG(@PathVariable Integer param) {
        if (param >= 0) {
            log.info("successfully!!!");
            return "successfully!!!";
        } else {
            log.info("failed!!!");
            throw new RuntimeException("异常");
        }
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "--------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException e){
        return "--------deal_testHotKey";
    }



}
