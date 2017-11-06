package com.tg.citySite.dao;

import com.tg.citySite.model.ItemSku;

public interface ItemSkuMapper {
    int deleteByPrimaryKey(Long skuId);

    int insert(ItemSku record);

    int insertSelective(ItemSku record);

    ItemSku selectByPrimaryKey(Long skuId);

    int updateByPrimaryKeySelective(ItemSku record);

    int updateByPrimaryKey(ItemSku record);
}