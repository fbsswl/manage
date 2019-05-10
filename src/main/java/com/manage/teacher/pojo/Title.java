package com.manage.teacher.pojo;

public class Title {
    /**
     * 职称号
     */
    private Integer titleid;

    /**
     * 职称姓名
     */
    private String titlename;

    /**
     * 职称号
     * @return TITLEID 职称号
     */
    public Integer getTitleid() {
        return titleid;
    }

    /**
     * 职称号
     * @param titleid 职称号
     */
    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    /**
     * 职称姓名
     * @return TITLENAME 职称姓名
     */
    public String getTitlename() {
        return titlename;
    }

    /**
     * 职称姓名
     * @param titlename 职称姓名
     */
    public void setTitlename(String titlename) {
        this.titlename = titlename == null ? null : titlename.trim();
    }
}