package com.manage.teacher.dao;

import com.manage.teacher.pojo.Title;

public interface TitleMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer titleid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Title record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Title record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Title selectByPrimaryKey(Integer titleid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Title record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Title record);
}