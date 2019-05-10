package com.manage.teacher.pojo;

import java.util.Date;

public class Reword {
    /**
     * 奖项号
     */
    private Integer rewordid;

    /**
     * 奖项名称
     */
    private String rewordname;

    /**
     * 授奖部门
     */
    private Integer deptid;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 时间
     */
    private Date time;

    /**
     * 奖项号
     * @return REWORDID 奖项号
     */
    public Integer getRewordid() {
        return rewordid;
    }

    /**
     * 奖项号
     * @param rewordid 奖项号
     */
    public void setRewordid(Integer rewordid) {
        this.rewordid = rewordid;
    }

    /**
     * 奖项名称
     * @return REWORDNAME 奖项名称
     */
    public String getRewordname() {
        return rewordname;
    }

    /**
     * 奖项名称
     * @param rewordname 奖项名称
     */
    public void setRewordname(String rewordname) {
        this.rewordname = rewordname == null ? null : rewordname.trim();
    }

    /**
     * 授奖部门
     * @return DEPTID 授奖部门
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 授奖部门
     * @param deptid 授奖部门
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * 级别
     * @return LEVEL 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 级别
     * @param level 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 时间
     * @return TIME 时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 时间
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}