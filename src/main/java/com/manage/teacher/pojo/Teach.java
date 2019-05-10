package com.manage.teacher.pojo;

public class Teach {
    /**
     * 时间
     */
    private String ttime;

    /**
     * 老师
     */
    private Integer tid;

    /**
     * 教室
     */
    private String tclass;

    /**
     * 时间
     * @return TTIME 时间
     */
    public String getTtime() {
        return ttime;
    }

    /**
     * 时间
     * @param ttime 时间
     */
    public void setTtime(String ttime) {
        this.ttime = ttime == null ? null : ttime.trim();
    }

    /**
     * 老师
     * @return TID 老师
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 老师
     * @param tid 老师
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * 教室
     * @return TCLASS 教室
     */
    public String getTclass() {
        return tclass;
    }

    /**
     * 教室
     * @param tclass 教室
     */
    public void setTclass(String tclass) {
        this.tclass = tclass == null ? null : tclass.trim();
    }
}