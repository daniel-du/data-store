package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyFunction {
    private String oaCompanyFunctionCode;

    private String oaCompanyFunctionParentcode;

    private String oaCompanyFunctionName;

    private String oaCompanyFunctionRemark;

    private Integer oaCompanyFunctionSequence;

    private String oaCompanyFunctionIcon;

    private String oaCompanyFunctionType;

    private String oaCompanyFunctionState;

    private String oaCompanyFunctionPath;

    private String oaCompanyFunctionCreatecode;

    private Date oaCompanyFunctionOperationtm;

    private Date oaCompanyFunctionModifytm;

    public String getOaCompanyFunctionCode() {
        return oaCompanyFunctionCode;
    }

    public void setOaCompanyFunctionCode(String oaCompanyFunctionCode) {
        this.oaCompanyFunctionCode = oaCompanyFunctionCode == null ? null : oaCompanyFunctionCode.trim();
    }

    public String getOaCompanyFunctionParentcode() {
        return oaCompanyFunctionParentcode;
    }

    public void setOaCompanyFunctionParentcode(String oaCompanyFunctionParentcode) {
        this.oaCompanyFunctionParentcode = oaCompanyFunctionParentcode == null ? null : oaCompanyFunctionParentcode.trim();
    }

    public String getOaCompanyFunctionName() {
        return oaCompanyFunctionName;
    }

    public void setOaCompanyFunctionName(String oaCompanyFunctionName) {
        this.oaCompanyFunctionName = oaCompanyFunctionName == null ? null : oaCompanyFunctionName.trim();
    }

    public String getOaCompanyFunctionRemark() {
        return oaCompanyFunctionRemark;
    }

    public void setOaCompanyFunctionRemark(String oaCompanyFunctionRemark) {
        this.oaCompanyFunctionRemark = oaCompanyFunctionRemark == null ? null : oaCompanyFunctionRemark.trim();
    }

    public Integer getOaCompanyFunctionSequence() {
        return oaCompanyFunctionSequence;
    }

    public void setOaCompanyFunctionSequence(Integer oaCompanyFunctionSequence) {
        this.oaCompanyFunctionSequence = oaCompanyFunctionSequence;
    }

    public String getOaCompanyFunctionIcon() {
        return oaCompanyFunctionIcon;
    }

    public void setOaCompanyFunctionIcon(String oaCompanyFunctionIcon) {
        this.oaCompanyFunctionIcon = oaCompanyFunctionIcon == null ? null : oaCompanyFunctionIcon.trim();
    }

    public String getOaCompanyFunctionType() {
        return oaCompanyFunctionType;
    }

    public void setOaCompanyFunctionType(String oaCompanyFunctionType) {
        this.oaCompanyFunctionType = oaCompanyFunctionType == null ? null : oaCompanyFunctionType.trim();
    }

    public String getOaCompanyFunctionState() {
        return oaCompanyFunctionState;
    }

    public void setOaCompanyFunctionState(String oaCompanyFunctionState) {
        this.oaCompanyFunctionState = oaCompanyFunctionState == null ? null : oaCompanyFunctionState.trim();
    }

    public String getOaCompanyFunctionPath() {
        return oaCompanyFunctionPath;
    }

    public void setOaCompanyFunctionPath(String oaCompanyFunctionPath) {
        this.oaCompanyFunctionPath = oaCompanyFunctionPath == null ? null : oaCompanyFunctionPath.trim();
    }

    public String getOaCompanyFunctionCreatecode() {
        return oaCompanyFunctionCreatecode;
    }

    public void setOaCompanyFunctionCreatecode(String oaCompanyFunctionCreatecode) {
        this.oaCompanyFunctionCreatecode = oaCompanyFunctionCreatecode == null ? null : oaCompanyFunctionCreatecode.trim();
    }

    public Date getOaCompanyFunctionOperationtm() {
        return oaCompanyFunctionOperationtm;
    }

    public void setOaCompanyFunctionOperationtm(Date oaCompanyFunctionOperationtm) {
        this.oaCompanyFunctionOperationtm = oaCompanyFunctionOperationtm;
    }

    public Date getOaCompanyFunctionModifytm() {
        return oaCompanyFunctionModifytm;
    }

    public void setOaCompanyFunctionModifytm(Date oaCompanyFunctionModifytm) {
        this.oaCompanyFunctionModifytm = oaCompanyFunctionModifytm;
    }
}