package com.manage.teacher.dao;

import com.manage.teacher.pojo.Treword;

public interface TrewordMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer rewordid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Treword record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Treword record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Treword selectByPrimaryKey(Integer rewordid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Treword record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Treword record);
}