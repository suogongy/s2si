package com.ustc.plan.crud;

import com.opensymphony.xwork2.ActionSupport;
import com.ustc.plan.entity.SimpleMan;
import com.ustc.plan.service.SimpleManService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rudy on 2014/10/15.
 */
public class ManListAction extends ActionSupport {

    @Autowired
    private SimpleManService simpleManService;

    private List<SimpleMan> mans = new ArrayList<SimpleMan>();

    public String execute(){
        mans = simpleManService.findAll();
        return SUCCESS;
    }

    public List<SimpleMan> getMans() {
        return mans;
    }

    public void setMans(List<SimpleMan> mans) {
        this.mans = mans;
    }
}
