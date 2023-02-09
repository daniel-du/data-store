package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyRolefunction {
    private String oaCompanyRolefunctionNo;

    private String oaCompanyRoleCode;

    private String oaCompanyFunctionCode;

    private String oaCompanyAccountCreatecode;

    private Date oaCompanyRolefunctionOperationtm;

    private Date oaCompanyRolefunctionModifytm;

    public String getOaCompanyRolefunctionNo() {
        return oaCompanyRolefunctionNo;
    }

    public void setOaCompanyRolefunctionNo(String oaCompanyRolefunctionNo) {
        this.oaCompanyRolefunctionNo = oaCompanyRolefunctionNo == null ? null : oaCompanyRolefunctionNo.trim();
    }

    public String getOaCompanyRoleCode() {
        return oaCompanyRoleCode;
    }

    public void setOaCompanyRoleCode(String oaCompanyRoleCode) {
        this.oaCompanyRoleCode = oaCompanyRoleCode == null ? null : oaCompanyRoleCode.trim();
    }

    public String getOaCompanyFunctionCode() {
        return oaCompanyFunctionCode;
    }

    public void setOaCompanyFunctionCode(String oaCompanyFunctionCode) {
        this.oaCompanyFunctionCode = oaCompanyFunctionCode == null ? null : oaCompanyFunctionCode.trim();
    }

    public String getOaCompanyAccountCreatecode() {
        return oaCompanyAccountCreatecode;
    }

    public void setOaCompanyAccountCreatecode(String oaCompanyAccountCreatecode) {
        this.oaCompanyAccountCreatecode = oaCompanyAccountCreatecode == null ? null : oaCompanyAccountCreatecode.trim();
    }

    public Date getOaCompanyRolefunctionOperationtm() {
        return oaCompanyRolefunctionOperationtm;
    }

    public void setOaCompanyRolefunctionOperationtm(Date oaCompanyRolefunctionOperationtm) {
        this.oaCompanyRolefunctionOperationtm = oaCompanyRolefunctionOperationtm;
    }

    public Date getOaCompanyRolefunctionModifytm() {
        return oaCompanyRolefunctionModifytm;
    }

    public void setOaCompanyRolefunctionModifytm(Date oaCompanyRolefunctionModifytm) {
        this.oaCompanyRolefunctionModifytm = oaCompanyRolefunctionModifytm;
    }
}