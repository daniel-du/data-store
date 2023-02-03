package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkAdvertiserMarketurldownflag {
    private String mkAdvertiserMarketurlId;

    private String mkAdvertiserMarketurlRequestno;

    private String mkAdvertiserMarketurlCode;

    private String mkAdvertiserMarketurlFlag;

    private String oaCompanyAccountCode;

    private Date mkAdvertiserMarketurlCreatetm;

    private Date mkAdvertiserMarketurlModifytm;

    public String getMkAdvertiserMarketurlId() {
        return mkAdvertiserMarketurlId;
    }

    public void setMkAdvertiserMarketurlId(String mkAdvertiserMarketurlId) {
        this.mkAdvertiserMarketurlId = mkAdvertiserMarketurlId == null ? null : mkAdvertiserMarketurlId.trim();
    }

    public String getMkAdvertiserMarketurlRequestno() {
        return mkAdvertiserMarketurlRequestno;
    }

    public void setMkAdvertiserMarketurlRequestno(String mkAdvertiserMarketurlRequestno) {
        this.mkAdvertiserMarketurlRequestno = mkAdvertiserMarketurlRequestno == null ? null : mkAdvertiserMarketurlRequestno.trim();
    }

    public String getMkAdvertiserMarketurlCode() {
        return mkAdvertiserMarketurlCode;
    }

    public void setMkAdvertiserMarketurlCode(String mkAdvertiserMarketurlCode) {
        this.mkAdvertiserMarketurlCode = mkAdvertiserMarketurlCode == null ? null : mkAdvertiserMarketurlCode.trim();
    }

    public String getMkAdvertiserMarketurlFlag() {
        return mkAdvertiserMarketurlFlag;
    }

    public void setMkAdvertiserMarketurlFlag(String mkAdvertiserMarketurlFlag) {
        this.mkAdvertiserMarketurlFlag = mkAdvertiserMarketurlFlag == null ? null : mkAdvertiserMarketurlFlag.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkAdvertiserMarketurlCreatetm() {
        return mkAdvertiserMarketurlCreatetm;
    }

    public void setMkAdvertiserMarketurlCreatetm(Date mkAdvertiserMarketurlCreatetm) {
        this.mkAdvertiserMarketurlCreatetm = mkAdvertiserMarketurlCreatetm;
    }

    public Date getMkAdvertiserMarketurlModifytm() {
        return mkAdvertiserMarketurlModifytm;
    }

    public void setMkAdvertiserMarketurlModifytm(Date mkAdvertiserMarketurlModifytm) {
        this.mkAdvertiserMarketurlModifytm = mkAdvertiserMarketurlModifytm;
    }
}