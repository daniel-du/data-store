package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblIndicatorConfig {
    private String wblIndicatorConfigId;

    private String wblIndicatorConfigName;

    private Integer wblIndicatorConfigStatus;

    private String wblIndicatorConfigDepartmen;

    private String wblIndicatorConfigCool;

    private String wblIndicatorConfigAdd;

    private String wblIndicatorConfigType;

    private Date wblIndicatorConfigCreatetm;

    private Date wblIndicatorConfigModifytm;

    public String getWblIndicatorConfigId() {
        return wblIndicatorConfigId;
    }

    public void setWblIndicatorConfigId(String wblIndicatorConfigId) {
        this.wblIndicatorConfigId = wblIndicatorConfigId == null ? null : wblIndicatorConfigId.trim();
    }

    public String getWblIndicatorConfigName() {
        return wblIndicatorConfigName;
    }

    public void setWblIndicatorConfigName(String wblIndicatorConfigName) {
        this.wblIndicatorConfigName = wblIndicatorConfigName == null ? null : wblIndicatorConfigName.trim();
    }

    public Integer getWblIndicatorConfigStatus() {
        return wblIndicatorConfigStatus;
    }

    public void setWblIndicatorConfigStatus(Integer wblIndicatorConfigStatus) {
        this.wblIndicatorConfigStatus = wblIndicatorConfigStatus;
    }

    public String getWblIndicatorConfigDepartmen() {
        return wblIndicatorConfigDepartmen;
    }

    public void setWblIndicatorConfigDepartmen(String wblIndicatorConfigDepartmen) {
        this.wblIndicatorConfigDepartmen = wblIndicatorConfigDepartmen == null ? null : wblIndicatorConfigDepartmen.trim();
    }

    public String getWblIndicatorConfigCool() {
        return wblIndicatorConfigCool;
    }

    public void setWblIndicatorConfigCool(String wblIndicatorConfigCool) {
        this.wblIndicatorConfigCool = wblIndicatorConfigCool == null ? null : wblIndicatorConfigCool.trim();
    }

    public String getWblIndicatorConfigAdd() {
        return wblIndicatorConfigAdd;
    }

    public void setWblIndicatorConfigAdd(String wblIndicatorConfigAdd) {
        this.wblIndicatorConfigAdd = wblIndicatorConfigAdd == null ? null : wblIndicatorConfigAdd.trim();
    }

    public String getWblIndicatorConfigType() {
        return wblIndicatorConfigType;
    }

    public void setWblIndicatorConfigType(String wblIndicatorConfigType) {
        this.wblIndicatorConfigType = wblIndicatorConfigType == null ? null : wblIndicatorConfigType.trim();
    }

    public Date getWblIndicatorConfigCreatetm() {
        return wblIndicatorConfigCreatetm;
    }

    public void setWblIndicatorConfigCreatetm(Date wblIndicatorConfigCreatetm) {
        this.wblIndicatorConfigCreatetm = wblIndicatorConfigCreatetm;
    }

    public Date getWblIndicatorConfigModifytm() {
        return wblIndicatorConfigModifytm;
    }

    public void setWblIndicatorConfigModifytm(Date wblIndicatorConfigModifytm) {
        this.wblIndicatorConfigModifytm = wblIndicatorConfigModifytm;
    }
}