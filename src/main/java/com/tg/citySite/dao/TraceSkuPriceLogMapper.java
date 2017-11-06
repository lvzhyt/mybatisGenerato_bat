package com.tg.citySite.dao;

import com.tg.citySite.model.TraceSkuPriceLog;

public interface TraceSkuPriceLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TraceSkuPriceLog record);

    int insertSelective(TraceSkuPriceLog record);

    TraceSkuPriceLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TraceSkuPriceLog record);

    int updateByPrimaryKey(TraceSkuPriceLog record);
}