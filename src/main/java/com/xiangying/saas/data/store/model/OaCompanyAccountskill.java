package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyAccountskill {
    private String oaCompanyAccountskillNo;

    private String oaCompanySkillCode;

    private String oaCompanyAccountCode;

    private String oaCompanyAccountCreatecode;

    private Date oaCompanyAccountskillCreatetm;

    private Date oaCompanyAccountskillOperationtm;

    private Date oaCompanyAccountskillModifytm;

    public String getOaCompanyAccountskillNo() {
        return oaCompanyAccountskillNo;
    }

    public void setOaCompanyAccountskillNo(String oaCompanyAccountskillNo) {
        this.oaCompanyAccountskillNo = oaCompanyAccountskillNo == null ? null : oaCompanyAccountskillNo.trim();
    }

    public String getOaCompanySkillCode() {
        return oaCompanySkillCode;
    }

    public void setOaCompanySkillCode(String oaCompanySkillCode) {
        this.oaCompanySkillCode = oaCompanySkillCode == null ? null : oaCompanySkillCode.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public String getOaCompanyAccountCreatecode() {
        return oaCompanyAccountCreatecode;
    }

    public void setOaCompanyAccountCreatecode(String oaCompanyAccountCreatecode) {
        this.oaCompanyAccountCreatecode = oaCompanyAccountCreatecode == null ? null : oaCompanyAccountCreatecode.trim();
    }

    public Date getOaCompanyAccountskillCreatetm() {
        return oaCompanyAccountskillCreatetm;
    }

    public void setOaCompanyAccountskillCreatetm(Date oaCompanyAccountskillCreatetm) {
        this.oaCompanyAccountskillCreatetm = oaCompanyAccountskillCreatetm;
    }

    public Date getOaCompanyAccountskillOperationtm() {
        return oaCompanyAccountskillOperationtm;
    }

    public void setOaCompanyAccountskillOperationtm(Date oaCompanyAccountskillOperationtm) {
        this.oaCompanyAccountskillOperationtm = oaCompanyAccountskillOperationtm;
    }

    public Date getOaCompanyAccountskillModifytm() {
        return oaCompanyAccountskillModifytm;
    }

    public void setOaCompanyAccountskillModifytm(Date oaCompanyAccountskillModifytm) {
        this.oaCompanyAccountskillModifytm = oaCompanyAccountskillModifytm;
    }
}