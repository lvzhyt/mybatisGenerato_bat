package com.tg.citySite.model;

import java.util.Date;

public class ItemBrand {
    private Long barndId;

    private String brandName;

    private String brandLogoUrl;

    private String brandKey;

    private Integer brandStaus;

    private Date created;

    private Date modified;

    public Long getBarndId() {
        return barndId;
    }

    public void setBarndId(Long barndId) {
        this.barndId = barndId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandLogoUrl() {
        return brandLogoUrl;
    }

    public void setBrandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl == null ? null : brandLogoUrl.trim();
    }

    public String getBrandKey() {
        return brandKey;
    }

    public void setBrandKey(String brandKey) {
        this.brandKey = brandKey == null ? null : brandKey.trim();
    }

    public Integer getBrandStaus() {
        return brandStaus;
    }

    public void setBrandStaus(Integer brandStaus) {
        this.brandStaus = brandStaus;
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