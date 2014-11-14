package com.ustc.plan.dao;

import com.ustc.plan.entity.SimpleMan;

import java.util.List;

/**
 * Created by Rudy on 2014/10/14.
 */
public interface SimpleManDao {

    /**
     * 查找所有的小人
     * @return
     */
    List<SimpleMan> findAll();

    /**
     * 根据id查找TestEntity
     * @param id
     * @return
     */
    SimpleMan findById(int id);

    /**
     * 添加一个Entity
     * @param entity
     */
    int add(SimpleMan entity);

    /**
     * 删除TestEntity
     * @param entity
     */
    void remove(SimpleMan entity);
}
