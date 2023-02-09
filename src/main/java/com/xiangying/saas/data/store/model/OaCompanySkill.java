package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanySkill {
    private String oaCompanySkillCode;

    private String oaCompanySkillName;

    private String obdChannelInfoCode;

    private String oaCompanySkillSuppliercode;

    private String oaCompanySkillSuppliername;

    private String oaCompanySkillStatus;

    private String oaCompanyAccountCode;

    private Date oaCompanySkillCreatetm;

    private Date oaCompanySkillOperationtm;

    private Date oaCompanySkillModifytm;

    public String getOaCompanySkillCode() {
        return oaCompanySkillCode;
    }

    public void setOaCompanySkillCode(String oaCompanySkillCode) {
        this.oaCompanySkillCode = oaCompanySkillCode == null ? null : oaCompanySkillCode.trim();
    }

    public String getOaCompanySkillName() {
        return oaCompanySkillName;
    }

    public void setOaCompanySkillName(String oaCompanySkillName) {
        this.oaCompanySkillName = oaCompanySkillName == null ? null : oaCompanySkillName.trim();
    }

    public String getObdChannelInfoCode() {
        return obdChannelInfoCode;
    }

    public void setObdChannelInfoCode(String obdChannelInfoCode) {
        this.obdChannelInfoCode = obdChannelInfoCode == null ? null : obdChannelInfoCode.trim();
    }

    public String getOaCompanySkillSuppliercode() {
        return oaCompanySkillSuppliercode;
    }

    public void setOaCompanySkillSuppliercode(String oaCompanySkillSuppliercode) {
        this.oaCompanySkillSuppliercode = oaCompanySkillSuppliercode == null ? null : oaCompanySkillSuppliercode.trim();
    }

    public String getOaCompanySkillSuppliername() {
        return oaCompanySkillSuppliername;
    }

    public void setOaCompanySkillSuppliername(String oaCompanySkillSuppliername) {
        this.oaCompanySkillSuppliername = oaCompanySkillSuppliername == null ? null : oaCompanySkillSuppliername.trim();
    }

    public String getOaCompanySkillStatus() {
        return oaCompanySkillStatus;
    }

    public void setOaCompanySkillStatus(String oaCompanySkillStatus) {
        this.oaCompanySkillStatus = oaCompanySkillStatus == null ? null : oaCompanySkillStatus.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getOaCompanySkillCreatetm() {
        return oaCompanySkillCreatetm;
    }

    public void setOaCompanySkillCreatetm(Date oaCompanySkillCreatetm) {
        this.oaCompanySkillCreatetm = oaCompanySkillCreatetm;
    }

    public Date getOaCompanySkillOperationtm() {
        return oaCompanySkillOperationtm;
    }

    public void setOaCompanySkillOperationtm(Date oaCompanySkillOperationtm) {
        this.oaCompanySkillOperationtm = oaCompanySkillOperationtm;
    }

    public Date getOaCompanySkillModifytm() {
        return oaCompanySkillModifytm;
    }

    public void setOaCompanySkillModifytm(Date oaCompanySkillModifytm) {
        this.oaCompanySkillModifytm = oaCompanySkillModifytm;
    }
}