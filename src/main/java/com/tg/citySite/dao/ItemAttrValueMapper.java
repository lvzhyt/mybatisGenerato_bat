package com.tg.citySite.dao;

import com.tg.citySite.model.ItemAttrValue;

public interface ItemAttrValueMapper {
    int deleteByPrimaryKey(Long valueId);

    int insert(ItemAttrValue record);

    int insertSelective(ItemAttrValue record);

    ItemAttrValue selectByPrimaryKey(Long valueId);

    int updateByPrimaryKeySelective(ItemAttrValue record);

    int updateByPrimaryKey(ItemAttrValue record);
}