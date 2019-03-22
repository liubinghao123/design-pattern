package com.hao.simple;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Keeper on 2019-03-22
 */
public class Teacher implements Prototype, Serializable {
    private String name;
    private Integer age;
    private List<?> hobbies;

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

    public List<?> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<?> hobbies) {
        this.hobbies = hobbies;
    }

    public Prototype clone() {
        Teacher teacher = new Teacher();
        teacher.setAge(this.getAge());
        teacher.setName(this.getName());
        teacher.setHobbies(this.getHobbies());
        return teacher;
    }
}
