package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaCompanyPasswordconfig {
    private Integer oaCompanyId;

    private Integer oaCompanyPasswordLength;

    private Integer oaCompanyCharacterType;

    private Integer oaCompanyAccountLocked;

    private Integer oaCompanyAccountLockTime;

    private Integer oaCompanyPasswordValidity;

    private Integer oaCompanyAutomaticallyExits;

    private Date oaCompanyAccountOperationtm;

    private Date oaCompanyAccountModifytm;

    public Integer getOaCompanyId() {
        return oaCompanyId;
    }

    public void setOaCompanyId(Integer oaCompanyId) {
        this.oaCompanyId = oaCompanyId;
    }

    public Integer getOaCompanyPasswordLength() {
        return oaCompanyPasswordLength;
    }

    public void setOaCompanyPasswordLength(Integer oaCompanyPasswordLength) {
        this.oaCompanyPasswordLength = oaCompanyPasswordLength;
    }

    public Integer getOaCompanyCharacterType() {
        return oaCompanyCharacterType;
    }

    public void setOaCompanyCharacterType(Integer oaCompanyCharacterType) {
        this.oaCompanyCharacterType = oaCompanyCharacterType;
    }

    public Integer getOaCompanyAccountLocked() {
        return oaCompanyAccountLocked;
    }

    public void setOaCompanyAccountLocked(Integer oaCompanyAccountLocked) {
        this.oaCompanyAccountLocked = oaCompanyAccountLocked;
    }

    public Integer getOaCompanyAccountLockTime() {
        return oaCompanyAccountLockTime;
    }

    public void setOaCompanyAccountLockTime(Integer oaCompanyAccountLockTime) {
        this.oaCompanyAccountLockTime = oaCompanyAccountLockTime;
    }

    public Integer getOaCompanyPasswordValidity() {
        return oaCompanyPasswordValidity;
    }

    public void setOaCompanyPasswordValidity(Integer oaCompanyPasswordValidity) {
        this.oaCompanyPasswordValidity = oaCompanyPasswordValidity;
    }

    public Integer getOaCompanyAutomaticallyExits() {
        return oaCompanyAutomaticallyExits;
    }

    public void setOaCompanyAutomaticallyExits(Integer oaCompanyAutomaticallyExits) {
        this.oaCompanyAutomaticallyExits = oaCompanyAutomaticallyExits;
    }

    public Date getOaCompanyAccountOperationtm() {
        return oaCompanyAccountOperationtm;
    }

    public void setOaCompanyAccountOperationtm(Date oaCompanyAccountOperationtm) {
        this.oaCompanyAccountOperationtm = oaCompanyAccountOperationtm;
    }

    public Date getOaCompanyAccountModifytm() {
        return oaCompanyAccountModifytm;
    }

    public void setOaCompanyAccountModifytm(Date oaCompanyAccountModifytm) {
        this.oaCompanyAccountModifytm = oaCompanyAccountModifytm;
    }
}