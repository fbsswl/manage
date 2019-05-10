package com.manage.teacher.pojo;

public class Item {
    /**
     * 项目号
     */
    private Integer itemid;

    /**
     * 项目名称
     */
    private String itemname;

    /**
     * 项目角色
     */
    private String itemrole;

    /**
     * 项目号
     * @return ITEMID 项目号
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 项目号
     * @param itemid 项目号
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * 项目名称
     * @return ITEMNAME 项目名称
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * 项目名称
     * @param itemname 项目名称
     */
    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    /**
     * 项目角色
     * @return ITEMROLE 项目角色
     */
    public String getItemrole() {
        return itemrole;
    }

    /**
     * 项目角色
     * @param itemrole 项目角色
     */
    public void setItemrole(String itemrole) {
        this.itemrole = itemrole == null ? null : itemrole.trim();
    }
}