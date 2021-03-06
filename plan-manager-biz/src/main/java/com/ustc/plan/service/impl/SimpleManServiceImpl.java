package com.ustc.plan.service.impl;

import com.ustc.plan.dao.SimpleManDao;
import com.ustc.plan.entity.SimpleMan;
import com.ustc.plan.service.SimpleManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rudy on 2014/10/14.
 */
@Service
public class SimpleManServiceImpl implements SimpleManService {

    @Autowired
    private SimpleManDao simpleManDao;

    @Override
    public List<SimpleMan> findAll() {
        List<SimpleMan> mans = simpleManDao.findAll();
        return mans;
    }

    @Override
    public SimpleMan findById(int id) {
        return simpleManDao.findById(id);
    }

    @Override
    public int add(SimpleMan entity) {
        return simpleManDao.add(entity);
    }

    @Override
    public void delete(int id) {
        SimpleMan entity = simpleManDao.findById(id);
        simpleManDao.remove(entity);
    }
}
