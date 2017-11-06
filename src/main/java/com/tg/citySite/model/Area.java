package com.tg.citySite.model;

import java.util.Date;

public class Area {
    private Long areaId;

    private String areaName;

    private Integer level;

    private Integer areaState;

    private Date created;

    private Date modified;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAreaState() {
        return areaState;
    }

    public void setAreaState(Integer areaState) {
        this.areaState = areaState;
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