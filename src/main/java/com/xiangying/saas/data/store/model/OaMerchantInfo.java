package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaMerchantInfo {
    private String oaMerchantInfoNo;

    private String oaMerchantInfoName;

    private String oaMerchantInfoStatus;

    private Date oaMerchantInfoCreatetm;

    private Date oaMerchantInfoOperationtm;

    private Date oaMerchantInfoModifytm;

    public String getOaMerchantInfoNo() {
        return oaMerchantInfoNo;
    }

    public void setOaMerchantInfoNo(String oaMerchantInfoNo) {
        this.oaMerchantInfoNo = oaMerchantInfoNo == null ? null : oaMerchantInfoNo.trim();
    }

    public String getOaMerchantInfoName() {
        return oaMerchantInfoName;
    }

    public void setOaMerchantInfoName(String oaMerchantInfoName) {
        this.oaMerchantInfoName = oaMerchantInfoName == null ? null : oaMerchantInfoName.trim();
    }

    public String getOaMerchantInfoStatus() {
        return oaMerchantInfoStatus;
    }

    public void setOaMerchantInfoStatus(String oaMerchantInfoStatus) {
        this.oaMerchantInfoStatus = oaMerchantInfoStatus == null ? null : oaMerchantInfoStatus.trim();
    }

    public Date getOaMerchantInfoCreatetm() {
        return oaMerchantInfoCreatetm;
    }

    public void setOaMerchantInfoCreatetm(Date oaMerchantInfoCreatetm) {
        this.oaMerchantInfoCreatetm = oaMerchantInfoCreatetm;
    }

    public Date getOaMerchantInfoOperationtm() {
        return oaMerchantInfoOperationtm;
    }

    public void setOaMerchantInfoOperationtm(Date oaMerchantInfoOperationtm) {
        this.oaMerchantInfoOperationtm = oaMerchantInfoOperationtm;
    }

    public Date getOaMerchantInfoModifytm() {
        return oaMerchantInfoModifytm;
    }

    public void setOaMerchantInfoModifytm(Date oaMerchantInfoModifytm) {
        this.oaMerchantInfoModifytm = oaMerchantInfoModifytm;
    }
}