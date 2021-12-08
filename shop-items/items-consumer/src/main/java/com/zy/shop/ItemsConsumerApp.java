package com.zy.shop;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ItemsConsumerApp
 * @Description TODO
 * @Author Zhang Yi
 * @Date 2021/11/29 15:09
 **/
@SpringBootApplication
@DubboComponentScan("com.zy.shop.controller")
public class ItemsConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemsConsumerApp.class);
    }
}
