package com.ustc.plan.entity;

import java.io.Serializable;

/**
 * Created by Rudy on 2014/10/14.
 */
public class SimpleMan implements Serializable {

    private int Id;
    private String Name;
    private int Age;
    private String Sex;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
