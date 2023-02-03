package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblNoticeInfo {
    private String wblNoticeInfoId;

    private String wblBusinessInfoId;

    private String wblPlanConfigId;

    private String wblBusinessInfoNotifyinfo;

    private String wblBusinessInfoWid;

    private Integer wblNoticeInfoStatus;

    private Date wblNoticeInfoCreatetm;

    private Date wblNoticeInfoModifytm;

    public String getWblNoticeInfoId() {
        return wblNoticeInfoId;
    }

    public void setWblNoticeInfoId(String wblNoticeInfoId) {
        this.wblNoticeInfoId = wblNoticeInfoId == null ? null : wblNoticeInfoId.trim();
    }

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

    public Integer getWblNoticeInfoStatus() {
        return wblNoticeInfoStatus;
    }

    public void setWblNoticeInfoStatus(Integer wblNoticeInfoStatus) {
        this.wblNoticeInfoStatus = wblNoticeInfoStatus;
    }

    public Date getWblNoticeInfoCreatetm() {
        return wblNoticeInfoCreatetm;
    }

    public void setWblNoticeInfoCreatetm(Date wblNoticeInfoCreatetm) {
        this.wblNoticeInfoCreatetm = wblNoticeInfoCreatetm;
    }

    public Date getWblNoticeInfoModifytm() {
        return wblNoticeInfoModifytm;
    }

    public void setWblNoticeInfoModifytm(Date wblNoticeInfoModifytm) {
        this.wblNoticeInfoModifytm = wblNoticeInfoModifytm;
    }
}