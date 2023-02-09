package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaMerchantAccount {
    private String oaMerchantAccountNo;

    private String oaMerchantInfoNo;

    private String oaCompanyAccountNo;

    private Date oaMerchantAccountCreatetm;

    private Date oaMerchantAccountOperationtm;

    private Date oaMerchantAccountModifytm;

    public String getOaMerchantAccountNo() {
        return oaMerchantAccountNo;
    }

    public void setOaMerchantAccountNo(String oaMerchantAccountNo) {
        this.oaMerchantAccountNo = oaMerchantAccountNo == null ? null : oaMerchantAccountNo.trim();
    }

    public String getOaMerchantInfoNo() {
        return oaMerchantInfoNo;
    }

    public void setOaMerchantInfoNo(String oaMerchantInfoNo) {
        this.oaMerchantInfoNo = oaMerchantInfoNo == null ? null : oaMerchantInfoNo.trim();
    }

    public String getOaCompanyAccountNo() {
        return oaCompanyAccountNo;
    }

    public void setOaCompanyAccountNo(String oaCompanyAccountNo) {
        this.oaCompanyAccountNo = oaCompanyAccountNo == null ? null : oaCompanyAccountNo.trim();
    }

    public Date getOaMerchantAccountCreatetm() {
        return oaMerchantAccountCreatetm;
    }

    public void setOaMerchantAccountCreatetm(Date oaMerchantAccountCreatetm) {
        this.oaMerchantAccountCreatetm = oaMerchantAccountCreatetm;
    }

    public Date getOaMerchantAccountOperationtm() {
        return oaMerchantAccountOperationtm;
    }

    public void setOaMerchantAccountOperationtm(Date oaMerchantAccountOperationtm) {
        this.oaMerchantAccountOperationtm = oaMerchantAccountOperationtm;
    }

    public Date getOaMerchantAccountModifytm() {
        return oaMerchantAccountModifytm;
    }

    public void setOaMerchantAccountModifytm(Date oaMerchantAccountModifytm) {
        this.oaMerchantAccountModifytm = oaMerchantAccountModifytm;
    }
}