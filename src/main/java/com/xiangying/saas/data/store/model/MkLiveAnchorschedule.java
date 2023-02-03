package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkLiveAnchorschedule {
    private String mkLiveAnchorscheduleId;

    private String mkLiveScheduleId;

    private String mkLiveAnchorCode;

    private String oaCompanyAccountCode;

    private Date mkLiveScheduleCreatetm;

    private Date mkLiveScheduleOperationtm;

    private Date mkLiveScheduleModifytm;

    public String getMkLiveAnchorscheduleId() {
        return mkLiveAnchorscheduleId;
    }

    public void setMkLiveAnchorscheduleId(String mkLiveAnchorscheduleId) {
        this.mkLiveAnchorscheduleId = mkLiveAnchorscheduleId == null ? null : mkLiveAnchorscheduleId.trim();
    }

    public String getMkLiveScheduleId() {
        return mkLiveScheduleId;
    }

    public void setMkLiveScheduleId(String mkLiveScheduleId) {
        this.mkLiveScheduleId = mkLiveScheduleId == null ? null : mkLiveScheduleId.trim();
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