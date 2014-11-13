package com.ustc.s2si.dao.impl;

import com.ustc.s2si.dao.SimpleManDao;
import com.ustc.s2si.entity.SimpleMan;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by Rudy on 2014/10/14.
 */
public class SimpleManDaoImpl extends SqlMapClientDaoSupport implements SimpleManDao {

    @Override
    public List<SimpleMan> findAll() {
        return getSqlMapClientTemplate().queryForList("findAll");
    }

    @Override
    public SimpleMan findById(int id) {
        return (SimpleMan)getSqlMapClientTemplate().queryForObject("findById", id);
    }

    @Override
    public int  add(SimpleMan man) {
        return (Integer)getSqlMapClientTemplate().insert("add",man);
    }

    @Override
    public void remove(SimpleMan entity) {
        getSqlMapClientTemplate().delete("remove",entity);
    }


}
