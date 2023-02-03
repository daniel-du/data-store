package com.xiangying.saas.data.store.model;

import java.math.BigDecimal;
import java.util.Date;

public class MkMediaAgentDiscount {
    private String mkMediaAgentDiscountno;

    private String mkMediaInfoCode;

    private String mkAdvertiserInfoCompanybody;

    private String mkMediaAgentCode;

    private Date mkMediaAgentDiscountdate;

    private BigDecimal mkMediaAgentDiscountfactor;

    private String oaCompanyAccountCode;

    private Date mkMediaAgentCreatetm;

    private Date mkMediaAgentOperationtm;

    private Date mkMediaAgentModifytm;

    private String mkMediaAgentDiscountlevel;

    private String mkMediaAgentDiscountrebatetype;

    public String getMkMediaAgentDiscountno() {
        return mkMediaAgentDiscountno;
    }

    public void setMkMediaAgentDiscountno(String mkMediaAgentDiscountno) {
        this.mkMediaAgentDiscountno = mkMediaAgentDiscountno == null ? null : mkMediaAgentDiscountno.trim();
    }

    public String getMkMediaInfoCode() {
        return mkMediaInfoCode;
    }

    public void setMkMediaInfoCode(String mkMediaInfoCode) {
        this.mkMediaInfoCode = mkMediaInfoCode == null ? null : mkMediaInfoCode.trim();
    }

    public String getMkAdvertiserInfoCompanybody() {
        return mkAdvertiserInfoCompanybody;
    }

    public void setMkAdvertiserInfoCompanybody(String mkAdvertiserInfoCompanybody) {
        this.mkAdvertiserInfoCompanybody = mkAdvertiserInfoCompanybody == null ? null : mkAdvertiserInfoCompanybody.trim();
    }

    public String getMkMediaAgentCode() {
        return mkMediaAgentCode;
    }

    public void setMkMediaAgentCode(String mkMediaAgentCode) {
        this.mkMediaAgentCode = mkMediaAgentCode == null ? null : mkMediaAgentCode.trim();
    }

    public Date getMkMediaAgentDiscountdate() {
        return mkMediaAgentDiscountdate;
    }

    public void setMkMediaAgentDiscountdate(Date mkMediaAgentDiscountdate) {
        this.mkMediaAgentDiscountdate = mkMediaAgentDiscountdate;
    }

    public BigDecimal getMkMediaAgentDiscountfactor() {
        return mkMediaAgentDiscountfactor;
    }

    public void setMkMediaAgentDiscountfactor(BigDecimal mkMediaAgentDiscountfactor) {
        this.mkMediaAgentDiscountfactor = mkMediaAgentDiscountfactor;
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

    public String getMkMediaAgentDiscountlevel() {
        return mkMediaAgentDiscountlevel;
    }

    public void setMkMediaAgentDiscountlevel(String mkMediaAgentDiscountlevel) {
        this.mkMediaAgentDiscountlevel = mkMediaAgentDiscountlevel == null ? null : mkMediaAgentDiscountlevel.trim();
    }

    public String getMkMediaAgentDiscountrebatetype() {
        return mkMediaAgentDiscountrebatetype;
    }

    public void setMkMediaAgentDiscountrebatetype(String mkMediaAgentDiscountrebatetype) {
        this.mkMediaAgentDiscountrebatetype = mkMediaAgentDiscountrebatetype == null ? null : mkMediaAgentDiscountrebatetype.trim();
    }
}