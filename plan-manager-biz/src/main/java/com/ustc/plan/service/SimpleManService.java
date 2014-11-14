package com.ustc.plan.service;

import com.ustc.plan.entity.SimpleMan;

import java.util.List;

/**
 * Created by Rudy on 2014/10/14.
 */
public interface SimpleManService {

    List<SimpleMan> findAll();

    SimpleMan findById(int id);

    int add(SimpleMan entity);

    void delete(int id);
}
