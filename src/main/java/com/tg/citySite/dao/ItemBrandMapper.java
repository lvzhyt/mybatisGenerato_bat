package com.tg.citySite.dao;

import com.tg.citySite.model.ItemBrand;

public interface ItemBrandMapper {
    int deleteByPrimaryKey(Long barndId);

    int insert(ItemBrand record);

    int insertSelective(ItemBrand record);

    ItemBrand selectByPrimaryKey(Long barndId);

    int updateByPrimaryKeySelective(ItemBrand record);

    int updateByPrimaryKey(ItemBrand record);
}