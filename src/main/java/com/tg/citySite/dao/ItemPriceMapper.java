package com.tg.citySite.dao;

import com.tg.citySite.model.ItemPrice;

public interface ItemPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemPrice record);

    int insertSelective(ItemPrice record);

    ItemPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemPrice record);

    int updateByPrimaryKey(ItemPrice record);
}