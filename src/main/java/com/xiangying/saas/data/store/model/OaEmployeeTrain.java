package com.xiangying.saas.data.store.model;

import java.util.Date;

public class OaEmployeeTrain {
    private String oaEmployeeTrainId;

    private String oaEmployeeInfoCode;

    private String oaEmployeeTrainName;

    private String oaEmployeeTrainDate;

    private Date oaEmployeeTrainCreatetm;

    private Date oaEmployeeTrainOperationtm;

    private Date oaEmployeeTrainModifytm;

    public String getOaEmployeeTrainId() {
        return oaEmployeeTrainId;
    }

    public void setOaEmployeeTrainId(String oaEmployeeTrainId) {
        this.oaEmployeeTrainId = oaEmployeeTrainId == null ? null : oaEmployeeTrainId.trim();
    }

    public String getOaEmployeeInfoCode() {
        return oaEmployeeInfoCode;
    }

    public void setOaEmployeeInfoCode(String oaEmployeeInfoCode) {
        this.oaEmployeeInfoCode = oaEmployeeInfoCode == null ? null : oaEmployeeInfoCode.trim();
    }

    public String getOaEmployeeTrainName() {
        return oaEmployeeTrainName;
    }

    public void setOaEmployeeTrainName(String oaEmployeeTrainName) {
        this.oaEmployeeTrainName = oaEmployeeTrainName == null ? null : oaEmployeeTrainName.trim();
    }

    public String getOaEmployeeTrainDate() {
        return oaEmployeeTrainDate;
    }

    public void setOaEmployeeTrainDate(String oaEmployeeTrainDate) {
        this.oaEmployeeTrainDate = oaEmployeeTrainDate == null ? null : oaEmployeeTrainDate.trim();
    }

    public Date getOaEmployeeTrainCreatetm() {
        return oaEmployeeTrainCreatetm;
    }

    public void setOaEmployeeTrainCreatetm(Date oaEmployeeTrainCreatetm) {
        this.oaEmployeeTrainCreatetm = oaEmployeeTrainCreatetm;
    }

    public Date getOaEmployeeTrainOperationtm() {
        return oaEmployeeTrainOperationtm;
    }

    public void setOaEmployeeTrainOperationtm(Date oaEmployeeTrainOperationtm) {
        this.oaEmployeeTrainOperationtm = oaEmployeeTrainOperationtm;
    }

    public Date getOaEmployeeTrainModifytm() {
        return oaEmployeeTrainModifytm;
    }

    public void setOaEmployeeTrainModifytm(Date oaEmployeeTrainModifytm) {
        this.oaEmployeeTrainModifytm = oaEmployeeTrainModifytm;
    }
}