package com.zy.shop.items;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName ItemsProviderApp
 * @Description TODO
 * @Author Zhang Yi
 * @Date 2021/11/29 11:50
 **/
@SpringBootApplication
@MapperScan("com.zy.shop.items.mapper")
@EnableTransactionManagement//事务管理
@DubboComponentScan("com.zy.shop.items.service.impl")
public class ItemsProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemsProviderApp.class);
    }
}
