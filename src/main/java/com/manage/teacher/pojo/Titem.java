package com.manage.teacher.pojo;

import java.util.Date;

public class Titem {
    /**
     * 教师号
     */
    private Integer tid;

    /**
     * 项目号
     */
    private Integer itemid;

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 结束时间
     */
    private Date endtime;

    /**
     * 教师号
     * @return TID 教师号
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 教师号
     * @param tid 教师号
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

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
     * 开始时间
     * @return STARTTIME 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 开始时间
     * @param starttime 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 结束时间
     * @return ENDTIME 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 结束时间
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}