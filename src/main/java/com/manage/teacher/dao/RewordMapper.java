package com.manage.teacher.dao;

import com.manage.teacher.pojo.Reword;

public interface RewordMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer rewordid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Reword record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Reword record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Reword selectByPrimaryKey(Integer rewordid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Reword record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Reword record);
}