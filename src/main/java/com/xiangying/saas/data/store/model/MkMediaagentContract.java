package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkMediaagentContract {
    private String mkMediaagentContractNo;

    private String mkMediaAgentCode;

    private String mkMediaInfoCode;

    private String mkMediaagentContractName;

    private String mkMediaagentContractRelationship;

    private String mkMediaagentContractAdress;

    private String oaCompanyAccountCode;

    private Date mkMediaInfoCreatetm;

    private Date mkMediaInfoOperationtm;

    private Date mkMediaInfoModifytm;

    public String getMkMediaagentContractNo() {
        return mkMediaagentContractNo;
    }

    public void setMkMediaagentContractNo(String mkMediaagentContractNo) {
        this.mkMediaagentContractNo = mkMediaagentContractNo == null ? null : mkMediaagentContractNo.trim();
    }

    public String getMkMediaAgentCode() {
        return mkMediaAgentCode;
    }

    public void setMkMediaAgentCode(String mkMediaAgentCode) {
        this.mkMediaAgentCode = mkMediaAgentCode == null ? null : mkMediaAgentCode.trim();
    }

    public String getMkMediaInfoCode() {
        return mkMediaInfoCode;
    }

    public void setMkMediaInfoCode(String mkMediaInfoCode) {
        this.mkMediaInfoCode = mkMediaInfoCode == null ? null : mkMediaInfoCode.trim();
    }

    public String getMkMediaagentContractName() {
        return mkMediaagentContractName;
    }

    public void setMkMediaagentContractName(String mkMediaagentContractName) {
        this.mkMediaagentContractName = mkMediaagentContractName == null ? null : mkMediaagentContractName.trim();
    }

    public String getMkMediaagentContractRelationship() {
        return mkMediaagentContractRelationship;
    }

    public void setMkMediaagentContractRelationship(String mkMediaagentContractRelationship) {
        this.mkMediaagentContractRelationship = mkMediaagentContractRelationship == null ? null : mkMediaagentContractRelationship.trim();
    }

    public String getMkMediaagentContractAdress() {
        return mkMediaagentContractAdress;
    }

    public void setMkMediaagentContractAdress(String mkMediaagentContractAdress) {
        this.mkMediaagentContractAdress = mkMediaagentContractAdress == null ? null : mkMediaagentContractAdress.trim();
    }

    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode == null ? null : oaCompanyAccountCode.trim();
    }

    public Date getMkMediaInfoCreatetm() {
        return mkMediaInfoCreatetm;
    }

    public void setMkMediaInfoCreatetm(Date mkMediaInfoCreatetm) {
        this.mkMediaInfoCreatetm = mkMediaInfoCreatetm;
    }

    public Date getMkMediaInfoOperationtm() {
        return mkMediaInfoOperationtm;
    }

    public void setMkMediaInfoOperationtm(Date mkMediaInfoOperationtm) {
        this.mkMediaInfoOperationtm = mkMediaInfoOperationtm;
    }

    public Date getMkMediaInfoModifytm() {
        return mkMediaInfoModifytm;
    }

    public void setMkMediaInfoModifytm(Date mkMediaInfoModifytm) {
        this.mkMediaInfoModifytm = mkMediaInfoModifytm;
    }
}