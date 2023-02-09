package com.xiangying.saas.data.store.model;

import java.math.BigDecimal;
import java.util.Date;

public class OaEmployeeContract {
    private String oaEmployeeContractId;

    private String oaEmployeeInfoCode;

    private String oaEmployeeContractCode;

    private String oaEmployeeContractStartdate;

    private String oaEmployeeContractEnddate;

    private BigDecimal oaEmployeeContractSalary;

    private String oaEmployeeContractUrl;

    private Date oaEmployeeContractCreatetm;

    private Date oaEmployeeContractOperationtm;

    private Date oaEmployeeContractModifytm;

    public String getOaEmployeeContractId() {
        return oaEmployeeContractId;
    }

    public void setOaEmployeeContractId(String oaEmployeeContractId) {
        this.oaEmployeeContractId = oaEmployeeContractId == null ? null : oaEmployeeContractId.trim();
    }

    public String getOaEmployeeInfoCode() {
        return oaEmployeeInfoCode;
    }

    public void setOaEmployeeInfoCode(String oaEmployeeInfoCode) {
        this.oaEmployeeInfoCode = oaEmployeeInfoCode == null ? null : oaEmployeeInfoCode.trim();
    }

    public String getOaEmployeeContractCode() {
        return oaEmployeeContractCode;
    }

    public void setOaEmployeeContractCode(String oaEmployeeContractCode) {
        this.oaEmployeeContractCode = oaEmployeeContractCode == null ? null : oaEmployeeContractCode.trim();
    }

    public String getOaEmployeeContractStartdate() {
        return oaEmployeeContractStartdate;
    }

    public void setOaEmployeeContractStartdate(String oaEmployeeContractStartdate) {
        this.oaEmployeeContractStartdate = oaEmployeeContractStartdate == null ? null : oaEmployeeContractStartdate.trim();
    }

    public String getOaEmployeeContractEnddate() {
        return oaEmployeeContractEnddate;
    }

    public void setOaEmployeeContractEnddate(String oaEmployeeContractEnddate) {
        this.oaEmployeeContractEnddate = oaEmployeeContractEnddate == null ? null : oaEmployeeContractEnddate.trim();
    }

    public BigDecimal getOaEmployeeContractSalary() {
        return oaEmployeeContractSalary;
    }

    public void setOaEmployeeContractSalary(BigDecimal oaEmployeeContractSalary) {
        this.oaEmployeeContractSalary = oaEmployeeContractSalary;
    }

    public String getOaEmployeeContractUrl() {
        return oaEmployeeContractUrl;
    }

    public void setOaEmployeeContractUrl(String oaEmployeeContractUrl) {
        this.oaEmployeeContractUrl = oaEmployeeContractUrl == null ? null : oaEmployeeContractUrl.trim();
    }

    public Date getOaEmployeeContractCreatetm() {
        return oaEmployeeContractCreatetm;
    }

    public void setOaEmployeeContractCreatetm(Date oaEmployeeContractCreatetm) {
        this.oaEmployeeContractCreatetm = oaEmployeeContractCreatetm;
    }

    public Date getOaEmployeeContractOperationtm() {
        return oaEmployeeContractOperationtm;
    }

    public void setOaEmployeeContractOperationtm(Date oaEmployeeContractOperationtm) {
        this.oaEmployeeContractOperationtm = oaEmployeeContractOperationtm;
    }

    public Date getOaEmployeeContractModifytm() {
        return oaEmployeeContractModifytm;
    }

    public void setOaEmployeeContractModifytm(Date oaEmployeeContractModifytm) {
        this.oaEmployeeContractModifytm = oaEmployeeContractModifytm;
    }
}