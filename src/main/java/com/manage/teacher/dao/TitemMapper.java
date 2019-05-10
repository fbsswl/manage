package com.manage.teacher.dao;

import com.manage.teacher.pojo.Titem;

public interface TitemMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Titem record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Titem record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Titem selectByPrimaryKey(Integer tid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Titem record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Titem record);
}