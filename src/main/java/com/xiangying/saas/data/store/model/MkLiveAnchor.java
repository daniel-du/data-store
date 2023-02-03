package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkLiveAnchor {
    private String mkLiveAnchorCode;

    private String mkLiveAnchorName;

    private String mkLiveAnchorPhone;

    private String mkLiveAnchorStatus;

    private String oaCompanyAccountCode;

    private Date mkLiveAnchorCreatetm;

    private Date mkLiveAnchorOperationtm;

    private Date mkLiveAnchorModifytm;

    public String getMkLiveAnchorCode() {
        return mkLiveAnchorCode;
    }

    public void setMkLiveAnchorCode(String mkLiveAnchorCode) {
        this.mkLiveAnchorCode = mkLiveAnchorCode == null ? null : mkLiveAnchorCode.trim();
    }

    public String getMkLiveAnchorName() {
        return mkLiveAnchorName;
    }

    public void setMkLiveAnchorName(String mkLiveAnchorName) {
        this.mkLiveAnchorName = mkLiveAnchorName == null ? null : mkLiveAnchorName.trim();
    }

    public String getMkLiveAnchorPhone() {
        return mkLiveAnchorPhone;
    }

    public void setMkLiveAnchorPhone(String mkLiveAnchorPhone) {
        this.mkLiveAnchorPhone = mkLiveAnchorPhone == null ? null : mkLiveAnchorPhone.trim();
    }

    public String getMkLiveAnchorStatus() {
        return mkLiveAnchorStatus;
    }

    public void setMkLiveAnchorStatus(String mkLiveAnchorStatus) {
        this.mkLiveAnchorStatus = mkLiveAnchorStatus == null ? null : mkLiveAnchorStatus.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkLiveAnchorCreatetm() {
        return mkLiveAnchorCreatetm;
    }

    public void setMkLiveAnchorCreatetm(Date mkLiveAnchorCreatetm) {
        this.mkLiveAnchorCreatetm = mkLiveAnchorCreatetm;
    }

    public Date getMkLiveAnchorOperationtm() {
        return mkLiveAnchorOperationtm;
    }

    public void setMkLiveAnchorOperationtm(Date mkLiveAnchorOperationtm) {
        this.mkLiveAnchorOperationtm = mkLiveAnchorOperationtm;
    }

    public Date getMkLiveAnchorModifytm() {
        return mkLiveAnchorModifytm;
    }

    public void setMkLiveAnchorModifytm(Date mkLiveAnchorModifytm) {
        this.mkLiveAnchorModifytm = mkLiveAnchorModifytm;
    }
}