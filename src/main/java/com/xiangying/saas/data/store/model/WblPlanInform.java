package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblPlanInform {
    private String wblPlanInformId;

    private String wblPlanConfigId;

    private String wblNoticeUserId;

    private String wblNoticeChannelId;

    private String wblPlanInformStatus;

    private Date wblPlanInformCreatetm;

    private Date wblPlanInformModifytm;

    public String getWblPlanInformId() {
        return wblPlanInformId;
    }

    public void setWblPlanInformId(String wblPlanInformId) {
        this.wblPlanInformId = wblPlanInformId == null ? null : wblPlanInformId.trim();
    }

    public String getWblPlanConfigId() {
        return wblPlanConfigId;
    }

    public void setWblPlanConfigId(String wblPlanConfigId) {
        this.wblPlanConfigId = wblPlanConfigId == null ? null : wblPlanConfigId.trim();
    }

    public String getWblNoticeUserId() {
        return wblNoticeUserId;
    }

    public void setWblNoticeUserId(String wblNoticeUserId) {
        this.wblNoticeUserId = wblNoticeUserId == null ? null : wblNoticeUserId.trim();
    }

    public String getWblNoticeChannelId() {
        return wblNoticeChannelId;
    }

    public void setWblNoticeChannelId(String wblNoticeChannelId) {
        this.wblNoticeChannelId = wblNoticeChannelId == null ? null : wblNoticeChannelId.trim();
    }

    public String getWblPlanInformStatus() {
        return wblPlanInformStatus;
    }

    public void setWblPlanInformStatus(String wblPlanInformStatus) {
        this.wblPlanInformStatus = wblPlanInformStatus == null ? null : wblPlanInformStatus.trim();
    }

    public Date getWblPlanInformCreatetm() {
        return wblPlanInformCreatetm;
    }

    public void setWblPlanInformCreatetm(Date wblPlanInformCreatetm) {
        this.wblPlanInformCreatetm = wblPlanInformCreatetm;
    }

    public Date getWblPlanInformModifytm() {
        return wblPlanInformModifytm;
    }

    public void setWblPlanInformModifytm(Date wblPlanInformModifytm) {
        this.wblPlanInformModifytm = wblPlanInformModifytm;
    }
}