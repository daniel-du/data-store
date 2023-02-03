package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblPlanHoliday {
    private Integer wblPlanHolidayId;

    private String wblPlanHolidayDay;

    private String wblPlanHolidayState;

    private Date wblPlanHolidayCreatetm;

    private Date wblPlanHolidayModifytm;

    public Integer getWblPlanHolidayId() {
        return wblPlanHolidayId;
    }

    public void setWblPlanHolidayId(Integer wblPlanHolidayId) {
        this.wblPlanHolidayId = wblPlanHolidayId;
    }

    public String getWblPlanHolidayDay() {
        return wblPlanHolidayDay;
    }

    public void setWblPlanHolidayDay(String wblPlanHolidayDay) {
        this.wblPlanHolidayDay = wblPlanHolidayDay == null ? null : wblPlanHolidayDay.trim();
    }

    public String getWblPlanHolidayState() {
        return wblPlanHolidayState;
    }

    public void setWblPlanHolidayState(String wblPlanHolidayState) {
        this.wblPlanHolidayState = wblPlanHolidayState == null ? null : wblPlanHolidayState.trim();
    }

    public Date getWblPlanHolidayCreatetm() {
        return wblPlanHolidayCreatetm;
    }

    public void setWblPlanHolidayCreatetm(Date wblPlanHolidayCreatetm) {
        this.wblPlanHolidayCreatetm = wblPlanHolidayCreatetm;
    }

    public Date getWblPlanHolidayModifytm() {
        return wblPlanHolidayModifytm;
    }

    public void setWblPlanHolidayModifytm(Date wblPlanHolidayModifytm) {
        this.wblPlanHolidayModifytm = wblPlanHolidayModifytm;
    }
}