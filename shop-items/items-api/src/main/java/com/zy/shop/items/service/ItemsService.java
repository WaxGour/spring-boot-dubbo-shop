package com.zy.shop.items.service;

import com.zy.shop.items.po.Items;
public interface ItemsService{


    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);

}
