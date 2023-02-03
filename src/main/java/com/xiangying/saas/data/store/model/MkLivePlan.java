package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkLivePlan {
    private String mkLivePlanNo;

    private String mkLivePlanName;

    private String mkMediaLiveAccountid;

    private String mkMediaInfoCode;

    private String mkAdvertiserInfoCode;

    private String mkMediaAgentCode;

    private Date mkLivePlanBegintm;

    private Date mkLivePlanEndtm;

    private String mkLivePlanRemark;

    private String oaCompanyAccountCode;

    private Date mkLivePlanCreatetm;

    private Date mkLivePlanOperationtm;

    private Date mkLivePlanModifytm;

    public String getMkLivePlanNo() {
        return mkLivePlanNo;
    }

    public void setMkLivePlanNo(String mkLivePlanNo) {
        this.mkLivePlanNo = mkLivePlanNo == null ? null : mkLivePlanNo.trim();
    }

    public String getMkLivePlanName() {
        return mkLivePlanName;
    }

    public void setMkLivePlanName(String mkLivePlanName) {
        this.mkLivePlanName = mkLivePlanName == null ? null : mkLivePlanName.trim();
    }

    public String getMkMediaLiveAccountid() {
        return mkMediaLiveAccountid;
    }

    public void setMkMediaLiveAccountid(String mkMediaLiveAccountid) {
        this.mkMediaLiveAccountid = mkMediaLiveAccountid == null ? null : mkMediaLiveAccountid.trim();
    }

    public String getMkMediaInfoCode() {
        return mkMediaInfoCode;
    }

    public void setMkMediaInfoCode(String mkMediaInfoCode) {
        this.mkMediaInfoCode = mkMediaInfoCode == null ? null : mkMediaInfoCode.trim();
    }

    public String getMkAdvertiserInfoCode() {
        return mkAdvertiserInfoCode;
    }

    public void setMkAdvertiserInfoCode(String mkAdvertiserInfoCode) {
        this.mkAdvertiserInfoCode = mkAdvertiserInfoCode == null ? null : mkAdvertiserInfoCode.trim();
    }

    public String getMkMediaAgentCode() {
        return mkMediaAgentCode;
    }

    public void setMkMediaAgentCode(String mkMediaAgentCode) {
        this.mkMediaAgentCode = mkMediaAgentCode == null ? null : mkMediaAgentCode.trim();
    }

    public Date getMkLivePlanBegintm() {
        return mkLivePlanBegintm;
    }

    public void setMkLivePlanBegintm(Date mkLivePlanBegintm) {
        this.mkLivePlanBegintm = mkLivePlanBegintm;
    }

    public Date getMkLivePlanEndtm() {
        return mkLivePlanEndtm;
    }

    public void setMkLivePlanEndtm(Date mkLivePlanEndtm) {
        this.mkLivePlanEndtm = mkLivePlanEndtm;
    }

    public String getMkLivePlanRemark() {
        return mkLivePlanRemark;
    }

    public void setMkLivePlanRemark(String mkLivePlanRemark) {
        this.mkLivePlanRemark = mkLivePlanRemark == null ? null : mkLivePlanRemark.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkLivePlanCreatetm() {
        return mkLivePlanCreatetm;
    }

    public void setMkLivePlanCreatetm(Date mkLivePlanCreatetm) {
        this.mkLivePlanCreatetm = mkLivePlanCreatetm;
    }

    public Date getMkLivePlanOperationtm() {
        return mkLivePlanOperationtm;
    }

    public void setMkLivePlanOperationtm(Date mkLivePlanOperationtm) {
        this.mkLivePlanOperationtm = mkLivePlanOperationtm;
    }

    public Date getMkLivePlanModifytm() {
        return mkLivePlanModifytm;
    }

    public void setMkLivePlanModifytm(Date mkLivePlanModifytm) {
        this.mkLivePlanModifytm = mkLivePlanModifytm;
    }
}