package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblIndicatorRule {
    private String wblIndicatorRuleId;

    private String wblIndicatorConfigId;

    private String wblPlanRuleUse;

    private String wblPlanRuleUsemust;

    private String wblPlanRuleUsedes;

    private String wblIndicatorRuleRepeat;

    private Date wblIndicatorRuleCreatetm;

    private Date wblIndicatorRuleModifytm;

    public String getWblIndicatorRuleId() {
        return wblIndicatorRuleId;
    }

    public void setWblIndicatorRuleId(String wblIndicatorRuleId) {
        this.wblIndicatorRuleId = wblIndicatorRuleId == null ? null : wblIndicatorRuleId.trim();
    }

    public String getWblIndicatorConfigId() {
        return wblIndicatorConfigId;
    }

    public void setWblIndicatorConfigId(String wblIndicatorConfigId) {
        this.wblIndicatorConfigId = wblIndicatorConfigId == null ? null : wblIndicatorConfigId.trim();
    }

    public String getWblPlanRuleUse() {
        return wblPlanRuleUse;
    }

    public void setWblPlanRuleUse(String wblPlanRuleUse) {
        this.wblPlanRuleUse = wblPlanRuleUse == null ? null : wblPlanRuleUse.trim();
    }

    public String getWblPlanRuleUsemust() {
        return wblPlanRuleUsemust;
    }

    public void setWblPlanRuleUsemust(String wblPlanRuleUsemust) {
        this.wblPlanRuleUsemust = wblPlanRuleUsemust == null ? null : wblPlanRuleUsemust.trim();
    }

    public String getWblPlanRuleUsedes() {
        return wblPlanRuleUsedes;
    }

    public void setWblPlanRuleUsedes(String wblPlanRuleUsedes) {
        this.wblPlanRuleUsedes = wblPlanRuleUsedes == null ? null : wblPlanRuleUsedes.trim();
    }

    public String getWblIndicatorRuleRepeat() {
        return wblIndicatorRuleRepeat;
    }

    public void setWblIndicatorRuleRepeat(String wblIndicatorRuleRepeat) {
        this.wblIndicatorRuleRepeat = wblIndicatorRuleRepeat == null ? null : wblIndicatorRuleRepeat.trim();
    }

    public Date getWblIndicatorRuleCreatetm() {
        return wblIndicatorRuleCreatetm;
    }

    public void setWblIndicatorRuleCreatetm(Date wblIndicatorRuleCreatetm) {
        this.wblIndicatorRuleCreatetm = wblIndicatorRuleCreatetm;
    }

    public Date getWblIndicatorRuleModifytm() {
        return wblIndicatorRuleModifytm;
    }

    public void setWblIndicatorRuleModifytm(Date wblIndicatorRuleModifytm) {
        this.wblIndicatorRuleModifytm = wblIndicatorRuleModifytm;
    }
}