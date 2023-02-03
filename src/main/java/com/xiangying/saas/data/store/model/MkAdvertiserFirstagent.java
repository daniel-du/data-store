package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkAdvertiserFirstagent {
    private String mkMediaAgentNo;

    private String mkAdvertiserMediaId;

    private String mkMediaInfoCode;

    private String mkMediaAgentCode;

    private Date mkMediaAgentDate;

    private String oaCompanyAccountCode;

    private Date mkMediaAgentCreatetm;

    private Date mkMediaAgentOperationtm;

    private Date mkMediaAgentModifytm;

    public String getMkMediaAgentNo() {
        return mkMediaAgentNo;
    }

    public void setMkMediaAgentNo(String mkMediaAgentNo) {
        this.mkMediaAgentNo = mkMediaAgentNo == null ? null : mkMediaAgentNo.trim();
    }

    public String getMkAdvertiserMediaId() {
        return mkAdvertiserMediaId;
    }

    public void setMkAdvertiserMediaId(String mkAdvertiserMediaId) {
        this.mkAdvertiserMediaId = mkAdvertiserMediaId == null ? null : mkAdvertiserMediaId.trim();
    }

    public String getMkMediaInfoCode() {
        return mkMediaInfoCode;
    }

    public void setMkMediaInfoCode(String mkMediaInfoCode) {
        this.mkMediaInfoCode = mkMediaInfoCode == null ? null : mkMediaInfoCode.trim();
    }

    public String getMkMediaAgentCode() {
        return mkMediaAgentCode;
    }

    public void setMkMediaAgentCode(String mkMediaAgentCode) {
        this.mkMediaAgentCode = mkMediaAgentCode == null ? null : mkMediaAgentCode.trim();
    }

    public Date getMkMediaAgentDate() {
        return mkMediaAgentDate;
    }

    public void setMkMediaAgentDate(Date mkMediaAgentDate) {
        this.mkMediaAgentDate = mkMediaAgentDate;
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkMediaAgentCreatetm() {
        return mkMediaAgentCreatetm;
    }

    public void setMkMediaAgentCreatetm(Date mkMediaAgentCreatetm) {
        this.mkMediaAgentCreatetm = mkMediaAgentCreatetm;
    }

    public Date getMkMediaAgentOperationtm() {
        return mkMediaAgentOperationtm;
    }

    public void setMkMediaAgentOperationtm(Date mkMediaAgentOperationtm) {
        this.mkMediaAgentOperationtm = mkMediaAgentOperationtm;
    }

    public Date getMkMediaAgentModifytm() {
        return mkMediaAgentModifytm;
    }

    public void setMkMediaAgentModifytm(Date mkMediaAgentModifytm) {
        this.mkMediaAgentModifytm = mkMediaAgentModifytm;
    }
}