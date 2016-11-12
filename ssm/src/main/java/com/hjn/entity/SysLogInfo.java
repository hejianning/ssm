package com.hjn.entity;

import java.util.Date;

public class SysLogInfo {
    /**
     *主键ID
     */
    private Long id;

    /**
     *操作账号（微信账号）
     */
    private String operateAccount;

    /**
     *操作时间
     */
    private Date operateDateTime;

    /**
     *登陆时间
     */
    private Date loginDateTime;

    /**
     *登出时间
     */
    private Date logoutDateTime;

    /**
     *IP
     */
    private String ip;

    /**
     *
     */
    private Long accountId;

    /**
     *操作模块
     */
    private String operateModule;

    /**
     *操作类型
     */
    private String operateType;

    /**
     *操作内容
     */
    private String operateContent;

    /**
     *主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     *主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *操作账号（微信账号）
     */
    public String getOperateAccount() {
        return operateAccount;
    }

    /**
     *操作账号（微信账号）
     */
    public void setOperateAccount(String operateAccount) {
        this.operateAccount = operateAccount == null ? null : operateAccount.trim();
    }

    /**
     *操作时间
     */
    public Date getOperateDateTime() {
        return operateDateTime;
    }

    /**
     *操作时间
     */
    public void setOperateDateTime(Date operateDateTime) {
        this.operateDateTime = operateDateTime;
    }

    /**
     *登陆时间
     */
    public Date getLoginDateTime() {
        return loginDateTime;
    }

    /**
     *登陆时间
     */
    public void setLoginDateTime(Date loginDateTime) {
        this.loginDateTime = loginDateTime;
    }

    /**
     *登出时间
     */
    public Date getLogoutDateTime() {
        return logoutDateTime;
    }

    /**
     *登出时间
     */
    public void setLogoutDateTime(Date logoutDateTime) {
        this.logoutDateTime = logoutDateTime;
    }

    /**
     *IP
     */
    public String getIp() {
        return ip;
    }

    /**
     *IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     *
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     *
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     *操作模块
     */
    public String getOperateModule() {
        return operateModule;
    }

    /**
     *操作模块
     */
    public void setOperateModule(String operateModule) {
        this.operateModule = operateModule == null ? null : operateModule.trim();
    }

    /**
     *操作类型
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     *操作类型
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    /**
     *操作内容
     */
    public String getOperateContent() {
        return operateContent;
    }

    /**
     *操作内容
     */
    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent == null ? null : operateContent.trim();
    }
}