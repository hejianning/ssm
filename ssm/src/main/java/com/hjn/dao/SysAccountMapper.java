package com.hjn.dao;

import java.util.List;

import com.hjn.entity.SysAccount;

public interface SysAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_account
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_account
     *
     * @mbggenerated
     */
    int insert(SysAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_account
     *
     * @mbggenerated
     */
    int insertSelective(SysAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_account
     *
     * @mbggenerated
     */
    SysAccount selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysAccount record);
    
    public SysAccount selectByLoginName(String loginName);
    
    public List<SysAccount> selectAll();                            
}