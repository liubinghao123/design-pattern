package com.hao.proxy.simple.datasource;

import java.util.Date;

/**
 * Created by Keeper on 2019-03-23
 */
public class User {
    private String name;
    private Integer age;
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
