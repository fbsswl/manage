package com.manage.teacher.dao;

import com.manage.teacher.pojo.ClassType;

public interface ClassTypeMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer typeid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(ClassType record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(ClassType record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    ClassType selectByPrimaryKey(Integer typeid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(ClassType record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(ClassType record);
}