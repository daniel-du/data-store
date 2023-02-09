package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaMerchantCompanybody {
    private String oaMerchantCompanybodyNo;

    private String oaMerchantInfoNo;

    private String mkAdvertiserInfoCompanybody;

    private Date oaMerchantCompanybodyCreatetm;

    private Date oaMerchantCompanybodyOperationtm;

    private Date oaMerchantCompanybodyModifytm;

    public String getOaMerchantCompanybodyNo() {
        return oaMerchantCompanybodyNo;
    }

    public void setOaMerchantCompanybodyNo(String oaMerchantCompanybodyNo) {
        this.oaMerchantCompanybodyNo = oaMerchantCompanybodyNo == null ? null : oaMerchantCompanybodyNo.trim();
    }

    public String getOaMerchantInfoNo() {
        return oaMerchantInfoNo;
    }

    public void setOaMerchantInfoNo(String oaMerchantInfoNo) {
        this.oaMerchantInfoNo = oaMerchantInfoNo == null ? null : oaMerchantInfoNo.trim();
    }

    public String getMkAdvertiserInfoCompanybody() {
        return mkAdvertiserInfoCompanybody;
    }

    public void setMkAdvertiserInfoCompanybody(String mkAdvertiserInfoCompanybody) {
        this.mkAdvertiserInfoCompanybody = mkAdvertiserInfoCompanybody == null ? null : mkAdvertiserInfoCompanybody.trim();
    }

    public Date getOaMerchantCompanybodyCreatetm() {
        return oaMerchantCompanybodyCreatetm;
    }

    public void setOaMerchantCompanybodyCreatetm(Date oaMerchantCompanybodyCreatetm) {
        this.oaMerchantCompanybodyCreatetm = oaMerchantCompanybodyCreatetm;
    }

    public Date getOaMerchantCompanybodyOperationtm() {
        return oaMerchantCompanybodyOperationtm;
    }

    public void setOaMerchantCompanybodyOperationtm(Date oaMerchantCompanybodyOperationtm) {
        this.oaMerchantCompanybodyOperationtm = oaMerchantCompanybodyOperationtm;
    }

    public Date getOaMerchantCompanybodyModifytm() {
        return oaMerchantCompanybodyModifytm;
    }

    public void setOaMerchantCompanybodyModifytm(Date oaMerchantCompanybodyModifytm) {
        this.oaMerchantCompanybodyModifytm = oaMerchantCompanybodyModifytm;
    }
}