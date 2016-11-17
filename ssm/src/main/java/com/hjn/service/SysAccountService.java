package com.hjn.service;


import com.github.pagehelper.PageInfo;
import com.hjn.entity.SysAccount;
import com.hjn.exception.CustomException;


public interface SysAccountService {

    void deleteByPrimaryKey(Long id);

    void insertSelective(SysAccount record);

    SysAccount selectByPrimaryKey(Long id);

    void updateByPrimaryKeySelective(SysAccount record);

    public void login(String loginName, String password) throws CustomException;
    
    public void register(SysAccount sysAccount);
    
    public PageInfo<SysAccount> selectByPaging(Integer pageNum, Integer paegSize);
}
