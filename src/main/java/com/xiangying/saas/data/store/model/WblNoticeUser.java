package com.xiangying.saas.data.store.model;

import java.util.Date;

public class WblNoticeUser {
    private String wblNoticeUserId;

    private String wblNoticeUserName;

    private String wblNoticeUserMobile;

    private String wblNoticeUserWx;

    private String wblNoticeUserFlybook;

    private String wblNoticeUserEmail;

    private Integer wblNoticeUserStatus;

    private String wblIndicatorConfigDepartmen;

    private Date wblNoticeUserCreatetm;

    private Date wblNoticeUserModifytm;

    private String oaCompanyAccountCode;

    public String getWblNoticeUserId() {
        return wblNoticeUserId;
    }

    public void setWblNoticeUserId(String wblNoticeUserId) {
        this.wblNoticeUserId = wblNoticeUserId == null ? null : wblNoticeUserId.trim();
    }

    public String getWblNoticeUserName() {
        return wblNoticeUserName;
    }

    public void setWblNoticeUserName(String wblNoticeUserName) {
        this.wblNoticeUserName = wblNoticeUserName == null ? null : wblNoticeUserName.trim();
    }

    public String getWblNoticeUserMobile() {
        return wblNoticeUserMobile;
    }

    public void setWblNoticeUserMobile(String wblNoticeUserMobile) {
        this.wblNoticeUserMobile = wblNoticeUserMobile == null ? null : wblNoticeUserMobile.trim();
    }

    public String getWblNoticeUserWx() {
        return wblNoticeUserWx;
    }

    public void setWblNoticeUserWx(String wblNoticeUserWx) {
        this.wblNoticeUserWx = wblNoticeUserWx == null ? null : wblNoticeUserWx.trim();
    }

    public String getWblNoticeUserFlybook() {
        return wblNoticeUserFlybook;
    }

    public void setWblNoticeUserFlybook(String wblNoticeUserFlybook) {
        this.wblNoticeUserFlybook = wblNoticeUserFlybook == null ? null : wblNoticeUserFlybook.trim();
    }

    public String getWblNoticeUserEmail() {
        return wblNoticeUserEmail;
    }

    public void setWblNoticeUserEmail(String wblNoticeUserEmail) {
        this.wblNoticeUserEmail = wblNoticeUserEmail == null ? null : wblNoticeUserEmail.trim();
    }

    public Integer getWblNoticeUserStatus() {
        return wblNoticeUserStatus;
    }

    public void setWblNoticeUserStatus(Integer wblNoticeUserStatus) {
        this.wblNoticeUserStatus = wblNoticeUserStatus;
    }

    public String getWblIndicatorConfigDepartmen() {
        return wblIndicatorConfigDepartmen;
    }

    public void setWblIndicatorConfigDepartmen(String wblIndicatorConfigDepartmen) {
        this.wblIndicatorConfigDepartmen = wblIndicatorConfigDepartmen == null ? null : wblIndicatorConfigDepartmen.trim();
    }

    public Date getWblNoticeUserCreatetm() {
        return wblNoticeUserCreatetm;
    }

    public void setWblNoticeUserCreatetm(Date wblNoticeUserCreatetm) {
        this.wblNoticeUserCreatetm = wblNoticeUserCreatetm;
    }

    public Date getWblNoticeUserModifytm() {
        return wblNoticeUserModifytm;
    }

    public void setWblNoticeUserModifytm(Date wblNoticeUserModifytm) {
        this.wblNoticeUserModifytm = wblNoticeUserModifytm;
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }
}