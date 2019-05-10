package com.manage.teacher.dao;

import com.manage.teacher.pojo.Item;

public interface ItemMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Item record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Item record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Item selectByPrimaryKey(Integer itemid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Item record);
}