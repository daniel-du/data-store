package com.xiangying.saas.data.store.model;

import java.util.Date;

public class MkAdvertiserMaterialaudit {
    private String mkAdvertiserMaterialSignature;

    private String mkMaterialInfoRadicalness;

    private String mkMaterialLablebaseCode;

    private String mkMaterialLablebaseName;

    private String mkAdvertiserMaterialId;

    private String mkAdvertiserMaterialauditUsercode;

    private Date mkAdvertiserMaterialauditCrttime;

    private String mkMediaInfoCode;

    private String mkAdvertiserMediaId;

    private String mkAdvertiserMaterialauditState;

    public String getMkAdvertiserMaterialSignature() {
        return mkAdvertiserMaterialSignature;
    }

    public void setMkAdvertiserMaterialSignature(String mkAdvertiserMaterialSignature) {
        this.mkAdvertiserMaterialSignature = mkAdvertiserMaterialSignature == null ? null : mkAdvertiserMaterialSignature.trim();
    }

    public String getMkMaterialInfoRadicalness() {
        return mkMaterialInfoRadicalness;
    }

    public void setMkMaterialInfoRadicalness(String mkMaterialInfoRadicalness) {
        this.mkMaterialInfoRadicalness = mkMaterialInfoRadicalness == null ? null : mkMaterialInfoRadicalness.trim();
    }

    public String getMkMaterialLablebaseCode() {
        return mkMaterialLablebaseCode;
    }

    public void setMkMaterialLablebaseCode(String mkMaterialLablebaseCode) {
        this.mkMaterialLablebaseCode = mkMaterialLablebaseCode == null ? null : mkMaterialLablebaseCode.trim();
    }

    public String getMkMaterialLablebaseName() {
        return mkMaterialLablebaseName;
    }

    public void setMkMaterialLablebaseName(String mkMaterialLablebaseName) {
        this.mkMaterialLablebaseName = mkMaterialLablebaseName == null ? null : mkMaterialLablebaseName.trim();
    }

    public String getMkAdvertiserMaterialId() {
        return mkAdvertiserMaterialId;
    }

    public void setMkAdvertiserMaterialId(String mkAdvertiserMaterialId) {
        this.mkAdvertiserMaterialId = mkAdvertiserMaterialId == null ? null : mkAdvertiserMaterialId.trim();
    }

    public String getMkAdvertiserMaterialauditUsercode() {
        return mkAdvertiserMaterialauditUsercode;
    }

    public void setMkAdvertiserMaterialauditUsercode(String mkAdvertiserMaterialauditUsercode) {
        this.mkAdvertiserMaterialauditUsercode = mkAdvertiserMaterialauditUsercode == null ? null : mkAdvertiserMaterialauditUsercode.trim();
    }

    public Date getMkAdvertiserMaterialauditCrttime() {
        return mkAdvertiserMaterialauditCrttime;
    }

    public void setMkAdvertiserMaterialauditCrttime(Date mkAdvertiserMaterialauditCrttime) {
        this.mkAdvertiserMaterialauditCrttime = mkAdvertiserMaterialauditCrttime;
    }

    public String getMkMediaInfoCode() {
        return mkMediaInfoCode;
    }

    public void setMkMediaInfoCode(String mkMediaInfoCode) {
        this.mkMediaInfoCode = mkMediaInfoCode == null ? null : mkMediaInfoCode.trim();
    }

    public String getMkAdvertiserMediaId() {
        return mkAdvertiserMediaId;
    }

    public void setMkAdvertiserMediaId(String mkAdvertiserMediaId) {
        this.mkAdvertiserMediaId = mkAdvertiserMediaId == null ? null : mkAdvertiserMediaId.trim();
    }

    public String getMkAdvertiserMaterialauditState() {
        return mkAdvertiserMaterialauditState;
    }

    public void setMkAdvertiserMaterialauditState(String mkAdvertiserMaterialauditState) {
        this.mkAdvertiserMaterialauditState = mkAdvertiserMaterialauditState == null ? null : mkAdvertiserMaterialauditState.trim();
    }
}