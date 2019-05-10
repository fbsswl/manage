package com.manage.teacher.pojo;

public class Teacher {
    /**
     * 教师编号
     */
    private Integer tid;

    /**
     * 教师名称
     */
    private String tname;

    /**
     * 教师性别
     */
    private String tsex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 毕业学校
     */
    private String school;

    /**
     * 职称
     */
    private Integer titleid;

    /**
     * 部门号
     */
    private Integer deptid;

    /**
     * 教师编号
     * @return TID 教师编号
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 教师编号
     * @param tid 教师编号
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * 教师名称
     * @return TNAME 教师名称
     */
    public String getTname() {
        return tname;
    }

    /**
     * 教师名称
     * @param tname 教师名称
     */
    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    /**
     * 教师性别
     * @return TSEX 教师性别
     */
    public String getTsex() {
        return tsex;
    }

    /**
     * 教师性别
     * @param tsex 教师性别
     */
    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    /**
     * 出生日期
     * @return BIRTHDAY 出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 联系方式
     * @return PHONE 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系方式
     * @param phone 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 毕业学校
     * @return SCHOOL 毕业学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 毕业学校
     * @param school 毕业学校
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * 职称
     * @return TITLEID 职称
     */
    public Integer getTitleid() {
        return titleid;
    }

    /**
     * 职称
     * @param titleid 职称
     */
    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

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
}