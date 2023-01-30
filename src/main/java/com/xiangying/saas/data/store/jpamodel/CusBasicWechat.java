package com.xiangying.saas.data.store.jpamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户基础表
 */
@Entity
@Table(name = "cus_basic_wechat")
public class CusBasicWechat implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 客户unionID
     */
    @Id
    @Column(name = "CUS_basic_wechat_unionID")
    private String cusBasicWechatUnionid;

    /**
     * 性别（见基础分类：CUS002）
     */
    @Column(name = "CUS_basic_wechat_sex")
    private String cusBasicWechatSex;
    /**
     * 公众号openid
     */
    @Column(name = "CUS_basic_wechat_smailID")
    private String cusBasicWechatSmailid;

    /**
     * 是否关注公众号
     */
    @Column(name = "CUS_basic_wechat_subscribe")
    private Integer cusBasicWechatSubscribe;

    /**
     * 关注时间
     */
    @Column(name = "CUS_basic_wechat_subscribetm")
    private Date cusBasicWechatSubscribeTm;

    /**
     * 取关时间
     */
    @Column(name = "CUS_basic_wechat_unsubscribetm")
    private Date cusBasicWechatUnsubscribeTm;

    /**
     * 小程序openid
     */
    @Column(name = "CUS_basic_wechat_publicID")
    private String cusBasicWechatPublicid;

    /**
     * 步数活动小程序openid
     */
    @Column(name = "CUS_basic_wechat_step_publicID")
    private String cusBasicWechatStepPublicid;

    /**
     * 用户微信昵称
     */
    @Column(name = "CUS_basic_wechat_nickname")
    private String cusBasicWechatNickname;

    /**
     * 用户头像地址URL
     */
    @Column(name = "CUS_basic_wechat_headurl")
    private String cusBasicWechatHeadurl;

    /**
     * 国家
     */
    @Column(name = "CUS_basic_wechat_country")
    private String cusBasicWechatCountry;

    /**
     * 省
     */
    @Column(name = "CUS_basic_wechat_provice")
    private String cusBasicWechatProvice;

    /**
     * 市
     */
    @Column(name = "CUS_basic_wechat_city")
    private String cusBasicWechatCity;

    /**
     * 客户积分
     */
    @Column(name = "CUS_basic_wechat_points")
    private Integer cusBasicWechatPoints;

    /**
     * 用户关注的渠道来源
     */
    @Column(name = "CUS_basic_wechat_subscribe_scene")
    private String cusBasicWechatSubscribeScene;

    /**
     * 二维码扫码场景
     */
    @Column(name = "CUS_basic_wechat_qr_scene")
    private String cusBasicWechatQrScene;

    /**
     * 客户userid
     */
    @Column(name = "CUS_basic_info_no")
    private String cusBasicInfoNo;

    /**
     * 保单状态通知标识 0-否，1-是
     */
    @Column(name = "CUS_basic_wechat_noticestatus")
    private String cusBasicWechatNoticestatus;

    /**
     * 保费续费通知标识 0-否，1-是
     */
    @Column(name = "CUS_basic_wechat_expirestatus")
    private String cusBasicWechatExpirestatus;

    /**
     * 保险到期提醒标识 0-否，1-是
     */
    @Column(name = "CUS_basic_wechat_renewalstatus")
    private String cusBasicWechatRenewalstatus;

    /**
     * 批增保额提醒标识 0-否，1-是
     */
    @Column(name = "cus_basic_wechat_insuringStatus")
    private String cusBasicWechatInsuringStatus;

    /**
     * 批增保额提醒时间
     */
    @Column(name = "cus_basic_wechat_insuringtm")
    private Date cusBasicWechatInsuringTm;

    /**
     * 操作用户
     */
    @Column(name = "OA_company_Account_code")
    private String oaCompanyAccountCode;

    /**
     * 创建时间
     */
    @Column(name = "CUS_basic_wechat_CreateTM", nullable = false)
    private Date cusBasicWechatCreatetm;

    /**
     * 操作时间
     */
    @Column(name = "CUS_basic_wechat_OperationTM", nullable = false)
    private Date cusBasicWechatOperationtm;

    /**
     * 奖励金额
     */
    @Column(name = "CUS_basic_wechat_amount")
    private BigDecimal cusBasicWechatAmount;
    /**
     * 关注企微
     */
    @Column(name = "CUS_basic_wechat_oasubscribe")
    private String cusBasicWechatOasubscribe;

    public String getCusBasicWechatOasubscribe() {
        return cusBasicWechatOasubscribe;
    }

    public void setCusBasicWechatOasubscribe(String cusBasicWechatOasubscribe) {
        this.cusBasicWechatOasubscribe = cusBasicWechatOasubscribe;
    }

    public BigDecimal getCusBasicWechatAmount() {
        return cusBasicWechatAmount;
    }

    public void setCusBasicWechatAmount(BigDecimal cusBasicWechatAmount) {
        this.cusBasicWechatAmount = cusBasicWechatAmount;
    }

    /**
     * 性别（见基础分类：CUS002）
     */
    public String getCusBasicWechatSex() {
        return cusBasicWechatSex;
    }

    /**
     * 性别（见基础分类：CUS002）
     */
    public void setCusBasicWechatSex(String cusBasicWechatSex) {
        this.cusBasicWechatSex = cusBasicWechatSex;
    }

    /**
     * 公众号openid
     */
    public String getCusBasicWechatSmailid() {
        return cusBasicWechatSmailid;
    }

    /**
     * 公众号openid
     */
    public void setCusBasicWechatSmailid(String cusBasicWechatSmailid) {
        this.cusBasicWechatSmailid = cusBasicWechatSmailid;
    }

    /**
     * 小程序openid
     */
    public String getCusBasicWechatPublicid() {
        return cusBasicWechatPublicid;
    }

    /**
     * 小程序openid
     */
    public void setCusBasicWechatPublicid(String cusBasicWechatPublicid) {
        this.cusBasicWechatPublicid = cusBasicWechatPublicid;
    }

    /**
     * 步数活动小程序openid
     */
    public String getCusBasicWechatStepPublicid() {
        return cusBasicWechatStepPublicid;
    }

    /**
     * 步数活动小程序openid
     */
    public void setCusBasicWechatStepPublicid(String cusBasicWechatStepPublicid) {
        this.cusBasicWechatStepPublicid = cusBasicWechatStepPublicid;
    }

    /**
     * 客户unionID
     */
    public String getCusBasicWechatUnionid() {
        return cusBasicWechatUnionid;
    }

    /**
     * 客户unionID
     */
    public void setCusBasicWechatUnionid(String cusBasicWechatUnionid) {
        this.cusBasicWechatUnionid = cusBasicWechatUnionid;
    }

    /**
     * 用户微信昵称
     */
    public String getCusBasicWechatNickname() {
        return cusBasicWechatNickname;
    }

    /**
     * 用户微信昵称
     */
    public void setCusBasicWechatNickname(String cusBasicWechatNickname) {
        this.cusBasicWechatNickname = cusBasicWechatNickname;
    }

    /**
     * 用户头像地址URL
     */
    public String getCusBasicWechatHeadurl() {
        return cusBasicWechatHeadurl;
    }

    /**
     * 用户头像地址URL
     */
    public void setCusBasicWechatHeadurl(String cusBasicWechatHeadurl) {
        this.cusBasicWechatHeadurl = cusBasicWechatHeadurl;
    }

    /**
     * 国家
     */
    public String getCusBasicWechatCountry() {
        return cusBasicWechatCountry;
    }

    /**
     * 国家
     */
    public void setCusBasicWechatCountry(String cusBasicWechatCountry) {
        this.cusBasicWechatCountry = cusBasicWechatCountry;
    }

    /**
     * 省
     */
    public String getCusBasicWechatProvice() {
        return cusBasicWechatProvice;
    }

    /**
     * 省
     */
    public void setCusBasicWechatProvice(String cusBasicWechatProvice) {
        this.cusBasicWechatProvice = cusBasicWechatProvice;
    }

    /**
     * 市
     */
    public String getCusBasicWechatCity() {
        return cusBasicWechatCity;
    }

    /**
     * 市
     */
    public void setCusBasicWechatCity(String cusBasicWechatCity) {
        this.cusBasicWechatCity = cusBasicWechatCity;
    }

    public Integer getCusBasicWechatPoints() {
        return cusBasicWechatPoints;
    }

    public void setCusBasicWechatPoints(Integer cusBasicWechatPoints) {
        this.cusBasicWechatPoints = cusBasicWechatPoints;
    }

    /**
     * 操作用户
     */
    public String getOaCompanyAccountCode() {
        return oaCompanyAccountCode;
    }

    /**
     * 操作用户
     */
    public void setOaCompanyAccountCode(String oaCompanyAccountCode) {
        this.oaCompanyAccountCode = oaCompanyAccountCode;
    }

    public Date getCusBasicWechatCreatetm() {
        return cusBasicWechatCreatetm;
    }

    public void setCusBasicWechatCreatetm(Date cusBasicWechatCreatetm) {
        this.cusBasicWechatCreatetm = cusBasicWechatCreatetm;
    }

    public Date getCusBasicWechatOperationtm() {
        return cusBasicWechatOperationtm;
    }

    public void setCusBasicWechatOperationtm(Date cusBasicWechatOperationtm) {
        this.cusBasicWechatOperationtm = cusBasicWechatOperationtm;
    }

    public String getCusBasicInfoNo() {
        return cusBasicInfoNo;
    }

    public void setCusBasicInfoNo(String cusBasicInfoNo) {
        this.cusBasicInfoNo = cusBasicInfoNo;
    }

    public String getCusBasicWechatNoticestatus() {
        return cusBasicWechatNoticestatus;
    }

    public void setCusBasicWechatNoticestatus(String cusBasicWechatNoticestatus) {
        this.cusBasicWechatNoticestatus = cusBasicWechatNoticestatus;
    }

    public String getCusBasicWechatExpirestatus() {
        return cusBasicWechatExpirestatus;
    }

    public void setCusBasicWechatExpirestatus(String cusBasicWechatExpirestatus) {
        this.cusBasicWechatExpirestatus = cusBasicWechatExpirestatus;
    }

    public String getCusBasicWechatRenewalstatus() {
        return cusBasicWechatRenewalstatus;
    }

    public void setCusBasicWechatRenewalstatus(String cusBasicWechatRenewalstatus) {
        this.cusBasicWechatRenewalstatus = cusBasicWechatRenewalstatus;
    }

    public Integer getCusBasicWechatSubscribe() {
        return cusBasicWechatSubscribe;
    }

    public void setCusBasicWechatSubscribe(Integer cusBasicWechatSubscribe) {
        this.cusBasicWechatSubscribe = cusBasicWechatSubscribe;
    }

    public Date getCusBasicWechatSubscribeTm() {
        return cusBasicWechatSubscribeTm;
    }

    public void setCusBasicWechatSubscribeTm(Date cusBasicWechatSubscribeTm) {
        this.cusBasicWechatSubscribeTm = cusBasicWechatSubscribeTm;
    }

    public Date getCusBasicWechatUnsubscribeTm() {
        return cusBasicWechatUnsubscribeTm;
    }

    public void setCusBasicWechatUnsubscribeTm(Date cusBasicWechatUnsubscribeTm) {
        this.cusBasicWechatUnsubscribeTm = cusBasicWechatUnsubscribeTm;
    }

    public String getCusBasicWechatInsuringStatus() {
        return cusBasicWechatInsuringStatus;
    }

    public void setCusBasicWechatInsuringStatus(String cusBasicWechatInsuringStatus) {
        this.cusBasicWechatInsuringStatus = cusBasicWechatInsuringStatus;
    }

    public Date getCusBasicWechatInsuringTm() {
        return cusBasicWechatInsuringTm;
    }

    public void setCusBasicWechatInsuringTm(Date cusBasicWechatInsuringTm) {
        this.cusBasicWechatInsuringTm = cusBasicWechatInsuringTm;
    }

    public String getCusBasicWechatSubscribeScene() {
        return cusBasicWechatSubscribeScene;
    }

    public void setCusBasicWechatSubscribeScene(String cusBasicWechatSubscribeScene) {
        this.cusBasicWechatSubscribeScene = cusBasicWechatSubscribeScene;
    }

    public String getCusBasicWechatQrScene() {
        return cusBasicWechatQrScene;
    }

    public void setCusBasicWechatQrScene(String cusBasicWechatQrScene) {
        this.cusBasicWechatQrScene = cusBasicWechatQrScene;
    }
}