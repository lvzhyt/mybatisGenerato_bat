package com.tg.citySite.dao;

import com.tg.citySite.model.ItemAttribute;

public interface ItemAttributeMapper {
    int deleteByPrimaryKey(Long attrId);

    int insert(ItemAttribute record);

    int insertSelective(ItemAttribute record);

    ItemAttribute selectByPrimaryKey(Long attrId);

    int updateByPrimaryKeySelective(ItemAttribute record);

    int updateByPrimaryKey(ItemAttribute record);
}