package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaAccountGroup {
    private String oaAccountGroupCode;

    private String oaAccountGroupName;

    private String oaAccountGroupDesc;

    private String oaAccountGroupState;

    private String oaCompanyAccountCode;

    private Date oaAccountGroupCreatetm;

    private Date oaAccountGroupModifytm;

    public String getOaAccountGroupCode() {
        return oaAccountGroupCode;
    }

    public void setOaAccountGroupCode(String oaAccountGroupCode) {
        this.oaAccountGroupCode = oaAccountGroupCode == null ? null : oaAccountGroupCode.trim();
    }

    public String getOaAccountGroupName() {
        return oaAccountGroupName;
    }

    public void setOaAccountGroupName(String oaAccountGroupName) {
        this.oaAccountGroupName = oaAccountGroupName == null ? null : oaAccountGroupName.trim();
    }

    public String getOaAccountGroupDesc() {
        return oaAccountGroupDesc;
    }

    public void setOaAccountGroupDesc(String oaAccountGroupDesc) {
        this.oaAccountGroupDesc = oaAccountGroupDesc == null ? null : oaAccountGroupDesc.trim();
    }

    public String getOaAccountGroupState() {
        return oaAccountGroupState;
    }

    public void setOaAccountGroupState(String oaAccountGroupState) {
        this.oaAccountGroupState = oaAccountGroupState == null ? null : oaAccountGroupState.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getOaAccountGroupCreatetm() {
        return oaAccountGroupCreatetm;
    }

    public void setOaAccountGroupCreatetm(Date oaAccountGroupCreatetm) {
        this.oaAccountGroupCreatetm = oaAccountGroupCreatetm;
    }

    public Date getOaAccountGroupModifytm() {
        return oaAccountGroupModifytm;
    }

    public void setOaAccountGroupModifytm(Date oaAccountGroupModifytm) {
        this.oaAccountGroupModifytm = oaAccountGroupModifytm;
    }
}