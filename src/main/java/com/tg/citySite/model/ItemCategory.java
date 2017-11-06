package com.tg.citySite.model;

import java.util.Date;

public class ItemCategory {
    private Long categoryId;

    private String categoryName;

    private Integer lev;

    private Long parentCid;

    private Integer homeShow;

    private Integer sortNumber;

    private Integer staus;

    private Date created;

    private Date modified;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Integer getHomeShow() {
        return homeShow;
    }

    public void setHomeShow(Integer homeShow) {
        this.homeShow = homeShow;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getStaus() {
        return staus;
    }

    public void setStaus(Integer staus) {
        this.staus = staus;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}