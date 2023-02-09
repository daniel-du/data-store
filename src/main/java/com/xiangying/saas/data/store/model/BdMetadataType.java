package com.xiangying.saas.data.store.model;

import java.util.Date;

public class BdMetadataType {
    private String bdMetadataTypeCode;

    private String bdMetadataTypeName;

    private String bdMetadataTypeField;

    private String bdMetadataTypeRemark;

    private String bdMetadataTypeState;

    private String oaCompanyAccountCode;

    private Date bdMetadataTypeOperationtm;

    private Date bdMetadataTypeModifytm;

    public String getBdMetadataTypeCode() {
        return bdMetadataTypeCode;
    }

    public void setBdMetadataTypeCode(String bdMetadataTypeCode) {
        this.bdMetadataTypeCode = bdMetadataTypeCode == null ? null : bdMetadataTypeCode.trim();
    }

    public String getBdMetadataTypeName() {
        return bdMetadataTypeName;
    }

    public void setBdMetadataTypeName(String bdMetadataTypeName) {
        this.bdMetadataTypeName = bdMetadataTypeName == null ? null : bdMetadataTypeName.trim();
    }

    public String getBdMetadataTypeField() {
        return bdMetadataTypeField;
    }

    public void setBdMetadataTypeField(String bdMetadataTypeField) {
        this.bdMetadataTypeField = bdMetadataTypeField == null ? null : bdMetadataTypeField.trim();
    }

    public String getBdMetadataTypeRemark() {
        return bdMetadataTypeRemark;
    }

    public void setBdMetadataTypeRemark(String bdMetadataTypeRemark) {
        this.bdMetadataTypeRemark = bdMetadataTypeRemark == null ? null : bdMetadataTypeRemark.trim();
    }

    public String getBdMetadataTypeState() {
        return bdMetadataTypeState;
    }

    public void setBdMetadataTypeState(String bdMetadataTypeState) {
        this.bdMetadataTypeState = bdMetadataTypeState == null ? null : bdMetadataTypeState.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getBdMetadataTypeOperationtm() {
        return bdMetadataTypeOperationtm;
    }

    public void setBdMetadataTypeOperationtm(Date bdMetadataTypeOperationtm) {
        this.bdMetadataTypeOperationtm = bdMetadataTypeOperationtm;
    }

    public Date getBdMetadataTypeModifytm() {
        return bdMetadataTypeModifytm;
    }

    public void setBdMetadataTypeModifytm(Date bdMetadataTypeModifytm) {
        this.bdMetadataTypeModifytm = bdMetadataTypeModifytm;
    }
}