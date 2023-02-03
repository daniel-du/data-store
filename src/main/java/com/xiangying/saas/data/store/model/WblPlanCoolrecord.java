package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblPlanCoolrecord {
    private String wblPlanCoolrecordId;

    private String wblPlanConfigId;

    private String wblBusinessInfoId;

    private String oaCompanyAccountCode;

    private Date wblPlanCoolrecordCreatetm;

    public String getWblPlanCoolrecordId() {
        return wblPlanCoolrecordId;
    }

    public void setWblPlanCoolrecordId(String wblPlanCoolrecordId) {
        this.wblPlanCoolrecordId = wblPlanCoolrecordId == null ? null : wblPlanCoolrecordId.trim();
    }

    public String getWblPlanConfigId() {
        return wblPlanConfigId;
    }

    public void setWblPlanConfigId(String wblPlanConfigId) {
        this.wblPlanConfigId = wblPlanConfigId == null ? null : wblPlanConfigId.trim();
    }

    public String getWblBusinessInfoId() {
        return wblBusinessInfoId;
    }

    public void setWblBusinessInfoId(String wblBusinessInfoId) {
        this.wblBusinessInfoId = wblBusinessInfoId == null ? null : wblBusinessInfoId.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getWblPlanCoolrecordCreatetm() {
        return wblPlanCoolrecordCreatetm;
    }

    public void setWblPlanCoolrecordCreatetm(Date wblPlanCoolrecordCreatetm) {
        this.wblPlanCoolrecordCreatetm = wblPlanCoolrecordCreatetm;
    }
}