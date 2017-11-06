package com.tg.citySite.dao;

import com.tg.citySite.model.ItemCategoryAttr;

public interface ItemCategoryAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemCategoryAttr record);

    int insertSelective(ItemCategoryAttr record);

    ItemCategoryAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemCategoryAttr record);

    int updateByPrimaryKey(ItemCategoryAttr record);
}