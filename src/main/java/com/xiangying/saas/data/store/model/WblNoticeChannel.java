package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblNoticeChannel {
    private String wblNoticeChannelId;

    private String wblNoticeChannelName;

    private String wblNoticeChannelRemark;

    private String wblNoticeChannelAttribute1;

    private String wblNoticeChannelAttribute2;

    private String wblNoticeChannelAttribute3;

    private Integer wblNoticeChannelStatus;

    private Date wblNoticeChannelCreatetm;

    private Date wblNoticeChannelModifytm;

    public String getWblNoticeChannelId() {
        return wblNoticeChannelId;
    }

    public void setWblNoticeChannelId(String wblNoticeChannelId) {
        this.wblNoticeChannelId = wblNoticeChannelId == null ? null : wblNoticeChannelId.trim();
    }

    public String getWblNoticeChannelName() {
        return wblNoticeChannelName;
    }

    public void setWblNoticeChannelName(String wblNoticeChannelName) {
        this.wblNoticeChannelName = wblNoticeChannelName == null ? null : wblNoticeChannelName.trim();
    }

    public String getWblNoticeChannelRemark() {
        return wblNoticeChannelRemark;
    }

    public void setWblNoticeChannelRemark(String wblNoticeChannelRemark) {
        this.wblNoticeChannelRemark = wblNoticeChannelRemark == null ? null : wblNoticeChannelRemark.trim();
    }

    public String getWblNoticeChannelAttribute1() {
        return wblNoticeChannelAttribute1;
    }

    public void setWblNoticeChannelAttribute1(String wblNoticeChannelAttribute1) {
        this.wblNoticeChannelAttribute1 = wblNoticeChannelAttribute1 == null ? null : wblNoticeChannelAttribute1.trim();
    }

    public String getWblNoticeChannelAttribute2() {
        return wblNoticeChannelAttribute2;
    }

    public void setWblNoticeChannelAttribute2(String wblNoticeChannelAttribute2) {
        this.wblNoticeChannelAttribute2 = wblNoticeChannelAttribute2 == null ? null : wblNoticeChannelAttribute2.trim();
    }

    public String getWblNoticeChannelAttribute3() {
        return wblNoticeChannelAttribute3;
    }

    public void setWblNoticeChannelAttribute3(String wblNoticeChannelAttribute3) {
        this.wblNoticeChannelAttribute3 = wblNoticeChannelAttribute3 == null ? null : wblNoticeChannelAttribute3.trim();
    }

    public Integer getWblNoticeChannelStatus() {
        return wblNoticeChannelStatus;
    }

    public void setWblNoticeChannelStatus(Integer wblNoticeChannelStatus) {
        this.wblNoticeChannelStatus = wblNoticeChannelStatus;
    }

    public Date getWblNoticeChannelCreatetm() {
        return wblNoticeChannelCreatetm;
    }

    public void setWblNoticeChannelCreatetm(Date wblNoticeChannelCreatetm) {
        this.wblNoticeChannelCreatetm = wblNoticeChannelCreatetm;
    }

    public Date getWblNoticeChannelModifytm() {
        return wblNoticeChannelModifytm;
    }

    public void setWblNoticeChannelModifytm(Date wblNoticeChannelModifytm) {
        this.wblNoticeChannelModifytm = wblNoticeChannelModifytm;
    }
}