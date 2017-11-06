package com.tg.citySite.dao;

import com.tg.citySite.model.ItemAttributeAttrValue;

public interface ItemAttributeAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemAttributeAttrValue record);

    int insertSelective(ItemAttributeAttrValue record);

    ItemAttributeAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemAttributeAttrValue record);

    int updateByPrimaryKey(ItemAttributeAttrValue record);
}