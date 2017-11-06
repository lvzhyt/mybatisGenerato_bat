package com.tg.citySite.dao;

import com.tg.citySite.model.ItemCategoryAttrValue;

public interface ItemCategoryAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemCategoryAttrValue record);

    int insertSelective(ItemCategoryAttrValue record);

    ItemCategoryAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemCategoryAttrValue record);

    int updateByPrimaryKey(ItemCategoryAttrValue record);
}