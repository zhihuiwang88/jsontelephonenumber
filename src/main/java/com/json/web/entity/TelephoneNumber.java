package com.json.web.entity;

import java.sql.Timestamp;

public class TelephoneNumber {
    /**
     * 
     */
    protected Integer telephoneId;

    /**
     * 姓名
     */
    protected String name;

    /**
     * 
     */
    protected String teldesc;

    /**
     * 
     */
    protected String telnum;

    /**
     * 
     */
    protected String orderId;

    /**
     * 
     */
    protected String financialInformation;

    /**
     * 
     */
    protected String thirdParty;

    /**
     * 
     */
    protected String networkCredit;

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * telephone_number.telephone_id
     */
    public Integer getTelephoneId() {
        return telephoneId;
    }

    /**
     * telephone_number.telephone_id
     */
    public void setTelephoneId(Integer telephoneId) {
        this.telephoneId = telephoneId;
    }

    /**
     * telephone_number.name
     */
    public String getName() {
        return name;
    }

    /**
     * telephone_number.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * telephone_number.teldesc
     */
    public String getTeldesc() {
        return teldesc;
    }

    /**
     * telephone_number.teldesc
     */
    public void setTeldesc(String teldesc) {
        this.teldesc = teldesc == null ? null : teldesc.trim();
    }

    /**
     * telephone_number.telnum
     */
    public String getTelnum() {
        return telnum;
    }

    /**
     * telephone_number.telnum
     */
    public void setTelnum(String telnum) {
        this.telnum = telnum == null ? null : telnum.trim();
    }

    /**
     * telephone_number.order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * telephone_number.order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * telephone_number.financial_information
     */
    public String getFinancialInformation() {
        return financialInformation;
    }

    /**
     * telephone_number.financial_information
     */
    public void setFinancialInformation(String financialInformation) {
        this.financialInformation = financialInformation == null ? null : financialInformation.trim();
    }

    /**
     * telephone_number.third_party
     */
    public String getThirdParty() {
        return thirdParty;
    }

    /**
     * telephone_number.third_party
     */
    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty == null ? null : thirdParty.trim();
    }

    /**
     * telephone_number.network_credit
     */
    public String getNetworkCredit() {
        return networkCredit;
    }

    /**
     * telephone_number.network_credit
     */
    public void setNetworkCredit(String networkCredit) {
        this.networkCredit = networkCredit == null ? null : networkCredit.trim();
    }

    /**
     * telephone_number.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * telephone_number.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * telephone_number.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * telephone_number.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}