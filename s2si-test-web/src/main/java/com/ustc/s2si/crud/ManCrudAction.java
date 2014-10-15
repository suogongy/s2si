package com.ustc.s2si.crud;

import com.opensymphony.xwork2.ActionSupport;
import com.ustc.s2si.entity.SimpleMan;
import com.ustc.s2si.service.SimpleManService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rudy on 2014/10/14.
 */
public class ManCrudAction extends ActionSupport{

    private int id;

    private SimpleMan entity;

    private List<SimpleMan> mans = new ArrayList<SimpleMan>();

    @Autowired
    private SimpleManService simpleManService;

    public String find(){
        SimpleMan entity = simpleManService.findById(id);
        mans.add(entity);
        return SUCCESS;
    }

    public String add(){
        simpleManService.add(entity);
        return SUCCESS;
    }

    public String del(){
        simpleManService.delete(id);
        return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SimpleMan getEntity() {
        return entity;
    }

    public void setEntity(SimpleMan entity) {
        this.entity = entity;
    }

    public List<SimpleMan> getMans() {
        return mans;
    }

    public void setMans(List<SimpleMan> mans) {
        this.mans = mans;
    }
}
