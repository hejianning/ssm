package com.hjn.entity;

import java.util.Date;

public class SysAccount {
    /**
     *id
     */
    private Long id;

    /**
     *姓名
     */
    private String name;

    /**
     *密码
     */
    private String password;

    /**
     *
     */
    private String salt;

    /**
     *'状态   disabled：无效；  enabled：有效',
     */
    private String status;

    /**
     *注册时间
     */
    private Date registerDate;

    /**
     *登录名
     */
    private String loginName;

    /**
     *邮箱
     */
    private String email;

    /**
     *
     */
    private String telephone;

    /**
     *备注
     */
    private String desp;

    /**
     *如果账号的角色有cp，company_id代表公司id
     */
    private Integer companyId;

    /**
     *如果账号的角色有省份客服，province_id代表该省份id
     */
    private Integer provinceId;

    /**
     *id
     */
    public Long getId() {
        return id;
    }

    /**
     *id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *姓名
     */
    public String getName() {
        return name;
    }

    /**
     *姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *密码
     */
    public String getPassword() {
        return password;
    }

    /**
     *密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     *
     */
    public String getSalt() {
        return salt;
    }

    /**
     *
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     *'状态   disabled：无效；  enabled：有效',
     */
    public String getStatus() {
        return status;
    }

    /**
     *'状态   disabled：无效；  enabled：有效',
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     *注册时间
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     *注册时间
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     *登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     *登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     *邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     *邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     *
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     *
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     *备注
     */
    public String getDesp() {
        return desp;
    }

    /**
     *备注
     */
    public void setDesp(String desp) {
        this.desp = desp == null ? null : desp.trim();
    }

    /**
     *如果账号的角色有cp，company_id代表公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     *如果账号的角色有cp，company_id代表公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     *如果账号的角色有省份客服，province_id代表该省份id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     *如果账号的角色有省份客服，province_id代表该省份id
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}