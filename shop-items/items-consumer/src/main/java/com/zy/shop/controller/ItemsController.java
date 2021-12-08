package com.zy.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ItemsController
 * @Description TODO
 * @Author Zhang Yi
 * @Date 2021/11/29 15:11
 **/
@RestController
@RequestMapping("/items")
public class ItemsController {

    @Reference(interfaceName = "com.zy.shop.items.service.ItemsService")
    private ItemsService itemsService;
}
