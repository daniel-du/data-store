package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaEmployeeReward {
    private String oaEmployeeRewardId;

    private String oaEmployeeInfoCode;

    private String oaEmployeeRewardName;

    private String oaEmployeeRewardDate;

    private Date oaEmployeeRewardCreatetm;

    private Date oaEmployeeRewardOperationtm;

    private Date oaEmployeeRewardModifytm;

    public String getOaEmployeeRewardId() {
        return oaEmployeeRewardId;
    }

    public void setOaEmployeeRewardId(String oaEmployeeRewardId) {
        this.oaEmployeeRewardId = oaEmployeeRewardId == null ? null : oaEmployeeRewardId.trim();
    }

    public String getOaEmployeeInfoCode() {
        return oaEmployeeInfoCode;
    }

    public void setOaEmployeeInfoCode(String oaEmployeeInfoCode) {
        this.oaEmployeeInfoCode = oaEmployeeInfoCode == null ? null : oaEmployeeInfoCode.trim();
    }

    public String getOaEmployeeRewardName() {
        return oaEmployeeRewardName;
    }

    public void setOaEmployeeRewardName(String oaEmployeeRewardName) {
        this.oaEmployeeRewardName = oaEmployeeRewardName == null ? null : oaEmployeeRewardName.trim();
    }

    public String getOaEmployeeRewardDate() {
        return oaEmployeeRewardDate;
    }

    public void setOaEmployeeRewardDate(String oaEmployeeRewardDate) {
        this.oaEmployeeRewardDate = oaEmployeeRewardDate == null ? null : oaEmployeeRewardDate.trim();
    }

    public Date getOaEmployeeRewardCreatetm() {
        return oaEmployeeRewardCreatetm;
    }

    public void setOaEmployeeRewardCreatetm(Date oaEmployeeRewardCreatetm) {
        this.oaEmployeeRewardCreatetm = oaEmployeeRewardCreatetm;
    }

    public Date getOaEmployeeRewardOperationtm() {
        return oaEmployeeRewardOperationtm;
    }

    public void setOaEmployeeRewardOperationtm(Date oaEmployeeRewardOperationtm) {
        this.oaEmployeeRewardOperationtm = oaEmployeeRewardOperationtm;
    }

    public Date getOaEmployeeRewardModifytm() {
        return oaEmployeeRewardModifytm;
    }

    public void setOaEmployeeRewardModifytm(Date oaEmployeeRewardModifytm) {
        this.oaEmployeeRewardModifytm = oaEmployeeRewardModifytm;
    }
}