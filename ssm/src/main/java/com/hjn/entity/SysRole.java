package com.hjn.entity;

public class SysRole {
    /**
     *id
     */
    private Long id;

    /**
     *角色值
     */
    private String name;

    /**
     *此字段已经无用
     */
    private String permissions;

    /**
     *角色名称描述
     */
    private String nameDesc;

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
     *角色值
     */
    public String getName() {
        return name;
    }

    /**
     *角色值
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *此字段已经无用
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     *此字段已经无用
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions == null ? null : permissions.trim();
    }

    /**
     *角色名称描述
     */
    public String getNameDesc() {
        return nameDesc;
    }

    /**
     *角色名称描述
     */
    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc == null ? null : nameDesc.trim();
    }
}