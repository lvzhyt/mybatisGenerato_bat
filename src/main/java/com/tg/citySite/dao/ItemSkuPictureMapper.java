package com.tg.citySite.dao;

import com.tg.citySite.model.ItemSkuPicture;

public interface ItemSkuPictureMapper {
    int deleteByPrimaryKey(Long pictureId);

    int insert(ItemSkuPicture record);

    int insertSelective(ItemSkuPicture record);

    ItemSkuPicture selectByPrimaryKey(Long pictureId);

    int updateByPrimaryKeySelective(ItemSkuPicture record);

    int updateByPrimaryKey(ItemSkuPicture record);
}