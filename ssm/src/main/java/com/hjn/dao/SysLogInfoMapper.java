package com.hjn.dao;

import com.hjn.entity.SysLogInfo;

public interface SysLogInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_log_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_log_info
     *
     * @mbggenerated
     */
    int insert(SysLogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_log_info
     *
     * @mbggenerated
     */
    int insertSelective(SysLogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_log_info
     *
     * @mbggenerated
     */
    SysLogInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_log_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysLogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_log_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysLogInfo record);
}