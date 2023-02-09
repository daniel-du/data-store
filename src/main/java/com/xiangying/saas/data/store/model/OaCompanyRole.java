package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyRole {
    private String oaCompanyRoleCode;

    private String oaCompanyRoleName;

    private String oaCompanyRoleRemark;

    private String oaCompanyRoleState;

    private String oaCompanyRoleCreatecode;

    private Date oaCompanyRoleOperationtm;

    private Date oaCompanyRoleModifytm;

    public String getOaCompanyRoleCode() {
        return oaCompanyRoleCode;
    }

    public void setOaCompanyRoleCode(String oaCompanyRoleCode) {
        this.oaCompanyRoleCode = oaCompanyRoleCode == null ? null : oaCompanyRoleCode.trim();
    }

    public String getOaCompanyRoleName() {
        return oaCompanyRoleName;
    }

    public void setOaCompanyRoleName(String oaCompanyRoleName) {
        this.oaCompanyRoleName = oaCompanyRoleName == null ? null : oaCompanyRoleName.trim();
    }

    public String getOaCompanyRoleRemark() {
        return oaCompanyRoleRemark;
    }

    public void setOaCompanyRoleRemark(String oaCompanyRoleRemark) {
        this.oaCompanyRoleRemark = oaCompanyRoleRemark == null ? null : oaCompanyRoleRemark.trim();
    }

    public String getOaCompanyRoleState() {
        return oaCompanyRoleState;
    }

    public void setOaCompanyRoleState(String oaCompanyRoleState) {
        this.oaCompanyRoleState = oaCompanyRoleState == null ? null : oaCompanyRoleState.trim();
    }

    public String getOaCompanyRoleCreatecode() {
        return oaCompanyRoleCreatecode;
    }

    public void setOaCompanyRoleCreatecode(String oaCompanyRoleCreatecode) {
        this.oaCompanyRoleCreatecode = oaCompanyRoleCreatecode == null ? null : oaCompanyRoleCreatecode.trim();
    }

    public Date getOaCompanyRoleOperationtm() {
        return oaCompanyRoleOperationtm;
    }

    public void setOaCompanyRoleOperationtm(Date oaCompanyRoleOperationtm) {
        this.oaCompanyRoleOperationtm = oaCompanyRoleOperationtm;
    }

    public Date getOaCompanyRoleModifytm() {
        return oaCompanyRoleModifytm;
    }

    public void setOaCompanyRoleModifytm(Date oaCompanyRoleModifytm) {
        this.oaCompanyRoleModifytm = oaCompanyRoleModifytm;
    }
}