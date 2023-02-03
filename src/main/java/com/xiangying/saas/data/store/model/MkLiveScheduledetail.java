package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkLiveScheduledetail {
    private String mkLiveScheduledetailId;

    private String mkLiveScheduleDate;

    private String mkLiveScheduleTime;

    private String mkMediaLiveCode;

    private String mkLiveAnchorCode;

    private String oaCompanyAccountCode;

    private Date mkLiveScheduleCreatetm;

    private Date mkLiveScheduleOperationtm;

    private Date mkLiveScheduleModifytm;

    public String getMkLiveScheduledetailId() {
        return mkLiveScheduledetailId;
    }

    public void setMkLiveScheduledetailId(String mkLiveScheduledetailId) {
        this.mkLiveScheduledetailId = mkLiveScheduledetailId == null ? null : mkLiveScheduledetailId.trim();
    }

    public String getMkLiveScheduleDate() {
        return mkLiveScheduleDate;
    }

    public void setMkLiveScheduleDate(String mkLiveScheduleDate) {
        this.mkLiveScheduleDate = mkLiveScheduleDate == null ? null : mkLiveScheduleDate.trim();
    }

    public String getMkLiveScheduleTime() {
        return mkLiveScheduleTime;
    }

    public void setMkLiveScheduleTime(String mkLiveScheduleTime) {
        this.mkLiveScheduleTime = mkLiveScheduleTime == null ? null : mkLiveScheduleTime.trim();
    }

    public String getMkMediaLiveCode() {
        return mkMediaLiveCode;
    }

    public void setMkMediaLiveCode(String mkMediaLiveCode) {
        this.mkMediaLiveCode = mkMediaLiveCode == null ? null : mkMediaLiveCode.trim();
    }

    public String getMkLiveAnchorCode() {
        return mkLiveAnchorCode;
    }

    public void setMkLiveAnchorCode(String mkLiveAnchorCode) {
        this.mkLiveAnchorCode = mkLiveAnchorCode == null ? null : mkLiveAnchorCode.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkLiveScheduleCreatetm() {
        return mkLiveScheduleCreatetm;
    }

    public void setMkLiveScheduleCreatetm(Date mkLiveScheduleCreatetm) {
        this.mkLiveScheduleCreatetm = mkLiveScheduleCreatetm;
    }

    public Date getMkLiveScheduleOperationtm() {
        return mkLiveScheduleOperationtm;
    }

    public void setMkLiveScheduleOperationtm(Date mkLiveScheduleOperationtm) {
        this.mkLiveScheduleOperationtm = mkLiveScheduleOperationtm;
    }

    public Date getMkLiveScheduleModifytm() {
        return mkLiveScheduleModifytm;
    }

    public void setMkLiveScheduleModifytm(Date mkLiveScheduleModifytm) {
        this.mkLiveScheduleModifytm = mkLiveScheduleModifytm;
    }
}