package com.tg.citySite.dao;

import com.tg.citySite.model.ItemPicture;

public interface ItemPictureMapper {
    int deleteByPrimaryKey(Long pictureId);

    int insert(ItemPicture record);

    int insertSelective(ItemPicture record);

    ItemPicture selectByPrimaryKey(Long pictureId);

    int updateByPrimaryKeySelective(ItemPicture record);

    int updateByPrimaryKey(ItemPicture record);
}