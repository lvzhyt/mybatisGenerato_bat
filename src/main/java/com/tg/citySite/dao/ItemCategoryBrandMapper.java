package com.tg.citySite.dao;

import com.tg.citySite.model.ItemCategoryBrand;

public interface ItemCategoryBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemCategoryBrand record);

    int insertSelective(ItemCategoryBrand record);

    ItemCategoryBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemCategoryBrand record);

    int updateByPrimaryKey(ItemCategoryBrand record);
}