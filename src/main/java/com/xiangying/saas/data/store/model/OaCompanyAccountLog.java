package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyAccountLog {
    private String logId;

    private String oaCompanyAccountCode;

    private String oaCompanyEmployeeCode;

    private String oaCompanyEmployeeName;

    private String oaCompanyUserType;

    private String oaCompanyAccountPhonenumber;

    private String oaCompanyStatus;

    private String oaCompanyErrDes;

    private String oaCompanyLoginType;

    private String oaCompanyTxt1;

    private String oaCompanyTxt2;

    private String oaCompanyTxt3;

    private Date oaCompanyCreateTime;

    private Date oaCompanyUpdateTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public String getOaCompanyEmployeeCode() {
        return oaCompanyEmployeeCode;
    }

    public void setOaCompanyEmployeeCode(String oaCompanyEmployeeCode) {
        this.oaCompanyEmployeeCode = oaCompanyEmployeeCode == null ? null : oaCompanyEmployeeCode.trim();
    }

    public String getOaCompanyEmployeeName() {
        return oaCompanyEmployeeName;
    }

    public void setOaCompanyEmployeeName(String oaCompanyEmployeeName) {
        this.oaCompanyEmployeeName = oaCompanyEmployeeName == null ? null : oaCompanyEmployeeName.trim();
    }

    public String getOaCompanyUserType() {
        return oaCompanyUserType;
    }

    public void setOaCompanyUserType(String oaCompanyUserType) {
        this.oaCompanyUserType = oaCompanyUserType == null ? null : oaCompanyUserType.trim();
    }

    public String getOaCompanyAccountPhonenumber() {
        return oaCompanyAccountPhonenumber;
    }

    public void setOaCompanyAccountPhonenumber(String oaCompanyAccountPhonenumber) {
        this.oaCompanyAccountPhonenumber = oaCompanyAccountPhonenumber == null ? null : oaCompanyAccountPhonenumber.trim();
    }

    public String getOaCompanyStatus() {
        return oaCompanyStatus;
    }

    public void setOaCompanyStatus(String oaCompanyStatus) {
        this.oaCompanyStatus = oaCompanyStatus == null ? null : oaCompanyStatus.trim();
    }

    public String getOaCompanyErrDes() {
        return oaCompanyErrDes;
    }

    public void setOaCompanyErrDes(String oaCompanyErrDes) {
        this.oaCompanyErrDes = oaCompanyErrDes == null ? null : oaCompanyErrDes.trim();
    }

    public String getOaCompanyLoginType() {
        return oaCompanyLoginType;
    }

    public void setOaCompanyLoginType(String oaCompanyLoginType) {
        this.oaCompanyLoginType = oaCompanyLoginType == null ? null : oaCompanyLoginType.trim();
    }

    public String getOaCompanyTxt1() {
        return oaCompanyTxt1;
    }

    public void setOaCompanyTxt1(String oaCompanyTxt1) {
        this.oaCompanyTxt1 = oaCompanyTxt1 == null ? null : oaCompanyTxt1.trim();
    }

    public String getOaCompanyTxt2() {
        return oaCompanyTxt2;
    }

    public void setOaCompanyTxt2(String oaCompanyTxt2) {
        this.oaCompanyTxt2 = oaCompanyTxt2 == null ? null : oaCompanyTxt2.trim();
    }

    public String getOaCompanyTxt3() {
        return oaCompanyTxt3;
    }

    public void setOaCompanyTxt3(String oaCompanyTxt3) {
        this.oaCompanyTxt3 = oaCompanyTxt3 == null ? null : oaCompanyTxt3.trim();
    }

    public Date getOaCompanyCreateTime() {
        return oaCompanyCreateTime;
    }

    public void setOaCompanyCreateTime(Date oaCompanyCreateTime) {
        this.oaCompanyCreateTime = oaCompanyCreateTime;
    }

    public Date getOaCompanyUpdateTime() {
        return oaCompanyUpdateTime;
    }

    public void setOaCompanyUpdateTime(Date oaCompanyUpdateTime) {
        this.oaCompanyUpdateTime = oaCompanyUpdateTime;
    }
}