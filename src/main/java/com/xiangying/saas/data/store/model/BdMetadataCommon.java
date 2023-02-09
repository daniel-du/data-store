package com.xiangying.saas.data.store.model;

import java.math.BigDecimal;
import java.util.Date;

public class BdMetadataCommon {
    private String bdMetadataCommonCode;

    private String bdMetadataCommonParentCode;

    private String bdMetadataCommonChildCode;

    private String bdMetadataCommonData;

    private String bdMetadataCommonSpecial;

    private String bdMetadataCommonName;

    private String bdMetadataTypeCode;

    private String bdMetadataCommonEname;

    private String bdMetadataCommonRemark;

    private BigDecimal bdMetadataCommonMax;

    private BigDecimal bdMetadataCommonMin;

    private Integer bdMetadataCommonSequence;

    private String bdMetadataCommonState;

    private String oaCompanyAccountCode;

    private Date bdMetadataCommonOperationtm;

    private Date bdMetadataCommonModifytm;

    public String getBdMetadataCommonCode() {
        return bdMetadataCommonCode;
    }

    public void setBdMetadataCommonCode(String bdMetadataCommonCode) {
        this.bdMetadataCommonCode = bdMetadataCommonCode == null ? null : bdMetadataCommonCode.trim();
    }

    public String getBdMetadataCommonParentCode() {
        return bdMetadataCommonParentCode;
    }

    public void setBdMetadataCommonParentCode(String bdMetadataCommonParentCode) {
        this.bdMetadataCommonParentCode = bdMetadataCommonParentCode == null ? null : bdMetadataCommonParentCode.trim();
    }

    public String getBdMetadataCommonChildCode() {
        return bdMetadataCommonChildCode;
    }

    public void setBdMetadataCommonChildCode(String bdMetadataCommonChildCode) {
        this.bdMetadataCommonChildCode = bdMetadataCommonChildCode == null ? null : bdMetadataCommonChildCode.trim();
    }

    public String getBdMetadataCommonData() {
        return bdMetadataCommonData;
    }

    public void setBdMetadataCommonData(String bdMetadataCommonData) {
        this.bdMetadataCommonData = bdMetadataCommonData == null ? null : bdMetadataCommonData.trim();
    }

    public String getBdMetadataCommonSpecial() {
        return bdMetadataCommonSpecial;
    }

    public void setBdMetadataCommonSpecial(String bdMetadataCommonSpecial) {
        this.bdMetadataCommonSpecial = bdMetadataCommonSpecial == null ? null : bdMetadataCommonSpecial.trim();
    }

    public String getBdMetadataCommonName() {
        return bdMetadataCommonName;
    }

    public void setBdMetadataCommonName(String bdMetadataCommonName) {
        this.bdMetadataCommonName = bdMetadataCommonName == null ? null : bdMetadataCommonName.trim();
    }

    public String getBdMetadataTypeCode() {
        return bdMetadataTypeCode;
    }

    public void setBdMetadataTypeCode(String bdMetadataTypeCode) {
        this.bdMetadataTypeCode = bdMetadataTypeCode == null ? null : bdMetadataTypeCode.trim();
    }

    public String getBdMetadataCommonEname() {
        return bdMetadataCommonEname;
    }

    public void setBdMetadataCommonEname(String bdMetadataCommonEname) {
        this.bdMetadataCommonEname = bdMetadataCommonEname == null ? null : bdMetadataCommonEname.trim();
    }

    public String getBdMetadataCommonRemark() {
        return bdMetadataCommonRemark;
    }

    public void setBdMetadataCommonRemark(String bdMetadataCommonRemark) {
        this.bdMetadataCommonRemark = bdMetadataCommonRemark == null ? null : bdMetadataCommonRemark.trim();
    }

    public BigDecimal getBdMetadataCommonMax() {
        return bdMetadataCommonMax;
    }

    public void setBdMetadataCommonMax(BigDecimal bdMetadataCommonMax) {
        this.bdMetadataCommonMax = bdMetadataCommonMax;
    }

    public BigDecimal getBdMetadataCommonMin() {
        return bdMetadataCommonMin;
    }

    public void setBdMetadataCommonMin(BigDecimal bdMetadataCommonMin) {
        this.bdMetadataCommonMin = bdMetadataCommonMin;
    }

    public Integer getBdMetadataCommonSequence() {
        return bdMetadataCommonSequence;
    }

    public void setBdMetadataCommonSequence(Integer bdMetadataCommonSequence) {
        this.bdMetadataCommonSequence = bdMetadataCommonSequence;
    }

    public String getBdMetadataCommonState() {
        return bdMetadataCommonState;
    }

    public void setBdMetadataCommonState(String bdMetadataCommonState) {
        this.bdMetadataCommonState = bdMetadataCommonState == null ? null : bdMetadataCommonState.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getBdMetadataCommonOperationtm() {
        return bdMetadataCommonOperationtm;
    }

    public void setBdMetadataCommonOperationtm(Date bdMetadataCommonOperationtm) {
        this.bdMetadataCommonOperationtm = bdMetadataCommonOperationtm;
    }

    public Date getBdMetadataCommonModifytm() {
        return bdMetadataCommonModifytm;
    }

    public void setBdMetadataCommonModifytm(Date bdMetadataCommonModifytm) {
        this.bdMetadataCommonModifytm = bdMetadataCommonModifytm;
    }
}