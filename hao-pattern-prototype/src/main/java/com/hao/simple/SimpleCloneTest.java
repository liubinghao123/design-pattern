package com.hao.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keeper on 2019-03-22
 */
public class SimpleCloneTest {
    public static void main(String[] args){
        Teacher teacherA = new Teacher();
        teacherA.setAge(10);
        teacherA.setName("jack");
        List<?> hobbies = new ArrayList();
        teacherA.setHobbies(hobbies);
//        Teacher teacherB = (Teacher) teacherA.clone();

        Client client = new Client();
        Teacher teacherB = (Teacher) client.clone(teacherA);

        System.out.println("teacherA 的内存地址： " + teacherA.hashCode());
        System.out.println("teacherB 的内存地址： " + teacherB.hashCode());

        System.out.println("teacherA 引用类型的内存地址：" + teacherA.getHobbies().hashCode());
        System.out.println("teacherB 引用类型的内存地址：" + teacherB.getHobbies().hashCode());

        System.out.println(teacherA.getHobbies() == teacherB.getHobbies());
    }
}
