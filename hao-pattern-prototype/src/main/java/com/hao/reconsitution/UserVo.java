package com.hao.reconsitution;

import com.hao.simple.Prototype;

/**
 * Created by Keeper on 2019-03-22
 */
public class UserVo{
    private String myName;
    private int myAge;
    private String myClassName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyClassName() {
        return myClassName;
    }

    public void setMyClassName(String myClassName) {
        this.myClassName = myClassName;
    }

    public UserEntity clone() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(this.getMyName());
        userEntity.setAge(this.getMyAge());
        userEntity.setClassName(this.getMyClassName());
        return userEntity;
    }
}
