package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkMediaInfo {
    private String mkMediaInfoCode;

    private String mkMediaInfoName;

    private String mkMediaInfoType;

    private String mkMediaInfoState;

    private String oaCompanyAccountCode;

    private Date mkMediaInfoCreatetm;

    private Date mkMediaInfoOperationtm;

    private Date mkMediaInfoModifytm;

    private String mkMediaInfoRemark;

    public String getMkMediaInfoCode() {
        return mkMediaInfoCode;
    }

    public void setMkMediaInfoCode(String mkMediaInfoCode) {
        this.mkMediaInfoCode = mkMediaInfoCode == null ? null : mkMediaInfoCode.trim();
    }

    public String getMkMediaInfoName() {
        return mkMediaInfoName;
    }

    public void setMkMediaInfoName(String mkMediaInfoName) {
        this.mkMediaInfoName = mkMediaInfoName == null ? null : mkMediaInfoName.trim();
    }

    public String getMkMediaInfoType() {
        return mkMediaInfoType;
    }

    public void setMkMediaInfoType(String mkMediaInfoType) {
        this.mkMediaInfoType = mkMediaInfoType == null ? null : mkMediaInfoType.trim();
    }

    public String getMkMediaInfoState() {
        return mkMediaInfoState;
    }

    public void setMkMediaInfoState(String mkMediaInfoState) {
        this.mkMediaInfoState = mkMediaInfoState == null ? null : mkMediaInfoState.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkMediaInfoCreatetm() {
        return mkMediaInfoCreatetm;
    }

    public void setMkMediaInfoCreatetm(Date mkMediaInfoCreatetm) {
        this.mkMediaInfoCreatetm = mkMediaInfoCreatetm;
    }

    public Date getMkMediaInfoOperationtm() {
        return mkMediaInfoOperationtm;
    }

    public void setMkMediaInfoOperationtm(Date mkMediaInfoOperationtm) {
        this.mkMediaInfoOperationtm = mkMediaInfoOperationtm;
    }

    public Date getMkMediaInfoModifytm() {
        return mkMediaInfoModifytm;
    }

    public void setMkMediaInfoModifytm(Date mkMediaInfoModifytm) {
        this.mkMediaInfoModifytm = mkMediaInfoModifytm;
    }

    public String getMkMediaInfoRemark() {
        return mkMediaInfoRemark;
    }

    public void setMkMediaInfoRemark(String mkMediaInfoRemark) {
        this.mkMediaInfoRemark = mkMediaInfoRemark == null ? null : mkMediaInfoRemark.trim();
    }
}