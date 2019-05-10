package com.manage.teacher.pojo;

public class Dept {
    /**
     * 部门号
     */
    private Integer deptid;

    /**
     * 部门名
     */
    private String deptname;

    /**
     * 部门地址
     */
    private String deptaddr;

    /**
     * 部门号
     * @return DEPTID 部门号
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 部门号
     * @param deptid 部门号
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * 部门名
     * @return DEPTNAME 部门名
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * 部门名
     * @param deptname 部门名
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * 部门地址
     * @return DEPTADDR 部门地址
     */
    public String getDeptaddr() {
        return deptaddr;
    }

    /**
     * 部门地址
     * @param deptaddr 部门地址
     */
    public void setDeptaddr(String deptaddr) {
        this.deptaddr = deptaddr == null ? null : deptaddr.trim();
    }
}