package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyAccountrole {
    private String oaCompanyAccountroleNo;

    private String oaCompanyAccountCode;

    private String oaCompanyFunctionCode;

    private String oaCompanyAccountCreatecode;

    private Date oaCompanyAccountroleOperationtm;

    private Date oaCompanyAccountroleModifytm;

    public String getOaCompanyAccountroleNo() {
        return oaCompanyAccountroleNo;
    }

    public void setOaCompanyAccountroleNo(String oaCompanyAccountroleNo) {
        this.oaCompanyAccountroleNo = oaCompanyAccountroleNo == null ? null : oaCompanyAccountroleNo.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
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

    public Date getOaCompanyAccountroleOperationtm() {
        return oaCompanyAccountroleOperationtm;
    }

    public void setOaCompanyAccountroleOperationtm(Date oaCompanyAccountroleOperationtm) {
        this.oaCompanyAccountroleOperationtm = oaCompanyAccountroleOperationtm;
    }

    public Date getOaCompanyAccountroleModifytm() {
        return oaCompanyAccountroleModifytm;
    }

    public void setOaCompanyAccountroleModifytm(Date oaCompanyAccountroleModifytm) {
        this.oaCompanyAccountroleModifytm = oaCompanyAccountroleModifytm;
    }
}