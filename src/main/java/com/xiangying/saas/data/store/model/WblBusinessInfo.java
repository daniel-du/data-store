package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblBusinessInfo {
    private String wblBusinessInfoId;

    private String wblPlanConfigId;

    private String wblBusinessInfoNotifyinfo;

    private String wblBusinessInfoWid;

    private Integer wblBusinessInfoStatus;

    private Date wblBusinessInfoCreatetm;

    private Date wblBusinessInfoModifytm;

    public String getWblBusinessInfoId() {
        return wblBusinessInfoId;
    }

    public void setWblBusinessInfoId(String wblBusinessInfoId) {
        this.wblBusinessInfoId = wblBusinessInfoId == null ? null : wblBusinessInfoId.trim();
    }

    public String getWblPlanConfigId() {
        return wblPlanConfigId;
    }

    public void setWblPlanConfigId(String wblPlanConfigId) {
        this.wblPlanConfigId = wblPlanConfigId == null ? null : wblPlanConfigId.trim();
    }

    public String getWblBusinessInfoNotifyinfo() {
        return wblBusinessInfoNotifyinfo;
    }

    public void setWblBusinessInfoNotifyinfo(String wblBusinessInfoNotifyinfo) {
        this.wblBusinessInfoNotifyinfo = wblBusinessInfoNotifyinfo == null ? null : wblBusinessInfoNotifyinfo.trim();
    }

    public String getWblBusinessInfoWid() {
        return wblBusinessInfoWid;
    }

    public void setWblBusinessInfoWid(String wblBusinessInfoWid) {
        this.wblBusinessInfoWid = wblBusinessInfoWid == null ? null : wblBusinessInfoWid.trim();
    }

    public Integer getWblBusinessInfoStatus() {
        return wblBusinessInfoStatus;
    }

    public void setWblBusinessInfoStatus(Integer wblBusinessInfoStatus) {
        this.wblBusinessInfoStatus = wblBusinessInfoStatus;
    }

    public Date getWblBusinessInfoCreatetm() {
        return wblBusinessInfoCreatetm;
    }

    public void setWblBusinessInfoCreatetm(Date wblBusinessInfoCreatetm) {
        this.wblBusinessInfoCreatetm = wblBusinessInfoCreatetm;
    }

    public Date getWblBusinessInfoModifytm() {
        return wblBusinessInfoModifytm;
    }

    public void setWblBusinessInfoModifytm(Date wblBusinessInfoModifytm) {
        this.wblBusinessInfoModifytm = wblBusinessInfoModifytm;
    }
}