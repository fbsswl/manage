package com.manage.teacher.pojo;

public class ClassType {
    /**
     * 类型号
     */
    private Integer typeid;

    /**
     * 类型名
     */
    private String typename;

    /**
     * 周数
     */
    private Integer weekcount;

    /**
     * 类型号
     * @return TYPEID 类型号
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * 类型号
     * @param typeid 类型号
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 类型名
     * @return TYPENAME 类型名
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 类型名
     * @param typename 类型名
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * 周数
     * @return WEEKCOUNT 周数
     */
    public Integer getWeekcount() {
        return weekcount;
    }

    /**
     * 周数
     * @param weekcount 周数
     */
    public void setWeekcount(Integer weekcount) {
        this.weekcount = weekcount;
    }
}