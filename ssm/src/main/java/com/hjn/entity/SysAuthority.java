package com.hjn.entity;

public class SysAuthority {
    /**
     *id
     */
    private Long id;

    /**
     *权限名称
     */
    private String name;

    /**
     *权限英文书写
     */
    private String spell;

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
     *权限名称
     */
    public String getName() {
        return name;
    }

    /**
     *权限名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *权限英文书写
     */
    public String getSpell() {
        return spell;
    }

    /**
     *权限英文书写
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }
}