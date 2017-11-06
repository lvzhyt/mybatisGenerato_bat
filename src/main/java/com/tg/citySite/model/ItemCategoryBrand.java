package com.tg.citySite.model;

import java.util.Date;

public class ItemCategoryBrand {
    private Long id;

    private Long brandId;

    private Long secondLevCatId;

    private Long thirdLevCatId;

    private Integer cbrandStatus;

    private Integer sortNumber;

    private Date created;

    private Date modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getSecondLevCatId() {
        return secondLevCatId;
    }

    public void setSecondLevCatId(Long secondLevCatId) {
        this.secondLevCatId = secondLevCatId;
    }

    public Long getThirdLevCatId() {
        return thirdLevCatId;
    }

    public void setThirdLevCatId(Long thirdLevCatId) {
        this.thirdLevCatId = thirdLevCatId;
    }

    public Integer getCbrandStatus() {
        return cbrandStatus;
    }

    public void setCbrandStatus(Integer cbrandStatus) {
        this.cbrandStatus = cbrandStatus;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
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