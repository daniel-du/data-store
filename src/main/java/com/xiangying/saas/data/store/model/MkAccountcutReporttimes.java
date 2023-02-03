package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkAccountcutReporttimes {
    private String mkAccountcutReporttimesCode;

    private String mkAccountCutCode;

    private String mkMarketurlReporttimesTime;

    private String mkMarketurlReporttimesState;

    private String oaCompanyAccountCode;

    private Date mkAccountcutReporttimesCreatetm;

    private Date mkAccountcutReporttimesModifytm;

    private Date mkMarketurlReporttimesOperationtm;

    public String getMkAccountcutReporttimesCode() {
        return mkAccountcutReporttimesCode;
    }

    public void setMkAccountcutReporttimesCode(String mkAccountcutReporttimesCode) {
        this.mkAccountcutReporttimesCode = mkAccountcutReporttimesCode == null ? null : mkAccountcutReporttimesCode.trim();
    }

    public String getMkAccountCutCode() {
        return mkAccountCutCode;
    }

    public void setMkAccountCutCode(String mkAccountCutCode) {
        this.mkAccountCutCode = mkAccountCutCode == null ? null : mkAccountCutCode.trim();
    }

    public String getMkMarketurlReporttimesTime() {
        return mkMarketurlReporttimesTime;
    }

    public void setMkMarketurlReporttimesTime(String mkMarketurlReporttimesTime) {
        this.mkMarketurlReporttimesTime = mkMarketurlReporttimesTime == null ? null : mkMarketurlReporttimesTime.trim();
    }

    public String getMkMarketurlReporttimesState() {
        return mkMarketurlReporttimesState;
    }

    public void setMkMarketurlReporttimesState(String mkMarketurlReporttimesState) {
        this.mkMarketurlReporttimesState = mkMarketurlReporttimesState == null ? null : mkMarketurlReporttimesState.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkAccountcutReporttimesCreatetm() {
        return mkAccountcutReporttimesCreatetm;
    }

    public void setMkAccountcutReporttimesCreatetm(Date mkAccountcutReporttimesCreatetm) {
        this.mkAccountcutReporttimesCreatetm = mkAccountcutReporttimesCreatetm;
    }

    public Date getMkAccountcutReporttimesModifytm() {
        return mkAccountcutReporttimesModifytm;
    }

    public void setMkAccountcutReporttimesModifytm(Date mkAccountcutReporttimesModifytm) {
        this.mkAccountcutReporttimesModifytm = mkAccountcutReporttimesModifytm;
    }

    public Date getMkMarketurlReporttimesOperationtm() {
        return mkMarketurlReporttimesOperationtm;
    }

    public void setMkMarketurlReporttimesOperationtm(Date mkMarketurlReporttimesOperationtm) {
        this.mkMarketurlReporttimesOperationtm = mkMarketurlReporttimesOperationtm;
    }
}