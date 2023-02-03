package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblPlanCycle {
    private String wblPlanConfigId;

    private String wblNoticeInfoId;

    private Date wblPlanCycleCreatetm;

    public String getWblPlanConfigId() {
        return wblPlanConfigId;
    }

    public void setWblPlanConfigId(String wblPlanConfigId) {
        this.wblPlanConfigId = wblPlanConfigId == null ? null : wblPlanConfigId.trim();
    }

    public String getWblNoticeInfoId() {
        return wblNoticeInfoId;
    }

    public void setWblNoticeInfoId(String wblNoticeInfoId) {
        this.wblNoticeInfoId = wblNoticeInfoId == null ? null : wblNoticeInfoId.trim();
    }

    public Date getWblPlanCycleCreatetm() {
        return wblPlanCycleCreatetm;
    }

    public void setWblPlanCycleCreatetm(Date wblPlanCycleCreatetm) {
        this.wblPlanCycleCreatetm = wblPlanCycleCreatetm;
    }
}