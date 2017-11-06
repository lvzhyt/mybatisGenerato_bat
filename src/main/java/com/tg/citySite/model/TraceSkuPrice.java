package com.tg.citySite.model;

import java.math.BigDecimal;
import java.util.Date;

public class TraceSkuPrice {
    private Long id;

    private Long itemId;

    private Long skuId;

    private Long areaId;

    private String areaName;

    private Integer areaNumber;

    private BigDecimal costPrice;

    private String createUser;

    private BigDecimal marketPrice;

    private Long maxNum;

    private Long miinNum;

    private BigDecimal sellPrice;

    private Long sellerId;

    private Long shopId;

    private String updateUser;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(Integer areaNumber) {
        this.areaNumber = areaNumber;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
    }

    public Long getMiinNum() {
        return miinNum;
    }

    public void setMiinNum(Long miinNum) {
        this.miinNum = miinNum;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}