package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblPlanRule {
    private String wblPlanRuleId;

    private String wblPlanConfigId;

    private String wblPlanRuleParams;

    private Integer wblPlanRuleSort;

    private String wblPlanRuleUse;

    private String wblPlanRuleRemark;

    private Date wblPlanRuleCreatetm;

    private Date wblPlanRuleModifytm;

    public String getWblPlanRuleId() {
        return wblPlanRuleId;
    }

    public void setWblPlanRuleId(String wblPlanRuleId) {
        this.wblPlanRuleId = wblPlanRuleId == null ? null : wblPlanRuleId.trim();
    }

    public String getWblPlanConfigId() {
        return wblPlanConfigId;
    }

    public void setWblPlanConfigId(String wblPlanConfigId) {
        this.wblPlanConfigId = wblPlanConfigId == null ? null : wblPlanConfigId.trim();
    }

    public String getWblPlanRuleParams() {
        return wblPlanRuleParams;
    }

    public void setWblPlanRuleParams(String wblPlanRuleParams) {
        this.wblPlanRuleParams = wblPlanRuleParams == null ? null : wblPlanRuleParams.trim();
    }

    public Integer getWblPlanRuleSort() {
        return wblPlanRuleSort;
    }

    public void setWblPlanRuleSort(Integer wblPlanRuleSort) {
        this.wblPlanRuleSort = wblPlanRuleSort;
    }

    public String getWblPlanRuleUse() {
        return wblPlanRuleUse;
    }

    public void setWblPlanRuleUse(String wblPlanRuleUse) {
        this.wblPlanRuleUse = wblPlanRuleUse == null ? null : wblPlanRuleUse.trim();
    }

    public String getWblPlanRuleRemark() {
        return wblPlanRuleRemark;
    }

    public void setWblPlanRuleRemark(String wblPlanRuleRemark) {
        this.wblPlanRuleRemark = wblPlanRuleRemark == null ? null : wblPlanRuleRemark.trim();
    }

    public Date getWblPlanRuleCreatetm() {
        return wblPlanRuleCreatetm;
    }

    public void setWblPlanRuleCreatetm(Date wblPlanRuleCreatetm) {
        this.wblPlanRuleCreatetm = wblPlanRuleCreatetm;
    }

    public Date getWblPlanRuleModifytm() {
        return wblPlanRuleModifytm;
    }

    public void setWblPlanRuleModifytm(Date wblPlanRuleModifytm) {
        this.wblPlanRuleModifytm = wblPlanRuleModifytm;
    }
}