package com.manage.teacher.dao;

import com.manage.teacher.pojo.Teacher;

public interface TeacherMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Teacher record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Teacher record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Teacher selectByPrimaryKey(Integer tid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Teacher record);
}