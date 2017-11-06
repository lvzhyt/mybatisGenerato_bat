package com.tg.citySite.dao;

import com.tg.citySite.model.TraceSkuPrice;

public interface TraceSkuPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TraceSkuPrice record);

    int insertSelective(TraceSkuPrice record);

    TraceSkuPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TraceSkuPrice record);

    int updateByPrimaryKey(TraceSkuPrice record);
}