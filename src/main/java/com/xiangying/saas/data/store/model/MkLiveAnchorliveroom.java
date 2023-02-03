package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkLiveAnchorliveroom {
    private String mkLiveAnchorliveroomId;

    private String mkLiveAnchorCode;

    private String mkMediaLiveCode;

    private String oaCompanyAccountCode;

    private Date mkLiveAnchorCreatetm;

    private Date mkLiveAnchorOperationtm;

    private Date mkLiveAnchorModifytm;

    public String getMkLiveAnchorliveroomId() {
        return mkLiveAnchorliveroomId;
    }

    public void setMkLiveAnchorliveroomId(String mkLiveAnchorliveroomId) {
        this.mkLiveAnchorliveroomId = mkLiveAnchorliveroomId == null ? null : mkLiveAnchorliveroomId.trim();
    }

    public String getMkLiveAnchorCode() {
        return mkLiveAnchorCode;
    }

    public void setMkLiveAnchorCode(String mkLiveAnchorCode) {
        this.mkLiveAnchorCode = mkLiveAnchorCode == null ? null : mkLiveAnchorCode.trim();
    }

    public String getMkMediaLiveCode() {
        return mkMediaLiveCode;
    }

    public void setMkMediaLiveCode(String mkMediaLiveCode) {
        this.mkMediaLiveCode = mkMediaLiveCode == null ? null : mkMediaLiveCode.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkLiveAnchorCreatetm() {
        return mkLiveAnchorCreatetm;
    }

    public void setMkLiveAnchorCreatetm(Date mkLiveAnchorCreatetm) {
        this.mkLiveAnchorCreatetm = mkLiveAnchorCreatetm;
    }

    public Date getMkLiveAnchorOperationtm() {
        return mkLiveAnchorOperationtm;
    }

    public void setMkLiveAnchorOperationtm(Date mkLiveAnchorOperationtm) {
        this.mkLiveAnchorOperationtm = mkLiveAnchorOperationtm;
    }

    public Date getMkLiveAnchorModifytm() {
        return mkLiveAnchorModifytm;
    }

    public void setMkLiveAnchorModifytm(Date mkLiveAnchorModifytm) {
        this.mkLiveAnchorModifytm = mkLiveAnchorModifytm;
    }
}