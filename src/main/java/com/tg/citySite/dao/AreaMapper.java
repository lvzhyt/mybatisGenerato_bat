package com.tg.citySite.dao;

import com.tg.citySite.model.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(Long areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Long areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}