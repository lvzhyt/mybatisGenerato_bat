package com.tg.citySite.dao;

import com.tg.citySite.model.ItemCategory;

public interface ItemCategoryMapper {
    int deleteByPrimaryKey(Long categoryId);

    int insert(ItemCategory record);

    int insertSelective(ItemCategory record);

    ItemCategory selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(ItemCategory record);

    int updateByPrimaryKey(ItemCategory record);
}