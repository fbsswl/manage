package com.manage.teacher.dao;

import com.manage.teacher.pojo.Dept;

public interface DeptMapper {
    /**
     *
     * @mbg.generated 2019-05-07
     */
    int deleteByPrimaryKey(Integer deptid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insert(Dept record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int insertSelective(Dept record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    Dept selectByPrimaryKey(Integer deptid);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     *
     * @mbg.generated 2019-05-07
     */
    int updateByPrimaryKey(Dept record);
}